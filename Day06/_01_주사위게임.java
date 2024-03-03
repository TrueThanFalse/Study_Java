package Day06;

import java.util.Scanner;

public class _01_주사위게임 {

	public static void main(String[] args) {
		
		/* 문제. 주사위게임
		 * 주사위를 던져서 총 30칸을 이동하면 완주
		 * 주사위 수는 1~6까지 랜덤 수
		 * ex)
		 * 주사위 : 3
		 * 3칸 이동 => 27칸 남았습니다. 출력
		 * 주사위 : 6
		 * 6칸 이동 => 21칸 남았습니다. 출력
		 * ...
		 * 30칸에 도착하게 되면 도착~!! 출력
		 * 총 이동 횟수 : ?번 완주 출력
		 */
		
		int random = 0; // 주사위 값
		int go = 0; // 이동 거리
		int end = 30; // 남은 거리
		int run = 0; // 던진 횟수
		for(;;) {
			random = (int)(Math.random()*6)+1;
			go += random;
			end -= random;
			run++;
			if(0>=end) {
				System.out.println("도착!!~~ 총 주사위 굴린 수: " + run + "번 완주");
				break;
			}else {
				System.out.println("주사위 :" + random);
				System.out.println(end + "칸 남았습니다.");
			}
		}
		
		System.out.println();
		System.out.println("---------------------");
		
		// while문 실행을 위한 초기화
		random = 0;
		go = 0;
		end = 30;
		run = 0;
		
		while(0<=end) {
			random = (int)(Math.random()*6)+1;
			go += random;
			end -= random;
			run++;
			if(0>=end) {
				System.out.println("★☆★☆★☆★☆★☆★");
				System.out.println("도착!!~~ 총 주사위 굴린 수: " + run + "번 완주");
				System.out.println("★☆★☆★☆★☆★☆★");
				break;
			}else {
				System.out.println("주사위 :" + random);
				System.out.println(end + "칸 남았습니다.");
			}
		}
		
		// 입력 받아서 주사위 게임
		
		random = 0;
		go = 0;
		end = 30;
		run = 0;
		String sp = "";
		Scanner scan = new Scanner(System.in);
		
		for(;;) {
			System.out.println("주사위 굴림을 위해 엔터를 눌러주세요.");
			sp = scan.nextLine();
			random = (int)(Math.random()*6)+1;
			go += random;
			end -= random;
			run++;
			if(0>=end) {
					System.out.println("★☆★☆★☆★☆★☆★");
					System.out.println("도착!!~~ 총 주사위 굴린 수: " + run + "번 완주");
					System.out.println("★☆★☆★☆★☆★☆★");
					break;
			}else {
					System.out.println("주사위 :" + random);
					System.out.println(end + "칸 남았습니다.");
			}
		}
		scan.close();
		
		
		// 선생님 답안.
		// 랜덤값 생성 필요
		// 목표값=30, sum=합산거리, count=이동횟수 변수 필요
		
		int random2 = 0;
		int sum = 0;
		int count = 0;
		int last = 30;
		
		while(sum < last) { // true 값이 되어야 반복
			// random 수는 반복적으로 생성 되어야 함
			random2 = (int)(Math.random()*6)+1;
			sum += random; // 거리합산
			count++;
			System.out.println("주사위:" + random + "칸 이동 => " + (last-sum) + "칸 남았습니다.");
		}
		System.out.println("완주~!, 총 이동 횟수:" + count);
		
		// 참고 : 백준, 프로그래머스 => 코딩 문제 출제 해주는 웹사이트

	}

}
