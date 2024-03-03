package Day04;

public class _07_이중For01 {

	public static void main(String[] args) {
		

		/* 별찍기
		 * *****
		 * *****
		 * *****
		 * *****
		 * *****
		 * 5 * 5 별찍기
		 */
		
		int i=0;
		int j=0;
		for(i=1; i<=5; i++) {      // 1일때    2일때...
			for(j=1; j<=5; j++) {  // 1~5반복  1~5반복...
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("-----");
		
		/* *
		 * **
		 * ***
		 * ****
		 * *****
		 */

		for(i=1; i<=5; i++) {
			for(j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("-----");
		
		for(i=1; i<=5; i++) {
			for(j=1; j<=5; j++) {
				System.out.print("*");
				if(i==j) {
					break;
				}
			}
			System.out.println();
		}
		
		System.out.println("-----계단별-----");
		
		/*     *  	i=1, 공백=4, *=1
		 *    **	i=2, 공백=3, *=2
		 *   ***	i=3, 공백=2, *=3
		 *  ****	i=4, 공백=1, *=4
		 * *****	i=5, 공백=0, *=5
		 */
		

		for(i=1; i<=5; i++) {
			for(j=4; 0<=j; j--) {
				if(j>=i) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		
		// 선생님 답안
		// if문 활용
		for(i=1; i<=5; i++) {
			for(j=1; j<=5; j++) {
				if(j <= (5-i)) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		// for문 활용
		for(i=1; i<=5; i++) {           // 1     2
			//공백
			for(j=1; j<=5-i; j++) {     // 1~4   1~3
				System.out.print(" ");
			}
			//별
			for(int k=1; k<=i; k++) {   // 1~1   1~2
				System.out.print("*");
			}
			System.out.println();
		}
		
			
		
		
		
		
		
		
		
		
	}
}