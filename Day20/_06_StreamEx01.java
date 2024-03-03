package Day20;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class _06_StreamEx01 {

	public static void main(String[] args) {
	
		/* 여행 상품
		 * 여행 비용은 15세 이상은 100만, 15세 미만은 50만
		 * 고객 3명이 패키지 여행을 떠날때
		 * 1. 여행 비용 계산
		 * 2. 고객 명단 출력
		 * 
		 * 고객은 class로 생성.
		 * 3명의 고객은 ArrayList로 추가
		 * 
		 * 아래와 같이 고객 정보 출력하기
		 * 이름:이순신, 나이:40, 비용:100
		 * 이름:김순이, 나이:35, 비용:100
		 * 이름:이아들, 나이:10, 비용:50
		 * 총 여행경비: 250만원
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);

		StreamManager sm = new StreamManager();
		sm.basics();
		sm.printCustomerInfo();
		System.out.println("-----");
		sm.solution();
		System.out.println("-----");
		sm.agesort();
		
		// 20세 이상 성인만 이름을 정렬하여 출력
		
	}

}

class Travel implements Comparable<Travel>{
	
	private String name;
	private int age;
	private int price;
	
	public Travel(String name, int age) {
		this.name = name;
		this.age = age;
		if(age >= 15) {
			this.price = 100;
		}else if(age>=1 && age<=14) {
			this.price = 50;
		}else {
			System.out.println("Error : 나이 입력 오류 발생");
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "이름: " + name + ", 나이: " + age + ", 비용: " + price + "만원";
	}

	@Override
	public int compareTo(Travel o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name);
	}



	
	
	
	
}

class StreamManager{
	
	private ArrayList<Travel> list = new ArrayList<Travel>();
	
	public StreamManager() {}
	
	public void addCustomer(Scanner scan) {
		System.out.println("성함 입력>");
		String name = scan.next();
		System.out.println("나이 입력>");
		int age = scan.nextInt();
		list.add(new Travel(name, age));
		System.out.println("<<< 이름: "+name+", 나이: "+age+" 고객 등록 완료 >>>");
	}
	
	public void printCustomerInfo() {
		list.stream().forEach(n-> System.out.println(n));
		int sum = list.stream().mapToInt(n-> n.getPrice()).sum();
		System.out.println("총 여행 비용: "+sum+"만원");
	}
	
	public void basics() {
		list.add(new Travel("이순신", 40));
		list.add(new Travel("김순이", 35));
		list.add(new Travel("이아들", 10));
		list.add(new Travel("유재석", 47));
		list.add(new Travel("남궁딸", 13));
		list.add(new Travel("김남순", 35));
		list.add(new Travel("김가수", 35));
		list.add(new Travel("김다라", 35));
	}
	
	public void solution() {
		list.stream().forEach(n->{
			String name = n.getName();
			int age = n.getAge();
			int price = n.getPrice();
			System.out.println(name+" :"+age+"비용:"+price);
		});
		int sum = list.stream().mapToInt(n-> n.getPrice()).sum();
		System.out.println("총비용:"+sum+"만원");
	}
	
	public void agesort() {
		list.stream()
		.filter(n-> n.getAge() >= 20)
		.map(n-> n.getName())
		.sorted()
		.forEach(n-> System.out.println(n));
		
//		list.stream()
//		.filter(n-> n.getAge() >= 20)
//		.sorted()
//		.forEach(n-> {
//			String name = n.getName();
//			int age = n.getAge();
//			int price = n.getPrice();
//			System.out.println(name+" :"+age+"비용:"+price);
//		});
	}

	public ArrayList<Travel> getList() {
		return list;
	}

	public void setList(ArrayList<Travel> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "StreamManager [list=" + list + "]";
	}

	
	

	
	
}