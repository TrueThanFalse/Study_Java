package Day03;

import java.util.Scanner;

public class _06_과제 {

	public static void main(String[] args) {
	

		/* up&down 게임
		 * 1~50 사이의 랜덤 수를 생성하여 맞추는 게임
		 * ex) 컴퓨터가 랜덤 수를 생성 : 35
		 * 입력> 10
		 * up~! 출력
		 * 입력> 20
		 * up~!
		 * 입력> 40
		 * down~!
		 * 입력> 35
		 * 정답~!
		 */
		
		int com = (int)(Math.random()*50)+1; // 1~50까지의 정수 랜덤 수
		Scanner scan = new Scanner(System.in);
		System.out.println("1~50까지의 정수 중 입력해주세요.");
		int player = scan.nextInt();
		for(;;) {
			if(player == com) {
				System.out.println("정답~!!");
				break;
			}else if(player < com) {
				System.out.println("up~!!");
				System.out.println("더 높은 정수를 입력하세요.");
			}else if(player > com) {
				System.out.println("down~!!");
				System.out.println("더 낮은 정수를 입력하세요.");
			}
			player = scan.nextInt();
		}
		
		scan.close();
		
		
		
		// 선생님 답안
		Scanner sc = new Scanner(System.in);
		int random = (int)(Math.random()*50)+1;
		System.out.println("1~50 사이의 정수를 입력하세요");
		System.out.println("기회는 5번");
		int num=0;
		for(int i=1; i<=5; i++) { // 기회를 5번으로 제한 할 수 있다.
			System.out.println("입력>");
			num = sc.nextInt();
			if(num == random) {
				System.out.println("정답");
				break;
			}else if(num < random) {
				System.out.println("up~!" + i + "번 실행");
			}else {
				System.out.println("down~!" + i + "번 실행" );
			}
		}
		System.out.println("기회가 모두 끝났습니다.");
		
	}

}
