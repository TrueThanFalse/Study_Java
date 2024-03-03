package Day07;

import java.util.Scanner;

public class _05_과제 {
	
	/* 공통변수(멤버변수)들을 선언 하는 장소
	 * 파란색 => 멤버변수, 갈색 => 지역변수
	 * 글자가 기울어진다 => static
	 */
	
	static Scanner scan = new Scanner(System.in); // 멤버번수
	
	public static void main(String[] args) {
		
		/* 계산기 만들기
		 * (+ - * % /) 각각 메서드 만들기 => 메서드에서 바로 출력
		 * ex) 3, 5 입력 받으면 => 메뉴
		 * - 원하는 계산을 선택해주세요>
		 * - 1:덧셈, 2:뺄셈, 3:곱셈, 4:나눗셈, 5:나머지
		 * 각 기능의 메서드 => 바로 출력
		 * 
		 * 1. 숫자를 입력 받는 메서드 => 숫자를 배열에 담아 리턴
		 * 2. 메뉴 메서드 => 메뉴를 출력하고 메뉴를 입력 받아 리턴
		 * 3. 사칙연산 각각의 메서드들
		 * 
		 * main에서 할 일
		 * 1. 1번 메서드 호출 => 숫자 배열 받기
		 * 2. 2번 메서드 호출 => 내 선택 번호 가져오기
		 * 3. switch(내 선택 번호) => 기능 메서드 호출
		 */

		int[] arr = intArray();
		int menuNum = menu();
		switch(menuNum) {
		case 1 : add(arr);
			break;
		case 2 : sub(arr);
			break;
		case 3 : mul(arr);
			break;
		case 4 : div(arr);
			break;
		case 5 : rem(arr);
			break;
			default : System.out.println("잘못된 연산자 입력입니다. 재실행 해주세요.");
		}
		
		
	}
	
	/* 매개변수를 정수 배열로 받고 사칙연산을 출력하는 메서드
	 * 리턴타입 : void
	 * 매개변수 : 배열
	 */
	
	
	public static void add(int[] arr) {
		System.out.println(arr[0]+"+"+arr[1]+"="+(arr[0]+arr[1]));
		return;
	}
	public static void sub(int[] arr) {
		System.out.println(arr[0]+"-"+arr[1]+"="+(arr[0]-arr[1]));
		return;
	}
	public static void mul(int[] arr) {
		System.out.println(arr[0]+"*"+arr[1]+"="+(arr[0]*arr[1]));
		return;
	}
	public static void div(int[] arr) {
		System.out.println(arr[0]+"x"+arr[1]+"="+((double)arr[0]/(double)arr[1]));
		return;
	}
	public static void rem(int[] arr) {
		System.out.println(arr[0]+"%"+arr[1]+"="+(arr[0]%arr[1]));
		return;
	}
	
	/* 숫자를 입력 받는 메서드 => 숫자를 배열에 담아 리턴
	 * 리턴타입 : 배열 => int[]
	 * 메서드명 : intArray
	 * 매개변수 : x
	 */
	
	public static int[] intArray() {
		int[] arr = new int[2];
		System.out.println("첫번째 숫자를 입력하세요>");
		int num1 = scan.nextInt();
		System.out.println("두번째 숫자를 입력하세요>");
		int num2 = scan.nextInt();
//		for(int i=0; i<arr.length; i++) {
//			System.out.println(i+1+"번째 숫자를 입력 >");
//			arr[i] = scan.nextInt();
//		}
		arr[0] = num1;
		arr[1] = num2;
		return arr;
	}
	
	/* 메뉴 메서드 => 메뉴를 출력하고 메뉴를 입력 받아 리턴
	 * 리턴타입 : 메뉴에서 선택한 값 => int
	 * 메서드명 : menu
	 * 매개변수 : x
	 */
	
	public static int menu() {
		System.out.println("---Menu---");
		System.out.println("|1:덧셈|2:뺄셈|3:곱셈|4:나눗셈|5:나머지|");
		System.out.println("원하는 계산 연산자의 번호를 입력하세요.");
		int choise = scan.nextInt();
		return choise;
	}
	
}
