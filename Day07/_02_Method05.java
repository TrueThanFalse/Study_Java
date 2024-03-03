package Day07;

import java.util.Scanner;

public class _02_Method05 {

	public static void main(String[] args) {
		
		/* 메서드의 기능은 오직 하나의 기능만! 그래야 다른 곳에서 사용할 수 있다. (재활용성 용이)
		 * 신중하게 작성해야 추후 수정이 불필요. 수정하게 되면 대량의 에러가 발생 할 가능성이 높다.
		 */
		
		/* 2~100까지의 소수를 출력
		 * 2~100까지 for문을 돌려서 메서드 호출하여 true면 출력
		 */
		
		
		for(int i=2; i<=100; i++) {
			if(isPrime(i)) {
				System.out.print(i+" ");
			}
		}
		
		System.out.println();
		// 2~200까지의 소수의 합계
		int sum = 0;
		for(int i=2; i<=100; i++) {
			if(isPrime(i)) {
				sum += i;
			}
		}
		System.out.print("1~100 소수의 합: "+sum);
		
		System.out.println();
		// 값을 입력 받아서 소수인지 아닌지 출력
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력>");
		int num = scan.nextInt();
		if(isPrime(num)) {
			System.out.println("소수입니다.");
		}else {
			System.out.println("소수가 아닙니다.");
		}
		

	}
	
	/* 기능 : 정수가 주어지면 이 정수가 소수인지 아닌지 판단 (true / false)
	 * 소수 : 1과 자기자신만을 약수로 가지는 수
	 * 리턴타입 : boolean
	 * 매개변수 : 정수 => int num
	 * 메서드명 : isPrime // 일반적으로 is는 참인지 거짓인지 판단하는 약속된 단어
	 */
	
	public static boolean isPrime(int num) {
		int cnt = 0; // 약수의 개수
		for(int i=1; i<=num; i++) { // 1~num 까지 반복하여 약수의 개수를 확인
			if(num%i==0) { // 약수 찾기
				cnt++; // 약수 찾았으면 약수 개수 증가
			}
		}
		if(cnt==2) { // true면
			return true; // 메서드는 여기서 종료. 
		}
		return false;
	}
	
	
	
	
	

}
