package Day07;

import java.util.Scanner;

public class _03_Method06 {

	public static void main(String[] args) {
		
		/* 구구단 출력
		 * 단 1개를 주고, 구구단 출력 
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("구구단의 단수를 입력하세요.");
		int num = scan.nextInt();
		print(num);
		
		System.out.println("-----");
		
		// 2~9까지 반복하여 모든 단을 출력
		
		for(int i=2; i<=9; i++) {
			print(i);
			System.out.println();
		}
		
		scan.close();
		

	}

	
	/* 기능 : 단이 주어지면 그 단의 구구단을 출력 (리턴X)
	 * 리턴타입 : void
	 * 매개변수 : int
	 * 메서드명 : print
	 */
	
	public static void print(int num) { // num => 단 수
		for(int i=1; i<=9; i++) {
			System.out.println(num+"*"+i+"="+(num*i));
		}
		return;
	}
	
	
	
}
