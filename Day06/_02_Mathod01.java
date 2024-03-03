package Day06;

public class _02_Mathod01 {
	
	// 메서드 선언 위치
	
	public static void main(String[] args) {
		
		/* 메서드 : 기능 & 함수
		 * 접근제어자(접근제어자) : 접근할 수 있는 주체의 제한 범위
		 * 리턴타입 : 메서드의 실행 결과로 받을 정보의 값(반드시 자료형)
		 * 메서드명 : 메서드의 이름 => 소문자로 시작 // 오직 클래스명만 대문자로 시작
		 * 매개변수 : 매서드를 실행하기 위해 필요로 하는 값(자료형 변수명)
		 * 
		 * 메서드 선언 구현
		 * 접근제어자 리턴타입 메서드명(매개변수, 매개변수, 매개변수...) {
		 * 구현;
		 * }
		 * 
		 * 메서드 선언 위치
		 * 클래스 안, 다른 메서드 밖
		 */
		
		int sum = sum(3,5);
		System.out.println(sum);
		
		int sum2 = sum(sum, 5);
		System.out.println(sum2);
		
		int mul = mul(5,5);
		System.out.println(mul);
		System.out.println(mul(5,5));
		
		sum2(10,20);

	}
	
	// 메서드 선언 위치
	
	/* 메서드 만들기
	 * 기능 : 두 정수가 주어지면 두 정수의 합을 알려주는 메서드
	 * 리턴타입 : 돌려줘야 하는 값 => 합 (int)
	 * 매개변수 : 두 정수 => int num1, nut num2
	 * 메서드명 : sum
	 */
	
	public static int sum(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}
	
	/* 기능 : 두 정수가 주어지면 두 정수의 곱을 알려주는 메서드
	 * 리턴타입 : 곱셈 => int
	 * 매개변수 : 두 정수 => int num1, int num2
	 * 메서드명 : mul
	 */
	
	public static int mul(int num1, int num2) {
		return num1 * num2;
	}
	
	/* 기능 : 두 정수가 주어지면 두 정수의 합을 출력
	 * 리턴타입 : 없음(void) 
	 * 매개변수 : 두 정수 => int num1, int num2
	 * 메서드명 : sum2
	 */
	
	public static void sum2(int num1, int num2) {
		System.out.println(num1+num2);
		return; // return : 결과를 돌려주는 역할도 하지만 메서드를 종료하는 역할도 함
	}
	
	
	
	
	
	
	
	
	
	
}
