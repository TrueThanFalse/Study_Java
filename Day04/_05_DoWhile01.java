package Day04;

import java.util.Scanner;

public class _05_DoWhile01 {

	public static void main(String[] args) {
		
		
		/* do~while : 반복문 중 하나
		 * 
		 * do {
		 * 실행문;
		 * }while(조건식);
		 * 
		 * for문, while문은 조건식이 처음부터 false면 한번도 실행이 안 됨.
		 * 하지만 do~while문은 실행문을 먼저 실행하고 나서 조건식을 비교하여 반복 여부를 결정
		 * 따라서 조건식이 false라도 무조건 1번은 실행 함. ★
		 * 
		 * do~while문은 메뉴 생성시 많이 활용 된다.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		/* 1. 저장하기
		 * 2. 새로만들기
		 * 3. 종료하기
		 */
		
		int menu = 0;
		do {
			System.out.println("---menu---");
			System.out.println("1.저장하기");
			System.out.println("2.새로만들기");
			System.out.println("3.종료하기");
			System.out.println("> 메뉴입력 :");
			
			// 실행 기능을 입력 받는 구문
			menu = scan.nextInt();
			
			switch(menu) {
			case 1:
				//실제 기능
				System.out.println("저장합니다.");
				break;
			case 2:
				//실제 기능
				System.out.println("새로 만듭니다.");
				break;
			case 3:
				System.out.println("종료됩니다.");
				break;
				default : 
					System.out.println("잘못된 메뉴입니다.");
			}
		}while(menu != 3); // true면 반복
		System.out.println("프로그램 종료");
		
		scan.close();
		

	}

}
