package Day08;

import java.util.Scanner;

public class _08_과제AnwserMethod {

	public static void main(String[] args) {
		
		/* 필요한 메서드 기능
		 * 랜덤번호 메서드
		 * 배열에 추가하는 메서드(+숫자 중복 제거 메서드)
		 * 배열 출력 메서드
		 * 스트라이크 메서드 => 개수 리턴
		 * 볼 메서드 => 개수 리턴
		 */
		
		int comNum[] = new int[3];
		int myNum[] = new int[3];
		
		//랜덤수 범위
		int count = 9;
		int start = 1;
		int s=0, b=0;
		int cnt = 0; // 게임 횟수
		
		Scanner scan = new Scanner(System.in);
		
		randomArray(comNum, count, start);
		System.out.println("야구 게임 시작~! >");
		System.out.println("컴퓨터가 수를 결정하였습니다.");
		
		while(s!=3) {
			// 사용자 번호 받기
			System.out.println("숫자(1~9) 3개를 입력하세요~!");
			for(int i=0; i<myNum.length; i++) {
				myNum[i] = scan.nextInt();
			}
			cnt++;
			//결과 출력
			s = strike(comNum, myNum);
			b = ball(comNum, myNum);
			
			if(s!=0) {
				System.out.print(s+"s ");
			}
			if(b!=0) {
				System.out.print(b+"b ");
			}
			System.out.println(); // 줄바꿈용
			System.out.println("게임 횟수: "+cnt);
			if(s==0 && b==0) {
				System.out.println("out!");
			}
			if(s==3) {
				System.out.println("정답~!");
				break;
			}
		}
		
		
		
		scan.close();
		
		
	}
	
	/* 랜덤 메서드 생성시 매개변수로 범위를 설정하고 싶음
	 * (int)(Math.random()*n)+m; // n => 랜덤 값 개수, m=> 시작값
	 * 매개변수 => 개수, 시작값
	 * 만약 매개변수 입력을 반대로 할 경우 원하는 값이 나오지 않는다
	 * => if 처리 => 개수와 시작값이 바뀌어서 들어올 때 정상 처리
	 */
	
//	// 1. 랜덤 번호 메서드
//	public int random(int size, int start) {
//		int random = (int)(Math.random()*size) + start;
//		if(size <= 0) {
//			random = (int)(Math.random()*start) + size;
//			return random;
//		}
//		return random;
//	}
//	
//	// 2. 배열에 추가하는 메서드
//	public int[] randomArray(int size) {
//		int[] arr = new int[size];
//		int i = 0;
//		while(i < arr.length) {
//			int random = random(9,1);
//			if(!isContain(arr, random)) {
//				arr[i] = random;
//				i++;
//			}
//		}
//	}
//	
//	// 3. 숫자 중복 체크 메서드
//	public boolean isContain(int arr[], int random) {
//		for(int tem : arr) {
//			if(tem == random) {
//				return true; // 중복 있음!
//			}
//		}
//		return false; // 중복 없음!
//	}
//	
//	
//	// 4. 출력 메서드
//	public void printArray(int arr[]) {
//		for(int i=0; i<arr.length; i++) {
//			System.out.print(arr[i]+" ");
//		}
//	}
//	
//	// 5. 배열 입력 메서드
//	public int[] arrIn(int size) {
//		Scanner scan = new Scanner(System.in);
//		int in = scan.nextInt();
//		scan.close();
//	}
//	
//	
//	// 스트라이크 메서드 => 개수 리턴
//	public int strike(int arr[]) {
//		
//	}
//	
//	
//	// 볼 메서드 => 개수 리턴
	
	
	
	// 선생님 답안
	
	// 1. 랜덤 번호 생성
	public static int random(int count, int start) {
		if(count < start) { // 매개변수가 바뀌어서 들어온 경우
			int tmp = count;
			count = start;
			start = tmp;
		}
		return (int)(Math.random()*count)+start;
	}
	
	// 2. 중복 확인 메서드
	public static boolean isContain(int arr[], int num) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == num) {
				return true; // 중복 있음!
			}
		}
		return false; // 중복 없음!
	}
	
	// 3. 배열 생성 메서드
	// 리턴타입 : boolean => 배열이 잘 생성되면 true 리턴, 아니면 false 리턴
	// 매개변수 : 배열, count, start
	public static boolean randomArray(int arr[], int count, int start) {
		if(arr == null) {
			return false;
		}
		if(count < arr.length) {
			return false;
		}
		
		int i=0;
		while(i < arr.length) {
			int r = random(count, start);
			if(!isContain(arr, r)) {
				arr[i] = r;
				i++;
			}
		}
		return true;
	}
	
	// 4. 배열 출력 메서드
	public static void printArray(int arr[]) {
		for(int tmp : arr) {
			System.out.print(tmp+" ");
		}
		System.out.println(); // 줄바꿈
	}
	
	// 5. 스트라이크 메서드
	// 기능 : com[], my[] 위치와 값이 일치하면 count 증가 리턴
	public static int strike(int com[], int my[]) {
		int cnt = 0;
		for(int i=0; i<com.length; i++) {
			if(com[i] == my[i]) {
				cnt++;
			}
		}
		return cnt;
	}
	
	// 6. 볼 메서드
	// 기능 : com[], my[] 위치 상관없이 일치하면 count 증가 리턴
	public static int ball(int com[], int my[]) {
		int cnt = 0;
		for(int i=0; i<com.length; i++) {
			if(isContain(my, com[i])) {
				cnt++;
			}
		}
		// 스트라이크 포함하고 있는 개수
		return cnt - strike(com, my);
	}
	
	
}	


