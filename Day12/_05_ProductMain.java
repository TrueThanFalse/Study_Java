package Day12;

import java.util.Scanner;

public class _05_ProductMain {
	
	public static void main(String[] args) {
		
		/* Product 클래스을 사용하여 배열 생성[10]
		 * Product 클래스의 메뉴 추가 메서드를 사용해서 배열에 추가
		 * n을 누를때까지 반복되는 상품 등록
		 * y = 등록, n = 취소
		 * y => 상품 이름과 가격을 등록 받아 배열에 등록
		 * n => 등록된 제품 리스트 출력
		 * 상품 등록 후 상품리스트 출력
		 */
		
		Scanner scan = new Scanner(System.in);
		_05_Product[] pack = new _05_Product[10];		
		 
		int cnt=0;
		char choice;
		String inName;
		int inPrice;
		
		a: for(int i=0; i<pack.length; i++) {
			System.out.println("상품을 추가 하시겠습니까?");
			System.out.println("y OR n");
			choice = scan.next().charAt(0);
			if(choice == 'y') {
				System.out.println("<상품 추가>");
				System.out.println("상품명을 입력하세요>");
				inName = scan.next();
				System.out.println("가격을 입력하세요>");
				inPrice = scan.nextInt();
				_05_Product product = new _05_Product(inName, inPrice);
				pack[i] = product;
				cnt++;
			}else if(choice == 'n') {
				for(int j=0; j<cnt; j++) {
					pack[j].print();
				}
				break a;
			}else if(choice != 'y' && choice != 'n') {
				System.out.println("잘못된 입력입니다.");
				break a;
			}
					
		}
		
		System.out.println("-----");
		
		for(int i=0; i<cnt; i++) {
			pack[i].print();
		}
		
		scan.close();

	}

}
