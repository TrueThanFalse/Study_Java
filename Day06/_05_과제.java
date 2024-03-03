package Day06;

import java.util.Scanner;

public class _05_과제 {

	public static void main(String[] args) {
		
		/* 가위바위보 게임 만들기
		 * 컴퓨터가 가위, 바위, 보 중 랜덤 선택
		 * (0 = 가위, 1 = 바위, 2 = 보)
		 * Player가 가위,바위,보 중 선택해서 입력. (숫자,문자 상관 없음)
		 * 결과 =>
		 * 컴퓨터 > 가위, Player > 가위 => 무승부입니다. 출력
		 */
		
		
		Scanner scan = new Scanner(System.in);
		int playerIn = 0; // 유저의 입력 값
		int com = 0;
		System.out.println("---가위바위보 게임---");
		a:for(;;) {
			com = (int)(Math.random()*3);
			System.out.println();
			System.out.println("가위,바위,보 중 하나를 입력하세요.");
			System.out.println("그만하시려면 '그만'을 입력하세요");
			String player = scan.next();
			
			switch(player) {
			case "가위" : playerIn = 0;
				break;
			case "바위" : playerIn = 1;
				break;
			case "보" : playerIn = 2;
				break;
			case "그만" :
				break a;
				default: System.out.println("잘못된 입력입니다. 다시 실행하세요.");
					break a;
			}
			
			if(com==0 && playerIn==0) {
				System.out.println("컴퓨터>가위, Player>가위, 무승부입니다.");
				
			}else if(com==0 && playerIn==1) {
				System.out.println("컴퓨터>가위, Player>바위, Player 승");
				
			}else if(com==0 && playerIn==2) {
				System.out.println("컴퓨터>가위, Player>보, Player 패");
				
			}else if(com==1 && playerIn==0) {
				System.out.println("컴퓨터>바위, Player>가위, Player 패");
				
			}else if(com==1 && playerIn==1) {
				System.out.println("컴퓨터>바위, Player>바위, 무승부입니다.");
				
			}else if(com==1 && playerIn==2) {
				System.out.println("컴퓨터>바위, Player>보, Player 승");
				
			}else if(com==2 && playerIn==0) {
				System.out.println("컴퓨터>보, Player>가위, Player 승");
				
			}else if(com==2 && playerIn==1) {
				System.out.println("컴퓨터>보, Player>바위, Player 패");
				
			}else if(com==2 && playerIn==2) {
				System.out.println("컴퓨터>보, Player>보, 무승부 입니다.");
				
			}
		}
		
		scan.close();
		
		
		
		// 선생님 답안
		
		Scanner scan2 = new Scanner(System.in);
		System.out.println("가위바위보 게임 시작");
		
		int comNum = (int)(Math.random()*3); // 0, 1, 2
		System.out.println("컴퓨터가 결정을 완료 하였습니다.");
		System.out.println("가위/바위/보 중 하나를 선택하세요 >");
		String myChoice = scan2.next(); // 유저의 선택 (가위, 바위, 보)
		
		// 컴퓨터의 선택을 String으로 변경
		String comChoice = (comNum==0) ? "가위" : (comNum==1)?"바위":"보";
		System.out.println("com선택:"+comChoice);
		
		// 비교 (문자끼리 비교 ==(X), equals를 사용하여 비교)
		if(comChoice.equals(myChoice)) {
			System.out.println("비겼습니다.");
		}else {
			if(comChoice.equals("가위")) {
				System.out.println(myChoice.equals("바위")?"이겼습니다.":"졌습니다");
			}else if(comChoice.equals("바위")) {
				System.out.println(myChoice.equals("보")?"이겼습니다":"졌습니다");
			}else { // 보
				System.out.println(myChoice.equals("가위")?"이겼습니다":"졌습니다");
			}
		}
		System.out.println("게임 종료");
		
		scan2.close();
		
		// 배열을 활용한 코드도 존재 함.
		
		
	}

}
