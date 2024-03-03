package Day06;

import java.util.Scanner;

public class _04_Method03 {

	public static void main(String[] args) {
		
		/* 메서드를 활용한 계산기 작성
		 * 연산자 + - * % / 만 허용
		 * 두 수와 연산자를 입력 받아서 메서드를 활용하여 연산
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("계산 할 첫번째 숫자를 입력하세요.");
		int num1 = scan.nextInt();
		System.out.println("연산자를 입력하세요.");
		String s = scan.next();
		System.out.println("계산 할 두번째 숫자를 입력하세요.");
		int num2 = scan.nextInt();
		
		switch(s) {
		case "+" : add2(s,num1,num2);
			 break;
		case "-" : System.out.println(num1+s+num2+"="+sub(num1, num2));
			 break;
		case "*" : System.out.println(num1+s+num2+"="+mul(num1, num2));
			 break;
		case "/" : System.out.println(num1+s+num2+"="+div(num1, num2));
			 break;
		case "%" : double[] arr = rem2(num1, num2); // 왜 new가 없어도 에러가 없을까? => rem2 에서 선언 했음
			System.out.println(arr[0]); // 몫
			System.out.println(arr[1]); // 나머지
			System.out.println(num1+s+num2+"="+rem(num1, num2));
			 break;
			 default: System.out.println("잘못된 연산자 입니다.");
		}
		
		scan.close();

	}
	
	public static int add(int num1, int num2) {
		return num1 + num2;
	}
	
	// 선생님의 add => 값을 연산자까지 매개변수로 받아 리턴 없이 바로 출력한 메서드 
	public static void add2(String op, int num1, int num2) {
		System.out.println(num1+op+num2+"="+(num1+num2));
	}
	 
	
	public static int sub(int num1, int num2) {
		return num1 - num2;
	}
	
	public static int mul(int num1, int num2) {
		return num1 * num2;
	}

	public static double div(int num1, int num2) {
		return (double)num1 / num2;
	}
	
	public static int rem(int num1, int num2) {
		return num1 % num2;
	}

	/* 기능 : 두 정수를 입력 받아 두 정수의 몫과 나머지를 double[]로 리턴, 몫은 0번지 나머지는 1번지
	 * 리턴 타입 : double 타입의 배열
	 * 매개 변수 : 두 정수
	 * 변수명 : rem2
	 */
	
	public static double[] rem2(int num1, int num2) {
		double[] arr = new double[2];
		arr[0] = num1 / num2;
		arr[1] = num1 % num2;
		return arr;
	}
	
	
}
