package Day03;

import java.util.Scanner;

public class _04_For04 {

	public static void main(String[] args) {
	
		
		/* 최대 공약수 찾기
		 * 약수란? 1부터 자기자신까지 나누어서 떨어지는 수
		 * 공약수란? 두 정수의 공통된 약수
		 * 최대공약수란? 공약수 중 가장 큰 수
		 * 
		 * 8의 약수 : 1 2 4 8 => num1 % i == 0
		 * 12의 약수 : 1 2 3 4 6 12 => num2 % i == 0
		 * 공약수 : 1 2 4
		 * 최대공약수 : 4
		 */
		
		// 문제. 두 정수 num1과 num2를 입력 받아 최대 공약수를 출력
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("숫자(정수)를 입력하세요.");
//		int num1 = scan.nextInt();
//		System.out.println("숫자(정수)를 입력하세요.");
//		int num2 = scan.nextInt();
//		int k; //공약수
//		int p; //공약수
//		int m; //최대공약수
//		
//		for(int i=1; i<=num1; i++) {
//			if(num1 % i == 0) {
//				k = i;
//				for(int j=1; j<=num2; j++) {
//					if(num2 % j == 0) {
//						p = j;
//					}
//				}
//			}
//		}
//		scan.close();

		
		// 선생님 답안
		Scanner scan = new Scanner(System.in);
		System.out.println("두 정수를 입력하세요.");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int gcd = 0; // 최대 공약수
		for(int i=1; i<=num1; i++) { // 조건식은 두 수 중 아무거나 넣어도 공약수 최대 값은 동일함
			if(num1 % i == 0 && num2 % i == 0) { // i => 공약수
				gcd = i; // i는 계속 증가하고 공약수가 있다면 다시 저장하면 최대공약수				
			}
		}
		System.out.println("최대공약수" + gcd);
		
		/* 반복문에서 조건이 맞다면 바복문을 빠져나오는 역할 : break;
		 * 중첩 for문 일 경우, if문을 포함하는 가장 가까운 for문만 벗어날 수 있음
		 * 벗어나고 싶은 for문에 닉네임을 지어 해당 닉네임의 for문을 바로 벗어날 수 있음
		 */
		for(int i = num1; ; i--) { // 조건식이 빈칸이면 항상 true => 무한루프
			if(num1 % i == 0 && num2 % i == 0) {
				System.out.println("두 수의 최대공약수: " + i);
				break;
			}
		}
		
		int i=0;
		a: for(;;) { // a 닉네임을 명하여 첫 for문을 탈출하여 무한루프를 방지 가능
			for(;;) {
				for(;;) { // a 닉네임 없으면 이 for문을 탈출함
					i++;
					if(i == 10) {
						System.out.println(i+"벗어남");
						break a; // a 닉네임을 주면 a:for문에서 탈출
								//a가 없다면 if와 가장 가까운 for문을 탈출
					}
				}
			}
		}

	}

}
