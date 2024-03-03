package Day04;

import java.util.Scanner;

public class _01_Break01 {

	public static void main(String[] args) {
		
		
		/* Break문 : 반복문을 빠져나오게 하는 키워드
		 * - 반복문에서 조건문을 동반하여 조건을 만족하면 반복문을 벗어나는 역할
		 * - 다중 for문에서는 나를 포함하는 for문만 벗어날 수 있다.
		 * - 바깥쪽 for문을 벗어나고 싶다면 for문에 닉네임을 붙여 벗어날 수 있다. (아래 예시는 a가 닉네임)
		 * ex)
		 * a: for() {
		 * 		if() {
		 * 			break a;
		 * 		}
		 * }
		 */
		
		/* 1~10까지 출력
		 * 조건식을 생략(무한루프) break를 이용하여 10이되면 벗어나게 설정
		 */
		for(int i=1; ; i++) {
			System.out.print(i+ " ");
			if(i == 10) {
				break;
			}
		}
		System.out.println();
		
		
		/* 한 글자를 입력 받아서 글자를 그대로 출력 (반복해서 출력)
		 * y를 입력받으면 종료
		 * a->a, b->b, ... y => 종료
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("한 글자를 입력해주세요.");
		char ch = scan.next().charAt(0);
		
		/* char 대신 String을 사용하면 String은 객체로서 ==(같다)가 주소를 입력 받는다.
		 * 따라서 String에서 ==(같다)를 사용하려면 equal 메서드를 활용해야 한다.
		 * 기본 데이터인 char 타입을 활용하면 메서드 코드 없이 바로 비교가 가능하다.
		 */
		for(; ;) {
			if(ch == 'y') {
				System.out.println("종료!");
				break;
			}else {
				System.out.println("새로운 글자를 입력해주세요.");
				ch = scan.next().charAt(0);
			}
			
		}
		scan.close();
		
				
		// 선생님 답안
//		Scanner scan = new Scanner(System.in);
//		for(;;) { // 무한루프
//			char ch2 = scan.next().charAt(0);
//			if(ch == 'y') {
//				break;
//			}
//			System.out.println(ch2);
//		}
//		
//		scan.close();

		
	
	}

}
