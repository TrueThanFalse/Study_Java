package Day17;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _07_List02Solution {

	public static void main(String[] args) {
		
		FoodManager2 fm = new FoodManager2(); // add 완료
		System.out.println(fm.getList1());
		System.out.println(fm.getList2());
		
		ArrayList<Integer> order = new ArrayList<Integer>();
		ArrayList<Integer> count = new ArrayList<Integer>();
		
		Scanner scan = new Scanner(System.in);
		
		int menu = -1;
		do {
			fm.printMenu(); // 메뉴 출력
			menu = scan.nextInt(); // 메뉴 입력 받기
			// 1~5 일반 메뉴, 6 프로그램 종료, 0 메뉴 선택 끝
			if(menu == 0) {
				System.out.println("프로그램 종료");
				break;
			}
			if(menu != 0) {
				if(menu < 6) {
					System.out.println("수량 >");
					int cnt = scan.nextInt();
					order.add(menu);
					count.add(cnt);
					fm.sale(menu, cnt);
					System.out.println("주문 종료>0, 프로그램 종료>6");
				}else {
					System.out.println("잘못된 메뉴입니다.");
				}
			}
		}while(menu != 0); // 메뉴 주문의 종료 시점 결정
		// 메뉴 전체 금액을 출력
		// 피자 3개 => order = 2, count = 3
		System.out.println("--- 메뉴 확인 ---");
		for(int i=0; i<order.size(); i++) {
			System.out.print(fm.getList1().get(order.get(i)-1)+" ");
			System.out.print(count.get(i)+"개");
			int price = fm.getList2().get(order.get(i));
			System.out.println(" "+(price * count.get(i)));
		}
		System.out.println("총 금액: "+fm.getTotalSum());
		
	}

}

class FoodManager2{
	
	private List<String> list1 = new ArrayList<String>(); // 메뉴
	private List<Integer> list2 = new ArrayList<Integer>(); // 가격
	private int sum;
	private int totalSum;
	
	public FoodManager2() {
		add();
	}
	
	public void printMenu() {
		System.out.println("--- menu ---");
		System.out.println("1. 햄버거:7000");
		System.out.println("2. 피자:15000");
		System.out.println("3. 음료수:2000");
		System.out.println("4. 과자:1000");
		System.out.println("5. 사탕:500");
		System.out.println("메뉴 선택>");

	}
	
	public void add() {
		// list에 값을 추가하는 메서드
		list1.add("햄버거");
		list1.add("피자");
		list1.add("음료수");
		list1.add("과자");
		list1.add("사탕");
		list2.add(7000);
		list2.add(15000);
		list2.add(2000);
		list2.add(1000);
		list2.add(500);
	}
	
	public void sale(int menu, int count) {
		// menu는 list2의 index-1 번호로 사용
		sum = list2.get(menu-1) * count; // 하나의 주문에 대한 금액
		totalSum += sum;
		System.out.println("---------------");
		System.out.println("주문하신 메뉴는 "+list1.get(menu-1)+" "+count+"개 입니다.");
		System.out.println("금액: "+sum);
	}

	public List<String> getList1() {
		return list1;
	}

	public void setList1(List<String> list1) {
		this.list1 = list1;
	}

	public List<Integer> getList2() {
		return list2;
	}

	public void setList2(List<Integer> list2) {
		this.list2 = list2;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public int getTotalSum() {
		return totalSum;
	}

	public void setTotalSum(int totalSum) {
		this.totalSum = totalSum;
	}
	
	
	
}
