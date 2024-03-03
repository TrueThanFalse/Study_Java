package Day01;

public class _03_연산자 {

	public static void main(String[] args) {
	

		/* 대입 연산자 : =, +=, -=
		 * = 을 기준으로 우측에 있는 값을 좌측의 변수에 저장. (덮어쓰기 가능)
		 * a = b : b를 a에 저장하라
		 * a는 반드시 변수여야 함. b는 값 혹은 변수 가능. 즉 1 = a 불가능.
		 * a += 1; => a = a + 1; 동일하다. 즉 기존의 a 값에 1을 더해서 a에 저장하라
		 */
		
		int a = 1;
		System.out.println(a); // 1
		a = a + 1;
		System.out.println(a); // 2
		a += 1;
		System.out.println(a); // 3
		a -= 1;
		System.out.println(a); // 2
		
		int b = 10;
		a = b; // a = 10
		System.out.println(a); // 10
		b -= 3;
		System.out.println(b); // 7
		b -= 2;
		System.out.println(b); // 5
		
		// 증감 연산자 : ++ (1증가), -- (1감소) // ++,-- 위치도 중요.
		a++; // => a = a + 1;
		
		System.out.println(a); // 11
		System.out.println(a++); // 11 => 출력 후 1 증가.
		System.out.println(a); // 12
		System.out.println(++a); // 13 => 1 증가 후 출력.
		
		// 산술 연산자 : +, -, *, /, %(나머지)
		/* 나누기(/) 관련 정보
		 * 정수 / 정수 = 정수 ( 10 / 3 = 3) 즉, 소수점을 버린다.
		 * 정수 / 실수 = 실수 ( 10 - 3.0 = 3.33333...) 실수가 하나라도 들어가면 실수로 출력 됨.
		 * 실수 / 정수 = 실수
		 * 실수 / 실수 = 실수
		 * 값 / 0 => 예외발생(Exception)
		 */
		
		System.out.println("3+2="+(3+2)); // 5
		System.out.println("3-2="+(3-2)); // 1
		System.out.println("3*2="+(3*2)); // 6
		System.out.println("3/2="+(3/2)); // 1 (정수 / 정수 = 정수)
		System.out.println("3%2="+(3%2)); // 1
		
		// ★ 비교연산자 : 비교연산의 결과는 반드시 true 혹은 false로 귀결 된다.
		/* >= (이상), <= (이하), > (초과), < (미만)
		 * == (같다), != (같지 않다)
		 * && (and) : 둘 다 true 여야 true 리턴
		 * || (or) : 둘 중 하나만 true 면 true 리턴
		 */
		
		System.out.println("3>2 ? "+(3>2)); // true
		System.out.println("3<2 ? "+(3<2)); // false
		System.out.println("3==2 ? "+(3==2)); // false
		System.out.println("3!=2 ? "+(3!=2)); // true
		
		// 조건 선택 연산자 : 3항 연산자
		// (조건식) ? true : false;
		
		System.out.println((3>2) ? "참 입니다" : "거짓 입니다"); // 참
		System.out.println((3<2) ? "참 입니다" : "거짓 입니다"); // 거짓
		
		// 문제 2 : num에 값을 넣고 num이 짝수인지 홀수인지 출력 (조건 선택 연산자를 활용 할 것)
		// 짝수란 2로 나누어서 나머지가 0인 값
		
		int num = 5;
		System.out.println((num % 2 == 0) ? "짝수" : "홀수"); // 홀수
		num = 6;
		System.out.println((num % 2 == 0) ? "짝수" : "홀수"); // 짝수
		
		// String : 문자열을 저장하는 클래스
		String result = (num % 2 == 0) ? "짝수" : "홀수"; // 짝수
		System.out.println(num + "는 " + result);
		
		
				
	}

}
