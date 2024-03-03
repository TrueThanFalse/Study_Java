package Day08;

public class _04_MethodOverloading {

	public static void main(String[] args) {
		
		/* 메서드 오버로딩(Method Overloading)
		 * - 동일한 이름의 메서드를 여러개 만드는 것
		 * 1. 매개변수의 개수가 다르면 가능
		 * 2. 매개변수의 자료형(종류)이 다르면 가능
		 * 위 둘 중 하나만 만족하면 가능
		 * 리턴타입은 상관 없음
		 * 매개변수명도 상관 없음
		 */
		
		System.out.println(sum(1.2,3.5));
		
		int sum = sum1(1,2,3,4,5);
		System.out.println(sum);

	}
	
	// 더하기 메서드 예시
	
	public static int sum(int num1, int num2) {
		return num1+num2;
	}
	// 매개변수의 개수가 달라서 오버로딩 되는 경우
	public static int sum(int num1, int num2, int num3) {
		return num1+num2+num3;
	}
	//매개변수 자료형이 달라서 오버로딩 되는 경우
	public static double sum(double num1, double num2) {
		return num1+num2;
	}
	public static double sum(int num1, double num2) {
		return num1+num2;
	}
	
	/* 가변길이 메서드
	 * 피연산자의 값이 일정하지 않을 경우, 매개변수의 개수와 상관 없이 매개값을 줄 때 이용
	 */
	
	public static int sum1(int ...num) { // ... => 스프레드 : 나열하겠다
		int sum = 0;
		// num을 배열처럼 인식 함
		for(int i=0; i<num.length; i++) {
			sum += num[i];
		}
		return sum;
	}
	
	
	
}
