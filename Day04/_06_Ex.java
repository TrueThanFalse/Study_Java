package Day04;

import java.util.Scanner;

public class _06_Ex {

	public static void main(String[] args) {
		

		/* 소수 : 약수가 1과 나 자신의 수만 가지는 수
		 * 소수 => 3, 5, 7, 11 ,13 ,17 ......
		 */
		
		/* num를 입력 받아서 num가 소수인지 아닌지 판별
		 * ex) num = 13 => 소수입니다. 출력
		 *     num = 12 => 소수가 아닙니다. 출력
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자(정수)를 입력하세요.");
		int num = scan.nextInt();
		int k=0; // 약수의 개수
		
		for(int i=1; i<=num ;i++) {
			if(num%i == 0) {
				k++;
				}
		}
		if(k == 2) {
			System.out.println("소수입니다.");
		}else {
			System.out.println("소수가 아닙니다.");
		}
		
		scan.close();
		

		//선생님 답안.
		//입력 받은 수의 약수가 몇개인지 확인
		
		System.out.println("숫자(정수)를 입력하세요.");
		num = scan.nextInt();
		int count = 0;
		for(int i=1; i<=num; i++) {
			if(num % i == 0) {
				// System.out.println(i); 값을 출력 하려는 것이 아니라 개수를 알고 싶다.
				count = count + 1; // count++;
			}
		}
		// System.out.println(count); 약수의 개수가 출력
		if(count == 2) {
			System.out.println("소수다");
		}else {
			System.out.println("소수가 아니다");
		}
		
		// 2~100까지 중 소수를 출력
		
		
		count = 0;
		
		for(int i=2; i<=100; i++) { // number에 대한 수 2~100까지
			count = 0; // 각 number마다 약수의 개수를 0부터 재시작(초기화)
			for(int j=1; j<=i ;j++) { // 약수를 개수를 구하기 위한 반복 for문
				if(i%j == 0) { // 약수 인지 체크
					count++; // 약수의 개수
				}
			}
			if(count == 2) { // 약수가 2개인지 체크 => 소수의 조건 => true면 출력
				System.out.print(i+" ");
			}
		}
		
		
	}

}
