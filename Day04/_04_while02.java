package Day04;

public class _04_while02 {

	public static void main(String[] args) {
	
		
		/* 2 4 6 8 10
		 * 12 14 16 18 20
		 * 22 24 26 28 30
		 * ...
		 * 
		 * 1~50까지 짝수만 출력
		 * 5개씩 한줄로
		 */

		int i = 0;
		while(i<=50) {
			i++;
			if(i%10 == 0) {
				System.out.println(i);
			}else if(i%2 == 0) {
				System.out.print(i +" ");
			}	
		}
		
		System.out.println("-----");
		
		int j=0;
		for(j=1; j<=50; j++) {
			if(j%10 == 0) {
				System.out.println(j);
			}else if(j%2 == 0) {
				System.out.print(j+" ");
			}
		}
		
		System.out.println("-----");
		
		// 선생님 답안
		for(i=1; i<=50; i++) {
			if(i%2==0) {
				System.out.print(i+" ");
				if(i%10==0) {
					System.out.println();
				}
			}
		}
		
		System.out.println("-----");
		
		int k=0;
		while(k<=50) {
			k++;
			if(k%2==0) {
				System.out.printf("%3d", k);
				} // printf 지시자 설정으로 우측 정렬 가능.
			if(k%10==0) {
				System.out.println();
			}
		}
		
		System.out.println("-----");
		System.out.println("출력구문");
		/* System.out.println : 줄바꿈을 포함하는 출력 => 아무 값이 없어도 줄바꿈 자체가 하나의 출력이므로 error 없음 
		 * System.out.print : 줄바꿈이 없는 출력 => 값이 없으면 어떤 출력도 없으므로 error 발생
		*/
		
		 /* System.out.printf : 지시자를 이용한 출력
		  * %n(\n 줄바꿈), %d(정수형), %f(실수형), %c(문자), %s(문자열)
		  * 소수점 설정, 공백(띄어쓰기) 설정 가능
		 */
		
		System.out.printf("%.2f %n", 1.23456789);
		
		int num1 = 5;
		int num2 = 3;
		// 5 + 3 = 8
		System.out.printf("%d + %d = %d %n",num1,num2,(num1+num2));
		
		double num3 = 1.23;
		double num4 = 5;
		// 1.23 / 5 = 값
		System.out.printf("%.1f/%.1f=%.1f%n",num3,num4,(num3/num4));
		
		
		
		
		
		
		
		
		
	}

}
