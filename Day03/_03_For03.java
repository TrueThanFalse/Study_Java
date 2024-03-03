package Day03;

import java.util.Scanner;

public class _03_For03 {

	public static void main(String[] args) {
	
		
		/* 구구단 n단을 입력 받아서 입력 받은 단을 출력
		 * ex) 2를 입력 받았다면
		 * 2*1=2
		 * 2*2=4
		 * 2*3=6
		 * ...
		 * 2*9=18
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("알고 싶은 구구단 단수를 입력하세요");
		int num = scan.nextInt();
		int mul; // 곱셈 : multiplication
		for(int i=1; i<=9; i++) {
			mul = num * i;
			System.out.println(num + "*" + i + "=" + mul );
		}
		scan.close();
		

	}

}
