package Day06;

import Day05._01_Array02;

public class _03_Mathod02 {

	public static void main(String[] args) {
		
		/* 메서드를 활용하여 계산기를 작성
		 * 
		 * 메서드는 + - * % /
		 * 두 정수가 주어지면 두 정수의 연산을 하는 메서드를 작성
		 *  + 일때 호출 => 메인에서 출력
		 *  - 일때 호출 => 메인에서 출력
		 *  * 일때 호출 => 메서드에서 출력
		 *  / 일때 호출 => 메서드에서 출력 => return을 double로
		 *  & 일때 호출 => 메서드에서 출력
		 */
		 
		System.out.println(add(10,3));
		System.out.println(minus(10,3));
		mul(10,3);
		divi(10,3);
		int a = remainder(10,3);
		System.out.println(a);
		
		/* 다른 클래스에 있는 메서드를 사용 (static 있는 경우)
		 * 클래스명.메서드명
		 *
		 * 클래스 => 정의서(설명서) => 객체를 생성해서 메서드를 사용 하는 것이지 클래스를 사용하는 것이 아니다.
		 * 현재 시점에서 객체 생성 없이 메서드를 사용할 수 있는 이유 => static
		 * 
		 * (static이 없는 경우) : 선언만 해놓고 생성이 안되어 있다는 것을 의미
		 * 객체를 생성해야 함 => 클래스가 필요
		 * Method02 me = new Method02();
		 * int s = me.add(20, 30);
		 */
		
		_03_Mathod02 me = new _03_Mathod02();
		int s = me.add(20, 30);
		System.out.println(s);
		
		
		
		
	
				
		
	}
	
	// Method 정의
	
	public static int add(int num1, int num2) {
		return num1 + num2;
	}
	
	public static int minus(int num1, int num2) {
		return num1 - num2;
	}

	public static void mul(int num1, int num2) {
		System.out.println(num1 * num2);
		return;
	}
	
//	public static void divi(double num1, double num2) {
//		System.out.println(num1 / num2);
//		return;
//	}
	
	// 선생님 답안
	public static double divi(int num1, int num2) {
		
		return (double)num1 / num2;
		
	}
	
	public static int remainder(int num1, int num2) {
		
		return num1 % num2;
	}
	
	
}
