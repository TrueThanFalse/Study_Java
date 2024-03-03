package Day14_lotto;

import java.util.Scanner;

public class LottoMain {

	public static void main(String[] args) {
		
		/* --menu--
		1. 로또 번호 생성(수동) : 사용자가 직접 입력 6개
			=> createLotto(scan);
		2. 로또 번호 생성(자동) : random 생성 6개
			createLottoAuto()
		3. 당첨 번호 생성(자동) : random 생성 7개 => 배열에 저장
			insertLottoAuto()
		4. 당첨 번호 확인 : 최신 회차 1개만 확인 => 등수도 같이 체크
			checkLotto()
		5. 당첨 번호 리스트 확인 : 현재 회차 당첨 번호가 가장 마지막으로 출력(가장 위에 출력)
			printLotto()
		6. 종료
		*/
		
		LottoManager lm = new LottoManager();
		
		Scanner scan = new Scanner(System.in);
		
		int menu = 0;
		
		do {
			System.out.println("---로또---");
			System.out.println("|1.수동생성|2.자동생성|3.당첨생성|");
			System.out.println("|4.당첨확인|5.역대당첨|6.종료|");
			
			menu = scan.nextInt();
			
			switch(menu) {
			
			case 1: 
				System.out.println("로또 수동 생성 완료");
				lm.createLotto(scan);
				break;
			case 2: 
				System.out.println("로또 자동 생성 완료");
				lm.createLottoAuto();
				break;
			case 3: 
				System.out.println("당첨 번호 생성 완료");
				lm.insertLottoAuto();
				break;
			case 4: 
				System.out.println("당첨 번호 확인");
				lm.checkLotto();
				break;
			case 5: 
				System.out.println("역대 당첨 번호");
				lm.printLotto();
				break;
			case 6:
				break;
				default: System.out.println("잘못된 메뉴입니다.");
			}
			
		}while(menu != 6);
		System.out.println("프로그램 종료");
		
		scan.close();

	}

}
