package Day01;

public class _02_변수 {

	public static void main(String[] args) {
		

		/* 변수 선언
		 * 자료형(타입) 변수명;
		 * 
		 * 변수 선언 + 초기화
		 * 자료형(타입) 변수명 = 값;
		 */
		
		// System.out.println(); => syso + ctrl + space 단축키
		
		int num = 123; // 선인 + 초기화
		
		System.out.println(num); // 123
		
		num = 456; // '=' 이것은 대입 연산자. 우측에 있는 값을 왼쪽에 저장. (덮어쓰기)
		
		System.out.println(num); // 456
		
		int num1 = 55, num2 = 66, num3 = 88; // 노란색 밑줄은 변수 선언을 하였으나 그 변수를 사용 하지 않았을 때 발생. 쓸모 없이 메모리를 차지하는 것이므로 삭제를 요구 한다는 뜻.
		
		// 8개의 기본 자료형은 '지역 변수'. 지역 변수의 범위(scope)는 { } 내에서 유지 됨. { } 이후 메모리에서 삭제 됨.
		
		/* 지역 변수는 반드시 초기화 해야 한다. 즉, 선언만 하지 말고 초기화를 반드시 해주는 것이 좋다.
		int sum; (X)
		int sum = 0; (O)
		*/
		
		// 명령어도 기본적으로 { }를 가지고 있다. 명령어도 { } 내부에서 유지 됨. { } 이후 메모리에서 삭제 됨.
		
		int a = 30;
		if(true) {
			a = 50;
			System.out.println(a); // 50
		}
		System.out.println(a); // 50
		// if문이 true이므로 a 값은 50으로 저장 됨. 만약 if 문이 false이면 a 값은 30으로 유지 된다.
		
		a = 30;
		if(false) {
			a = 50;
			System.out.println(a);
		}		
		System.out.println(a); // 30
		// false이면 a 값은 30으로 유지 됨.
		
		// char 자료형 => 한 글자만 저장 가능. 아스키 코드만 저장 가능.
		// char 변수 = ' '; => '' 작은따옴표가 필수
		
		char ch = 'a'; // char ch = "a"; => 이것은 에러다. 왜? "" 문자열은 String 이므로.
		double dou = 3.0;
		byte b = 1;
		boolean boo = true; // boolean 예약어는 true 또는 false 만 저장 가능.
		
		// float 은 접미사 f & F 필수.
		float f = 1.2F;
		
		// long 은 접미사 l & L 필수.
		long lo = 1L;
		
		num2 = 010; // 8진수로 인식 => 0~7까지 인식, 8이 되면 10)
		num3 = 0x10; // 16진수로 인식 => 0~15까지 인식, 16이 되면 10)
		
		// 사칙연산 => +, -, *, /, %(나머지 연산)
		
		// 문제 1. 국어 점수(kor), 영어 점수(eng), 수학 점수(math) 변수를 선언하고 값을 입력 하여 세 점수의 합을 콘솔에 출력하시오.
		
		int kor, eng, math;
		kor = 33;
		eng = 45;
		math = 62;
		int sum = kor + eng + math;
		System.out.println(sum + "점"); // 연결연산자(+), 문자("")가 있다면 +를 연결연산자로 인식 함.
		System.out.println("합계 " + kor + eng + math + "점"); // 합계 334562점
		System.out.println("합계 " + (kor + eng + math) + "점"); // 합계 140점 => 숫자끼리 먼저 계산하도록 만들어 줄 것.
		
				
		
		
	}
	
	// num1 = 123;
	// { }를 벗어 났으므로 num1 은 선언 되지 않았다. 따라서 에러가 나온다.

	

}
