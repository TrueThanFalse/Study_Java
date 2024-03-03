package Day13;

public class _01_추상클래스01 {

	public static void main(String[] args) {
		
		/* 추상클래스 : 추상메서드 + 일반메서드 + 멤버변수 + 상수(final)
		 * 추상클래스 = 미완성 클래스 => 객체를 생성할 수 없다.
		 * 추상메서드 : 메서드의 선언부만 있고 구현은 없는 메서드
		 * 
		 * 키워드 : abstract
		 * abstract 클래스명 / abstract 메서드명
		 * 
		 * abstract 리턴타입 메서드명(매개변수); => 추상메서드
		 * - 부모 클래스에서 상속을 받았을 때, 특정 메서드가 자식 클래스에서 자주 오버라이딩 될 때
		 * 해당 메서드를 추상 메서드로 작성
		 * - 상속을 받은 클래스에서 추상메서드가 있다먄 반드시 구현해야 한다.
		 * - 구현 하지 않으면 내 클래스도 추상 클래스가 됨
		 */

		Dog d = new Dog("뽀삐", "개과");
		d.printInfo();
		d.howl();
		
		// Cat 클래스가 추상클래스라서 Cat 객체를 만들 수 없다
//		Cat c = new Cat("치치", "고양이과"); 
		
		
	}

}


// 추상 클래스를 상속받는 DOG, CAT 클래스 생성
class Dog extends Animal{
	
	public Dog() {}
	public Dog(String name, String category) {
		super.name = name;
		super.category = category;
	}

	@Override
	public void howl() {
		// TODO Auto-generated method stub
		System.out.println("멍멍!");
	}
	
}


// 상속 받은 추상메서드를 구현하지 않으려면 자신의 클래스도 추상클래스여야 한다.
// 추상 클래스가 되면 객체를 만들 수 없다
abstract class Cat extends Animal{
	
	public Cat() {}
	public Cat(String name, String categoty) {
		super.name = name;
		super.category = categoty;
	} 
	
//	@Override
//	public void howl() {
//		// TODO Auto-generated method stub
//		System.out.println("야옹~");
//	}
	
}



abstract class Animal{ // 추상 클래스
	
	public String name;
	public String category;
	
	public void printInfo() {
		System.out.println("-----");
		System.out.println("이름: "+name);
		System.out.println("종류: "+category);
	}
	
	abstract public void howl(); // 추상 메서드
	
	
}
