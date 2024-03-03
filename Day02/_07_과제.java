package Day02;

import java.util.Scanner;

public class _07_과제 {

	public static void main(String[] args) {

		/*
		 * 과제 정수 2개와 연산자 하나를 입력 받아 두 정수의 연산을 출력 
		 * 연산자는 +, -, *, /, % ex) 3 2 + => 3+2=5 
		 * 4 7 * => 4*7=28 
		 * 만약 연산자의 종류가 다른 연산자가 들어오면 '잘못된 입력~!~!' 출력
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력해주세요.");
		int num1 = scan.nextInt();
		System.out.println("정수를 입력해주세요.");
		int num2 = scan.nextInt();
		System.out.println("연산자를 입력해주세요.");
		char ch1 = scan.next().charAt(0); // charAt(0) => 한글자 입력 받기
		switch (ch1) {
		case 37:
			System.out.println(num1 + "%" + num2 + "=" + (num1 % num2));
			break;
		case 42:
			System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));
			break;
		case 43:
			System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
			break;
		case 45:
			System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
			break;
		case 47:
			System.out.println(num1 + "/" + num2 + "=" + (num1 / num2));
			break;
		default:
			System.out.println("잘못된 연산자를 입력 하셨습니다.");
		}
		scan.close();

		// char 자료형이 아닌 String 클래스를 활용한 코드

		Scanner scan2 = new Scanner(System.in);
		System.out.println("계산하실 첫번째 정수를 입력 해주세요.");
		int bum1 = scan2.nextInt();
		System.out.println("계산하실 두번째 정수를 입력 해주세요.");
		int bum2 = scan2.nextInt();
		System.out.println("연산자를 입력 해주세요.");
		String s = scan2.next();
		switch (s) {
		case "+":
			System.out.println(bum1 + s + bum2 + "=" + (bum1 + bum2));
			break;
		case "-":
			System.out.println(bum1 + s + bum2 + "=" + (bum1 - bum2));
			break;
		case "*":
			System.out.println(bum1 + s + bum2 + "=" + (bum1 * bum2));
			break;
		case "/":
			System.out.println(bum1 + s + bum2 + "=" + (bum1 / bum2));
			break;
		case "%":
			System.out.println(bum1 + s + bum2 + "=" + (bum1 % bum2));
			break;
		default:
			System.out.println("잘못된 입력~!");
		}
		scan2.close();

		// 다른 코드 (char)
		Scanner scan3 = new Scanner(System.in);
		System.out.println("계산하실 첫번째 정수를 입력 해주세요.");
		int vum1 = scan3.nextInt();
		System.out.println("계산하실 두번째 정수를 입력 해주세요.");
		int vum2 = scan3.nextInt();
		System.out.println("연산자를 입력 해주세요.");
		char ch2 = scan3.next().charAt(0);
		switch (ch2) {
		case '+':
			System.out.println(vum1 + s + vum2 + "=" + (vum1 + vum2));
			break;
		case '-':
			System.out.println(vum1 + s + vum2 + "=" + (vum1 - vum2));
			break;
		case '*':
			System.out.println(vum1 + s + vum2 + "=" + (vum1 * vum2));
			break;
		case '/':
			System.out.println(vum1 + s + vum2 + "=" + (vum1 / vum2));
			break;
		case '%':
			System.out.println(vum1 + s + vum2 + "=" + (vum1 % vum2));
			break;
		default:
			System.out.println("잘못된 입력~!");
		}
		scan3.close();

		// 선생님 답안

		Scanner scan4 = new Scanner(System.in);
		System.out.println("계산하실 첫번째 정수를 입력 해주세요.");
		int qum1 = scan4.nextInt();
		System.out.println("계산하실 두번째 정수를 입력 해주세요.");
		int qum2 = scan4.nextInt();
		System.out.println("연산자를 입력 해주세요.");
		char ch3 = scan4.next().charAt(0);

		int a = qum1 + qum2;
		int b = qum1 - qum2;
		int c = qum1 * qum2;
		double d = (double) qum1 / qum2; // 나눗셈의 결과는 실수가 출력 되도록 double
		int e = qum1 % qum2;

		switch (ch3) {
		case '+':
			System.out.println("" + qum1 + ch3 + qum2 + "=" + a);
			break; // 가장 앞에 "" 붙이면 정수형 변수 char를 계산 연산 하지 않음.
		case '-':
			System.out.println("" + qum1 + ch3 + qum2 + "=" + b);
			break;
		case '*':
			System.out.println("" + qum1 + ch3 + qum2 + "=" + c);
			break;
		case '/':
			System.out.println("" + qum1 + ch3 + qum2 + "=" + d);
			break;
		case '%':
			System.out.println("" + qum1 + ch3 + qum2 + "=" + e);
			break;
		default:
			System.out.println("잘못된 연산자 입니다.");
		}

		// 참고, 이클립스 들여쓰기 자동 정렬 => 컨트롤 + 쉬프트 + f

	}

}
