package Day03;

import java.util.Scanner;

public class _02_For02 {

	public static void main(String[] args) {
		
		
		/* num = 6 의 약수를 출력
		 * 약수란? 나누어서 떨어지는 수
		 * 6의 약수 : 1, 2, 3, 6
		 * 12의 약수 : 1, 2, 3, 4, 6, 12
		 */
		
		// 6%1=0, 6%2=0, 6%3=0, 6%4=2, 6%5=1, 6%6=0
		
		int num = 6; // num에 어떤 수를 넣어도 그 수에 대한 모든 약수를 추출
		for(int i=1; i<=num; i++) {
			if(num % i == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.println("----------");
		
		// 숫자를 입력 받아서 그 수의 약수를 출력 
		
		Scanner scan = new Scanner(System.in);
		System.out.println("약수를 알고 싶은 숫자(정수)를 입력하세요."); // 안내 문구
		int num2 = scan.nextInt();
		for(int i=1; i<=num2; i++) {
			if(num2 % i == 0) {
				System.out.print(i + " ");
			}
		}
		scan.close();

	}

}
