package Day12;

import java.util.Scanner;

public class _05_ProductMainAnwser {

	public static void main(String[] args) {
		
		/* 반복적으로 메뉴를 등록하는 프로그램
		 * y/n 으로 등록과 취소
		 * 취소하면 등록 리스트 출력
		 */
		
		_05_ProductAnwser[] p = new _05_ProductAnwser[10];
		// 배열만 만들었을뿐 내용물(실제 객체)은 아직 존재 하지 않는다.
		// System.out.println(p[0].getName()); // 0번지의 name을 얻어와도 객체 자체가 존재 하지 않아 error 발생
		
		Scanner scan = new Scanner(System.in);
		
		char menu = 'y';
		int cnt = 0; // while에서 index를 컨트롤 하기 위한 변수
		
		while(menu != 'n') {
			System.out.println("상품 등록(y OR n) >>");
			menu = scan.next().charAt(0);
			if(menu == 'y') {
				System.out.println("상품명 >");
				String name = scan.next();
				System.out.println(("가격 >"));
				int pirce = scan.nextInt();
				
				// '객체를 생성'!!!해서 메뉴와 가격을 등록 => 배열의 cnt 번지에 추가
				// 객체를 생성하지 않고 p[] 배열에 set을 하더라도 객체 자체가 존재 하지 안항 error 발생
				
				// 생성자 이용 방식
//				_05_ProductAnwser tmp = new _05_ProductAnwser(name, price);
//				p[cnt] = tmp;
				
				// 메서드 이용 방식
				p[cnt] = new _05_ProductAnwser();
				p[cnt].insertProduct(name, pirce);
				cnt++; // index 증가
				
			}else { // menu == n
				if(menu == 'n') {
					System.out.println("상품 등록 종료");
				}else {
					System.out.println("y OR n 중 다시 입력해주세요.");
				}
			}
		}

		System.out.println("---등록된 상품 리스트---");
		for(int i=0; i<cnt; i++) {
			// toString
			System.out.println((i+1)+". "+p[i]);
			
			// 출력 메서드를 사용할 경우
			System.out.print((i+1)+". ");
			// p[i].프린트 메서드 호출
		}
		
	}

}
