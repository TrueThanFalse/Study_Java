package Day02;

import java.util.Scanner;

public class _04_IF02 {

	public static void main(String[] args) {
	

		/* 국어, 영어, 수학 점수를 입력 받아서
		 * 합계, 평균, 평가를 출력
		 * 평가는 평균이 90 이상이면 A, 80 이상이면 B, 70이 이상이면 C, 나머지는 D
		 * 입력 받는 값이 0보다 작거나 100보다 크면 "잘못된 값입니다" 출력
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("국어 점수를 기입하세요.");
		int num1 = scan.nextInt();
		if(num1 < 0 || num1 > 100) {
			System.out.println("잘못된 값입니다. 다시 입력 해주세요.");
			num1 = scan.nextInt();
		}
		
		System.out.println("영어 점수를 기입하세요.");
		int num2 = scan.nextInt();
		if(num2 < 0 || num2 > 100) {
			System.out.println("잘못된 값입니다. 다시 입력 해주세요.");
			num2 = scan.nextInt();
		}
		
		System.out.println("수학 점수를 기입하세요");
		int num3 = scan.nextInt();
		if(num3 < 0 || num3 > 100) {
			System.out.println("잘못된 값입니다. 다시 입력 해주세요.");
			num3 = scan.nextInt();
		}
		
		int sum = 0;
		sum = num1 + num2 + num3;
		int avg = 0;
		avg = sum / 3;
		int result = 0;
		result = avg;
		System.out.println("합계: " + sum);
		System.out.println("평균: " + avg);
		if(result >= 90) {
			System.out.println("평가: A");
			if(result >= 80) {
				System.out.println("평가: B");
				if(result >= 70) {
					System.out.println("평가: C");
				}
			}
		} else {
			System.out.println("평가: D");
		}
		
		scan.close();
		
		
		// 선생님 답안.
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("정수 입력(0~100) : 국어, 영어, 수학 순으로 입력해주세요.");
//		int kor = scan.nextInt();
//		int eng = scan.nextInt();
//		int math = scan.nextInt();
//		if(kor < 0 || kor > 100) {
//			System.out.println("국어 점수가 입력 범위를 벗어났습니다.");
//		}
//		if(eng < 0 || eng > 100) {
//			System.out.println("국어 점수가 입력 범위를 벗어났습니다.");
//		}
//		if(eng < 0 || eng > 100) {
//			System.out.println("국어 점수가 입력 범위를 벗어났습니다.");
//		}
//		
//		int sum = kor + eng + math;
//		
//		double avg = sum / 3.0;
//		
//		System.out.println("합계:" + sum + ", 평균:" + avg);
//		
//		char ch = 'D'; // char 자료형은 '' 필수
//		
//		if(avg > 100 || avg < 0) {
//			System.out.println("잘못된 성적");
//		} else if(avg >= 90) {
//			ch = 'A';
//		} else if(avg >= 80) {
//			ch = 'B';
//		} else if(avg >= 70) {
//			ch = 'C';
//		} else {
//			ch = 'D';
//		}
//		System.out.println("평가:" + ch);
//		
//		scan.close();
				
		
	}

}
