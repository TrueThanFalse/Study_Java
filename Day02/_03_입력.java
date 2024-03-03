package Day02;

import java.util.Scanner;

public class _03_입력 {

	public static void main(String[] args) {
		
		
		/* 콘솔 입력 : 콘솔에서 값을 입력 받는 것을 의미
		 * Scanner 클래스 => 콘솔에서 값을 입력받을 수 있게 해주는 클래스
		 * Scanner 객체명
		 * 
		 * 클래스 객체명 = new 클래스
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자(정수)를 입력해주세요");
		int num = scan.nextInt();
		System.out.println("내가 입력한 수 : " + num);
		
		/* Scanner 객체에 .을 찍어 자료형에 따라 메서드가 다르다.
		 * scan.next(); => String
		 * scan.next().charAt(0); => char
		 * scan.nextInt(); => int
		 * scan.nextDouble(); => double
		 * scan.nextLong(); => long
		 */
		
		// 콘솔에서 숫자를 하나 입력 받아 수가 짝수인지 홀수인지 출력
		
		if(num % 2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
		
		scan.close();
		
		
		// 숫자를 입력 받아 양수인지, 음수인지, 0인지 판별하여 출력.
		
		Scanner scan2 = new Scanner(System.in);
		System.out.println("숫자를 입력하여 주십시오.");
		double num2 = scan2.nextDouble();
		if(num2 > 0) {
			System.out.println("양수");
		} else if(num2 == 0){
			System.out.println("0");
		} else {
			System.out.println("음수");
		}
		
		System.out.println("---------------------");
		
		System.out.println("실수 입력 > ");
		double num3 = scan2.nextDouble();
		System.out.println("실수 > " + num3);
		
		System.out.println("한글자 입력 >");
		// next() : 문자열
		// charAt(index) : 문자열 중 index 번지 한글자 추출
		// index 번지는 0부터 시작
		char ch = scan2.next().charAt(0); // 문자열 중 한글자를 입력 받는 형태
		// ex) abcd 를 입력해도 0번지인 a만 추출
		System.out.println("한글자 > " + ch);
		
		// 문자열 입력 : next() => 공백 포함 안됨. 즉 띄어쓰기 불가능
		System.out.println("문자열 > ");
		String str = scan2.next();
		System.out.println("문자열 > " + str);
		
		
		// nextline()은 enter 공백을 앞에서 처리해주면 뒤에서 받지 않는다.
		scan2.nextLine(); // enter 처리용 ★
		
		
		// ★★★ 여러 문자 입력 : nextLine() => 공백 포함 가능
		System.out.println("여러 문자 > ");
		String str2 = scan2.nextLine();
		System.out.println("여러문자 > " + str2);
						
		scan2.close();
		

	}

}
