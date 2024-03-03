package Day19Sale;

import java.util.Scanner;

public class Generics {

	public static void main(String[] args) {
		
		SaleManager sm = new SaleManager();
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
