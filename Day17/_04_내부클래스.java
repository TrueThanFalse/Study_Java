package Day17;

public class _04_내부클래스 {

	public static void main(String[] args) {
		
		/* 내부 클래스 : 클래스 내부에 선언한 클래스
		 *  - 외부 클래스 -> 내부 클래스
		 *  - 다른 외부에서는 내부 클래스를 사용할 일이 없고 내부클래스가 외부 클래스와 밀접한 연관이 있을 경우 사용
		 *  - 내부적으로 사용할 목적으로 만드는 클래스이기 때문에 private 선언하는 것을 권장 함 -> 외부에서 접근하지 못하도록
		 *  - 내부 클래스가 생성되는 시기 : 외부클래스가 생성된 후 내부클래스가 생성 됨
		 * 익명(anonymous class) 내부 클래스 -> 익명클래스를 사용하기 위해 내부 클래스 사용
		 * 
		 * 
		 */
		
		A a = new A();
		a.outPrint();
		
//		B b = new B(); // private 이므로 생성 불가능

	}

}

// 외부클래스
class A{

	private int num = 10;
	private int num2 = 20;
	private B b;
	
	public A() {
		b = new B();
	}
	
	// 내부클래스
	class B{
		int inNum = 100;
		public void inPrint() {
			System.out.println("내부클래스 inNum: "+inNum);
			System.out.println("외부클래스 num: "+num);
			System.out.println("외부클래스 num: "+num2);
		}
	}
	
	public void outPrint() {
		b.inPrint(); // 내부 클래스의 객체 변수를 사용하여 메서드 호출
	}
}