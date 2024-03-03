package Day03;

public class _05_For05 {

	public static void main(String[] args) {
		
		
		/* 최소 공배수
		 * 공배수란? 공통된 배수
		 * 10 : 10 20 30 40 50 ...
		 * 15 : 15 30 45 60 ...
		 * 공배수 : 30 60 90 ...
		 * 최소공배수 : 30
		 */
		
		//for (1~10까지 X)
//		int i=0;
//		int num1 = 10;
//		int num2 = 15;
//		for(num=num1*i; ; i++) {
//			if(num2*i % num1 == 0) {
//				System.out.println("최소공배수: " + i);
//				break;
//			}
//		}
		
		// 선생님 답안
		
		int num1 = 10;
		int num2 = 15;
		for(int i = num1; ; i+=num1) { // 10 20 30 40 50...
			if( i % num1 == 0 && i % num2 == 0) {
				System.out.println("두 수의 최소공배수: " + i);
				break;
			}
		}
		
		
	}

}
