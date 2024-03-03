package Day05;

import java.util.Scanner;

public class _03_Array04 {

	public static void main(String[] args) {
		
		/* 5자리의 숫자를 한번에 입력 받고 입력 받은 숫자를 거꾸로 출력
		 * 각 자리의 합계를 출력
		 * ex) 11456 => 65411 => 합계 출력
		 * ex) 19547 => 74591 => 합계 출력
		 */
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("숫자(정수)를 5번 입력해주세요.");
//		int sum = 0;
//		int size = 5;
//		int[] arr = new int[size];
//		for(int i=0; i<arr.length; i++) {
//			arr[i] = scan.nextInt();
//			sum += arr[i]; 
//		}
//		for(int i=size-1; 0<=i; i--) {
//			System.out.print(arr[i]+" ");
//		}
//		System.out.println("합계: "+sum);
//		
//		scan.close();
		
		
		// 선생님 답안
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자(정수) 5자리를 입력해주세요.");
		int num = scan.nextInt();
		int arr[] = new int[5];
		
		/* 나누기(/), 나머지(%)
		 * 12345 => % 10 => 5 => 배열에 저장
		 * 값을 나눈 몫만 다시 나눌값으로 지정
		 * 12345 / 10 => 정수만 저장
		 * 1234 => % 10 => 4 => 배열에 저장
		 * 123 => % 10 => 3 => 배열에 저장
		 * ...
		 */
		
		int sum = 0;
		int i = 0;
		
		while(num > 0) { // 입력 받은 num가 0보다 작아지면 false
			int b = num % 10; // 마지막 자리를 나머지로 받기
			arr[i] = b;
			sum += b;
			num = num / 10; // 몫 저장 => 정수/정수 = 정수
			System.out.println(arr[i]);
			i++;
			}
		System.out.println("sum:" + sum);
		
		scan.close();
		
		System.out.println("-----");
		
		String s = "12345";
		String s1[] = new String[5];
		
		s1 = s.split(""); // 특정 문자를 기준으로 나누기
		sum = 0;
		for(i=0; i<s1.length; i++) {
			System.out.println(s1[4-i]);
			sum += Integer.parseInt(s1[i]); // 문자를 숫자로 치환
		}
		System.out.println(sum);


	

	}

}
