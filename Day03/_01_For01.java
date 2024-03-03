package Day03;

public class _01_For01 {

	public static void main(String[] args) {
		
		
		/* 반복문 : 규칙적인 작업을 반복적으로 할 때 사용하는 문법
		 * for, while, do~while
		 * - for문 과 while문은 동작 방식이 같다. => 조건에 만족 하지 않으면 한번도 실행 안될 수 있음.
		 * - do~while문은 위 두 방식과 동작 방식이 조금 다르다. => 조건에 만족 하지 않아도 무조건 1번 실행. ★
		 * 
		 * for(초기화 ; 조건식 ; 증갑식) {
		 * 		실행문;
		 * }
		 * 
		 * - 초기화 : 조건식이나 실행문에서 사용할 변수를 초기화, 처음 1번만 실행, 생략 가능
		 * - 조건식 : 반복문의 반복을 결정하는 식(true => 반복, false => 탈출), 생략 가능(항상 true)
		 * - 증감식 : 조건식에서 사용되는 변수를 증가 & 감소 시켜 반복 횟수를 조절
		 */
		
		
		/* 1~10까지 출력 하는 예제
		 * 초기화 : i변수 사용 => int i = 1;
		 * 조건식 : 10이 될 때까지 => i <= 10
		 * 증감식 : i++ // 만약 2씩 증가 하고 싶다면? i = i + 2;
		 * 실행문 : i 출력
		 */		
				
		for(int i = 1 ; i <= 10 ; i++ ) {
			System.out.print(i + " ");
		}
		System.out.println(); // 줄바꿈 용도
		System.out.println("---------");
		
		for(int i=10 ; i>=1 ; i--) { // 조건식 : 10 >= 1
			System.out.print(i + " ");
		}
		System.out.println(); // 줄바꿈 용도
		System.out.println("---------");
		
		// 2부터 10까지 짝수만 출력
		
		for(int i=2 ; i<=10 ; i=i+2) {
			System.out.print(i + " ");
		}
		System.out.println(); // 줄바꿈 용도
		System.out.println("---------");
		
		/* 1부터 20까지 중 짝수만 출력
		 * if문을 사용하여 조건에 맞는 자료만 출력
		 */
		
		for(int i=1 ; i<=20 ; i++) {
			if(i % 2 == 0) { // i % 2 == 1 => 홀수만 출력
				System.out.print(i + " ");
			}
		}
		System.out.println(); // 줄바꿈 용도
		System.out.println("---------");
		
		// 1부터 10까지 홀수만 출력, 짝수일때는 pass 출력
		
		for(int i=1 ; i<=10 ; i++) {
			if(i % 2 == 1) {
				System.out.print(i + " ");
			}else {
				System.out.print("pass ");
			}
		}
		System.out.println(); // 줄바꿈 용도
		System.out.println("---------");
		
		/* 1부터 10까지 합계를 출력
		 * 초기화 : 1부터, 조건식 : 10까지, 증감식 : 1씩 증가
		 * 실행문 : 누적되는 더하기
		 * 반복문 실행 후 출력
		 * 지역변수는 { } 내부에서만 생성되고 소멸 됨
		 */
		
		int sum = 0;
		for(int i=1; i<=10; i++) {
			sum = sum + i ; // 0+1 => 1+2 => 3+3...
			System.out.print(sum + " "); // 증가 되는 과정을 볼 수 있음
		}
		System.out.println();
		System.out.print(sum); // 55
		
		System.out.println(); // 줄바꿈 용도
		System.out.println("---------");
		
		/* 문제. 1부터 10까지 짝수의 합과 홀수의 합을 출력
		 * 위 문제를 풀이하면
		 * for 1부터, 10까지, 1씩 증가하여 값을 비교
		 * if	홀수인지 판단 => 홀수의 합계
		 * 		짝수인지 판단 => 짝수의 합계
		 * for문 종료 후 출력
		 */
		
		int sumOdd = 0; // 홀수(odd number)
		int sumEven = 0; // 짝수(even number)
		for(int i=1; i<=10; i++) {
			if(i % 2 == 1) {
				sumOdd = sumOdd + i;
			}else if(i % 2 == 0) {
				sumEven = sumEven + i;
			}
		}
		System.out.println("홀수의 합: " + sumOdd); // 25
		System.out.println("짝수의 합: " + sumEven); // 30
		System.out.println("---------");


			


		
		
		
	}
}

