package Day04;

public class _02_Continue01 {

	public static void main(String[] args) {
		
		
		/* continue : pass(skip) 건너뛰기 키워드
		 * 1~10까지 출력, 단 5만 빼고
		 */
		
		for(int i=1; i<=10; i++) {
			if(i==5) {
				continue;	// 조건에 맞다면 건너뛰기
			}
			System.out.print(i +" ");
		}
		System.out.println();
		
		/* 1~10까지 중 홀수만 출력
		 * 짝수일때 continue를 활용하여 skip 할 것
		 */
		
		for(int i=1; i<=10; i++) {
			if(i%2 == 0) {
				continue;
			}
			System.out.print(i +" ");
		}
		
		
		
		
		
		
		

	}

}
