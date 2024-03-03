package Day04;

public class _03_While01 {

	public static void main(String[] args) {
		
		
		/* while : 반복문 중 하나
		 * ex)
		 * while(조건식) {	// 조건식이 true일때 반복 됨
		 * 실행문;
		 * 증감식;
		 * }
		 * 
		 * { } 내부에 false이 나오도록 증감식이 필수적으로 필요하다.
		 * 증감식이 없다면 무한루프에 빠진다.
		 */
		
		// 1~10까지 출력
		for(int i=1; i<=10; i++) {
			System.out.print(i +" ");
		}

		System.out.println();
		System.out.println("-----");
		
		int i=1; // 이용할 변수를 미리 초기화 ★
		while(i<=10) {
			System.out.print(i + " ");
			i++;
		}
		
		System.out.println();
		System.out.println("-----");
		
		// 1~10까지 while문을 이용하여 짝수만 출력
		i = 0;
		while(i<=10) {
			i++;
			if(i%2 == 0) {
				System.out.print(i + " ");
			}
		}
		
		
		
		
		
		
	}

}
