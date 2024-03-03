package Day14_lottoSolution;

import java.util.Scanner;

public class LottoMain {

	public static void main(String[] args) {
		
		LottoManager lm = new LottoManager();
		Scanner scan = new Scanner(System.in);
		
		int menu = 0;
		
		do {
			lm.printMenu(); // 메뉴 출력 메서드화 (호출)
			menu = scan.nextInt();
			
			switch(menu) {
			case 1: lm.createLotto(scan);
				break;
			case 2: lm.createLottoAuto();
				break;
			case 3: lm.insertLottoAuto();
				break;
			case 4: lm.checkLotto();
				break;
			case 5: lm.printLotto();
				break;
			case 6: break;
				default: System.out.println("잘못된 메뉴!");
			}
		}while(menu != 6);
		System.out.println("프로그램 종료");
		
		
//		작동 되는지 확인하기
//		Lotto l = new Lotto();
//		l.randomLotto();
//		System.out.println(l);
//		
//		LottoE le = new LottoE();
//		le.randomLotto();
//		System.out.println(le);
//		
//		int arr[] = {1,2,3,4,5,6};
//		l.inserNumbers(arr);
//		System.out.println(l);
//		int arr2[] = {5,6,7,8,9,10,11};
//		le.inserNumbers(arr2);
//		System.out.println(le);

	}

}
