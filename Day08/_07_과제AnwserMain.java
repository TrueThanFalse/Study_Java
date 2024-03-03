package Day08;

import java.util.Scanner;

public class _07_과제AnwserMain {

	public static void main(String[] args) {
		
		/* 야구게임
		 * 컴퓨터가 3자리의 숫자를 랜덤 생성 (1~9까지 중복 없이 생성)
		 * user가 3자리 숫자를 맞추는 게임.
		 * 자리와 숫자가 일치하면 strike
		 * 숫자만 일치하면 ball
		 * 아무것도 없으면 out
		 * ex) 컴퓨터 숫자가 3 5 7 이고
		 *     유저의 숫자가 3 6 7 이면 2s
		 *     
		 *     3 5 7
		 *     3 7 6 => 1s 1b
		 *     
		 *     3 5 7 
		 *     7 3 5 => 3b
		 *     
		 *     3 5 7
		 *     1 2 6 => out
		 *     
		 * ex) 출력 예시     
		 * --야구 게임 시작--
		 * 컴퓨터가 숫자를 정했습니다.
		 * 숫자 입력(1~9까지 3자리) :
		 * 3 4 5
		 * 결과 :
		 * 3s 다 맞으면 종료 (게임 횟수 출력)
		 */
		
		
		/* 필요해 보이는 기능
		 * 1. 랜덤 메서드
		 * 2. 컴퓨터 중복 없는 배열 생성 메서드
		 * 3. 유저 입력 메서드
		 * 4. 일치 여부 계산 후 결과 출력 메서드
		 */
		
		
		// 선생님 답안
		
		// 1. 입력을 위한 스케너 열기
		Scanner scan = new Scanner(System.in);
		
		// 2. 변수 선언
		int comNum[] = new int[3]; // 컴퓨터 배열
		int myNum[] = new int[3]; // user 배열
		int count = 0; // 게임 횟수 출력용 변수
		
		// 3. 컴퓨터가 결정한 3가지 숫자를 중복되지 않게 추출
		for(int i=0; i<comNum.length; i++) {
			comNum[i] = (int)(Math.random()*9)+1;
			for(int j=0; j<i; j++) {
				if(comNum[i] == comNum[j]) {
					i--;
					break; // for(j) 구문을 빠져나감
				}
			}
		}
		
		for(int tem : comNum) {
			System.out.print(tem+" "); // 출력 확인용
		}
		System.out.println();
		
//		// lotto 메서드의 randomArray 배열과 printArray 배열을 호출
//		// static 메서드는 객체 생성 없이 클래스명.메서드명()으로 호출 가능
//		
//		_03_LottoAnwser.randomArray(comNum);
//		_03_LottoAnwser.printArray(comNum);
//		
//		// static이 아닌 경우. 객체를 생성하여 객체명.메서드명() 호출 가능
//		
//		_03_LottoAnwser k = new _03_LottoAnwser();
//		k.randomArray(comNum);
//		k.printArray(comNum);
		
		System.out.println("야구 게임 시작 >");
		System.out.println("컴퓨터가 숫자를 결정하였습니다.");
		
		// 4. 사용자의 숫자 입력 받기
		while(true) {
			int s = 0;
			int b = 0;
			System.out.println("숫자 입력(1~9, 숫자 3개) >");
			for(int i=0; i<myNum.length; i++) {
				myNum[i] = scan.nextInt();
			}
			count++;
			
			//5. 숫자 비교
			for(int i=0; i<comNum.length; i++) { // 컴퓨터 넘버 기준
				for(int j=0; j<myNum.length; j++) { // 사용자 넘버 기준
					// 스트라이크 기준 자리와 숫자가 일치
					if(comNum[i] == myNum[j] && i == j) {
						s++;
					}else if(comNum[i] == myNum[j] && i != j) {
						b++;
					}
				}
			}
			
			// 출력
			if(s==0 && b==0) {
				System.out.println("OUT!");
			}else {
				System.out.println(s+"s "+b+"b");
				System.out.println("게임 횟수: "+count);
			}
			
			if(s==3) {
				System.out.println("정답~!");
				break; // while 구문 탈출
			}
		}
		
		scan.close();
	}
	
//	public int random() {
//		int random9 = (int)(Math.random()*9)+1;
//		return random9;
//	}
//	
//	public int[] computer() {
//		int[] arr = new int[3];
//		int r = random();
//		while() {
//			
//		}
//		
//		return r;
//	}

}
