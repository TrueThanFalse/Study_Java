package Day07;

import java.util.Scanner;

public class _04_Method07 {

	public static void main(String[] args) {
		
		/* 숫자와 기호를 주고 기호를 숫자만큼 출력하는 메서드 생성
		 * ex)
		 * 3, * => ***
		 * 5, o => ooooo
		 * 7, ☆ => ☆☆☆☆☆☆☆
		 * 
		 * main에서 숫자와 기호를 입력 받아 메서드 호출 => 출력
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("몇번 반복할 것인지 숫자를 입력하세요.");
		int num = scan.nextInt();
		System.out.println("반복할 글자를 입력하세요.");
		String str = scan.next();
		System.out.println("반복할 글자를 입력하세요.");
		char ch = scan.next().charAt(0);
		
		mm(num,str);
		symbol(num, ch);
		
		scan.close();
		
	}
	
	/* 리턴타입 : void (출력은 리턴이 없음)
	 * 매개변수 : 정수, 문자 => int, String
	 * 메서드명 : mm
	 */
	
	public static void mm(int num, String str) { // char를 쓰면 한 글자만 받음
		int cnt = 0;
		while(cnt<num) {
			System.out.print(str);
			cnt++;
		}
		
//		for(int i=0; i<=num; i++) {
//			System.out.println(str);
//		}
		return;
	}
	
	//solution
	//숫자와 기호를 주고 기호를 숫자만큼 출력하는 메서드
		public static void symbol(int num, char ch) {
			for(int i=1; i<=num; i++) {
				System.out.print(ch);
			}
		}
	

}
