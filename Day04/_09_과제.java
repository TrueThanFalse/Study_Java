package Day04;

import java.util.Scanner;

public class _09_과제 {

	public static void main(String[] args) {
		
		
		/* 5명의 점수를 입력 받아서 배열에 저장하고
		 * 점수의 합계와 평균을 출력
		 * 최고 점수를 따로 출력
		 */
			
		
		/*Scanner scan = new Scanner(System.in);
		int score = 0;
		int sum = 0;
		int avg = 0;
		int max = 0;
		int[] arr = new int[5];
			
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr.length + "명 중" + (i+1) + "번째 점수(정수)를 입력하세요.");
			score = scan.nextInt();
			arr[i] = score;
			sum += arr[i];
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		avg = sum / (arr.length);
		
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
		System.out.println("최고 점수 : " + max);*/
		
		
		
		// 선생님 답안.
		
		/* 입력 => Scanner
		 배열 생성
		 for문 활용하여 입력 받은 점수를 배열에 저장
		 최대값 구하기 (if 또는 Math.max) => 여러개를 한번에 비교는 불가능. 2개 값을 비교 할 수 있다.
		 */
		
		Scanner scan = new Scanner(System.in);
		int size = 5;
		int arr[] = new int[size]; // 0 0 0 0 0 => 78 90 85 75 69
		int sum = 0;
		double avg = 0;
		int max = 0;
		int max1 = 0;
		int min = 100; // 초기값이 항상 0이 아니다.
		int min1 = 100;
		
		System.out.println("점수를 입력하세요.(5명)");
		for(int i=0; i<arr.length; i++) {
			arr[i] = scan.nextInt();
			sum += arr[i]; // 0+78+90+85+75+69
			if(arr[i] > max) { // 최대값, if 방법
				max = arr[i];
			}
			if(arr[i] < min) { // 최소값
				min = arr[i];
			}
			max1 = Math.max(max1, arr[i]); // 최대값, Math.max 방법
			min1 = Math.min(min1, arr[i]); // 최소값
		}
		avg = (double)sum / arr.length;
		
		System.out.println("합계:"+sum);
		System.out.println("평균:"+avg);
		System.out.println("최고값:"+max);
		System.out.println("Math.최대값:"+max1);
		System.out.println("최소값:"+min);
		System.out.println("Math.최소값:"+min1);
		
		
		
		
		
		scan.close();

	}

}
