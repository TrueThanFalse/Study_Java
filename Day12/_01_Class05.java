package Day12;

public class _01_Class05 {

	public static void main(String[] args) {
		
		/* static이 붙은 멤버변수 / 메서드 => 클래스 멤버변수 / 메서드라고 한다.
		 * static이 안 붙은 멤버변수 / 메서드 => 인스턴스(객체) 멤버변수 / 메서드라고 한다.
		 * 
		 * - 객체 멤버변수/메서드 들은 객체를 통해 사용되고, 생성된다.
		 * - 각 객체마다 독립적으로 변수/메서드가 사용된다.
		 * 
		 * - 클래스 멤버변수/메서드는 클래스를 통해 사용된다.
		 * - 클래스명.변수/메서드 호출
		 * (객체를 통해서 호출이 가능하나 일반적이지 않다)
		 * - 클래스 멤버변수는 하나의 멤버변수를 모든 객체가 공유(사용)한다.
		 * - 모든 객체들이(하나의 클래스를 통해 생성되는 모든 객체) 동일한 값을 사용한다면 static을 붙이는것을 고려
		 * 
		 * 클래스/객체 변수들은 생성 시점이 달라서 메서드에서 사용될 수 있는 환경이 다르다.
		 * - 객체 멤버는 이미 클래스가 생성된 후에 생성 / 클래스의 멤버 메서드를 객체에서 사용할 수 있다.
		 * - 클래스 멤버 변수는 클래스/객체의 멤버에서 모두 사용 가능하다.
		 * - 클래스 멤버 메서드는 클래스/객체의 멤버에서 모두 사용 가능하다.
		 * - 객체 멤버 변수는 클래스 멤버 메서드에서 사용할 수 없다. ★ (객체를 생성 해야지만 사용 가능)
		 * - 객체 멤버 메서드도 클래스 멤버 메서드에서 사용할 수 없다. ★ (객체를 생성 해야지만 사용 가능)
		 */

		TV.printBrand(); // 멤버변수 power가 생성되지 않은 시점
		TV t = new TV(); // 멤버변수 power 생성
		t.isPower();
		t.printBrand(); //클래스 멤버 메서드 호출(잘 쓰지 않음) : 굳이 static을 객체를 생성해서 사용하지 않음
		TV.printBrand(); //클래스명.메서드명으로 호출
		// -> power가 생성되어 power도 출력되지만 위쪽처럼 생성되지 않은 시점이 존재 할 수 있으므로 애초에 작성이 불가능하다.
		
	}

}


class TV{
	
	private boolean power;
	// final : 수정 할 수 없다. // 굵어짐
	// static : 기울어짐
	private static final String brand = "Samsung";
	
	public void isPower() {
		System.out.println("제조사: "+brand);
		if(!power) {
			power = true;
			System.out.println("Tv가 켜졌습니다.");
		}else {
			power = false;
			System.out.println("Tv가 꺼졌습니다.");
		}
	}
	
	public static void printBrand() {
		System.out.println("제조사: "+brand);
		// 클래스 메서드에서 객체 변수를 사용 할 수 없음.
		// System.out.println("전원 상태: "+power); => 멤버변수 power에 static이 없어서 사용 불가능
	}
	
	
}
