package Day15;

public class _01_다형성01 {

	public static void main(String[] args) {
		
		/* 다형성 : 하나의 코드가 여러 자료형을 구현되어 실행되는 것
		 * 객체지향 프로그램의 4가지 특징
		 *  - 추상화, 캡슐화, 상속, 다형성
		 *  - 각각의 객체는 독립된 단위의 객체
		 *  - 프로그램은 독립적인 객체들을 모아서 처리하는 모임
		 *  -독립적인 객체들이 메시지(매개변수, 리턴타입)를 주고 받으면서 데이터를 처리
		 *  
		 *  - 추상화(Abstraction) 
		 *  	- 핵심적인 코드만 보여주기
		 *  	- 불필요한 코드는 숨기기
		 *  	- 인터페이스와 구현을 분리
		 *  
		 *  - 캡슐화(Encapsulation) : 데이터 보호(정보 은닉)
		 *  	- 멤버변수를 보호하며 처리(getter/setter)를 통해 처리
		 *  	- 멤버변수의 값은 숨기고 메서드로 접근
		 *  	- 은닉화 : 객체의 내부 정보를 숨겨서 외부로 드러나지 않아야 한다 => 외부에서 직접 객체에 접근하는 것을 방지
		 *  
		 *  - 상속(inheritance) : 코드 재사용(확장)
		 *  	- 클래스를 상송 받아 수정하여 사용하게 되면 중복 코드를 줄일 수 있다
		 *  
		 *  - 다형성(polymorphism) : 객체 변경 용이
		 *  	- 같은 코드에서 여러 다른 결과를 얻을 수 있음
		 *  	- 다형성을 잘 활용하면 유연하고 확장성 있는 유지보수가 편리한 프로그램을 만들 수 있음
		 */

		
		A a = new A();
		a.num = 10;
		System.out.println(a);
		
		B b = new B();
		b.num = 20;
		System.out.println(b);
		
		// 부모 선언 = 자식 객체 생성
		A ab = new B();
		ab.num = 30;
		System.out.println(ab);
		
	}

}


class A{
	int num;

	@Override
	public String toString() {
		return "A [num=" + num + "]";
	}
	
}

class B extends A{
	
}

