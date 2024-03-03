package Day19;

import java.util.ArrayList;
import java.util.Scanner;

import Day13_studentSolution.StudentSolution;

public class _05_Generics {

	public static void main(String[] args) {
		
		/* 제네릭(Generics) 클래스
		 * 클래스 선언시 구체적인 타입을 기재하지 않고 사용할 수 있게 해주는 방식
		 * <클래스> : String, Integer, Subject, Student 등등... 
		 */
		
		
//		메인 메뉴 출력과 처리
//		1. 메뉴 추가
//		2. 메뉴 출력
//		3. 주문
//		4. 주문리스트
//		5. 종료
		
		_07_SaleManager sm = new _07_SaleManager();
		Scanner scan = new Scanner(System.in);
		
		int menu = -1;
		do {
			System.out.println("1.메뉴 추가|2.메뉴출력|3.주문|4.주문리스트|5.종료");
			menu = scan.nextInt();
			
			switch(menu) {
			case 1: sm.add(scan);
				break;
			case 2: sm.printProduct();
				break;
			case 3: sm.orderPick(scan);
				break;
			case 4: sm.printOrder2();
				break;
			case 5: break;
				default: System.out.println("Error!");
			}
		}while(menu != 5);
	}

}
