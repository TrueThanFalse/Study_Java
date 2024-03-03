package Day02;

public class _02_IF01 {

	public static void main(String[] args) {
	

		/* 조건문 : 조건식이 참일 때 실행문을 실행하는 문
		 * 조건식은 항상 true 혹은 false로 귀결 되도록 작성
		 * if문, switch문
		 * if(조건식) {
		 *  실행문;
		 *  }
		 * 실행문이 한줄일 경우 { } 생략 가능. 하지만 꼭 넣어서 코드 혼란을 줄입시다.
		 * if문 : 조건식이 참일 때 실행문을 실행, 거짓이면 else문을 실행
		 */
		
		int num = 10;
		
		// num이 0보다 크면 양수
		
		if(num > 0) {
			System.out.println("양수");			
		}
		
		// num이 0보다 크면 양수, 아니면 음수
		
		if(num > 0) {
			System.out.println("양수");
		} else {
			System.out.println("음수");
		}
		
		// num이 0보다 크면 양수, 아니면 음수, 0이면 0
		
		if(num>0) {
			System.out.println("양수");
		} else if (num == 0) {
			System.out.println("0");
		} else {
			System.out.println("음수");
		}
		
		// num이 0보다 크면 양수 (10보다 크면 10보다 큽니다), 아니면 음수, 0이면 0
		
		num = 15;
		
		if(num > 10) {
			System.out.println("10보다 큽니다");
		} else if(num > 0) {
			System.out.println("양수");
		} else if(num == 0) {
			System.out.println("0");
		} else {
			System.out.println("음수");
		}
		
		// 선생님 답안
		if(num > 0) {
			System.out.println("양수");
			if(num > 10) {
				System.out.println("10보다 큽니다");
			}
		}else if(num < 0) {
			System.out.println("음수");
		}else {
			System.out.println("0");
		}
		
		// 문제. num2 값을 저장하고 num2가 짝수인지 홀수인지 출력하시오.
		
		int num2 = 8;
		System.out.println((num2 % 2 == 0) ? "짝수" : "홀수"); // 3항 연산자
		
		if(num2 % 2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
	
		
	}

}
