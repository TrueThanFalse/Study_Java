package Day09;

import java.util.Scanner;

public class _05_과제 {

	public static void main(String[] args) {
		
		/* 클래스 객체 생성 (2명)
		 * 값을 입력 후 정보를 출력 (2명)
		 */
		
		Student human1 = new Student();
		human1.print(); // class 멤버변수는 자동 초기화로 실행은 되나 null과 0으로 출력 됨
		
		human1.setName("유재석");
		human1.setAge(45);
		human1.setCallNumber("01026269595");
		human1.setAddress("인천광역시");
		human1.print();
		System.out.println(human1.getAddress());
		
		System.out.println("-----");
		
		human1.input("김철수", 13, "010-4444-3333", "대전광역시");
		human1.print();
		
		System.out.println("-----");
		
		Student human2 = new Student();
		human2.setName("양세찬");
		human2.setAge(35);
		human2.setCallNumber("01077882233");
		human2.setAddress("부산광역시");
		human2.print();
		System.out.println(human2.getAddress());
		
		System.out.println("-----");
		
		Student human3 = new Student("하동훈", 34, "010-8888-4444", "제주특별시");
		human3.print();
		
		System.out.println("-----");
		
		Student human4 = new Student("홍길동", 5);
		human4.print();
		
		System.out.println("-----");
		
		
		Student s = new Student();
		Scanner scan = new Scanner(System.in);
		System.out.println("이름>");
		s.setName(scan.next());
		System.out.println("나이>");
		s.setAge(scan.nextInt());
		System.out.println("전화번호>");
		s.setCallNumber(scan.next());
		System.out.println("주소>");
		s.setAddress(scan.next());
		scan.close();
		

	}

}

/* 클래스 생성
 * 학생 클래스 생성
 * 이름, 나이, 전화번호, 주소
 * 출력할 때 양식
 * 이름(나이) 전화번호
 */

class Student{
	private String name;
	private int age;
	private String callNumber;
	private String address;
	
	/* 생성자 위치 => 반드시 멤버 변수 직후
	 * 생성자 오버로딩 가능
	 * 오버로딩 조건 => 매개변수 개수가 다르거나, 매개변수 유형이 다르거나
	 */
	
	/* 생성자를 만들면 컴파일러가 기본 생성자를 만들지 않는다
	 * 따라서 기본 생성자 코드를 작성하여 기본 생성자를 만들어 주는 것이 좋다
	 */
	public Student() {} // 기본 생성자 : 컴파일러가 자동으로 생성해주는 생성자
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public Student(String name, int age, String callnumber, String address) {
		// 생성자 호출 위치 : 반드시 첫줄에서만 가능
		this(name, age); // 첫줄이 아닌 2번째 줄 이후로 호출하면 error 발생
		this.callNumber = callnumber;
		this.address = address;
	}
	
	
	public void print() {
		System.out.println(name+"("+age+")"+" "+callNumber);
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

	public String getCallNumber() {
		return callNumber;
	}

	public void setCallNumber(String callNumber) {
		this.callNumber = callNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public void input(String name, int age, String tel, String addr) {
		this.name = name;
		this.age = age;
		this.callNumber = tel;
		this.address = addr;
	}
}

