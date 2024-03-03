package Day02;

public class _06_Switch01 {

	public static void main(String[] args) {
		
		
		/* switch문 : 값에 따라 케이스를 달리 주는 형식
		 * break; 문구 중요
		 * 
		 * switch(변수 또는 식) {
		 * case 값1 : 실행문1; 
		 * 		break;
		 * case 값2 : 실행문2; 
		 * 		break;
		 * case 값3 : 실행문3; 
		 * 		break;
		 * 		default : 나머지 실행문; // break 생략 가능(필요시 break 넣을 수 있음)
		 * }
		 * 
		 * break; : switch문을 빠져나갈때 사용
		 */
		
		int num =2;
		switch(num) {
		case 1 :
			System.out.println("num은 1입니다.");
			break;
		case 2 :
			System.out.println("num는 2입니다.");
			break;
		case 3 :
			System.out.println("num는 3입니다.");
			break;
			default:
				System.out.println("잘못된 입력입니다");
		}

		// 문제. 1~6까지의 수(n)를 랜덤으로 추출하고 주사위 : n칸 전진 출력
		
		int random = (int)(Math.random()*6) + 1; // 0*6(0 포함)+1 ~ 1*6(6 미포함)+1 => 1~6까지
		System.out.println("주사위 : " + random + "칸 전진");
		
		// 문제. switch문을 활용하여 1~6까지의 수를 랜덤으로 추출하여 주사위 : n칸 전진 출력
		
		int random2 = (int)(Math.random()*6) + 1;
		switch(random2) {
		case 1 :
			System.out.println("주사위 : " + random + "칸 전진"); break;
		case 2 :
			System.out.println("주사위 : " + random + "칸 전진"); break;
		case 3 :
			System.out.println("주사위 : " + random + "칸 전진"); break;
		case 4 :
			System.out.println("주사위 : " + random + "칸 전진"); break;
		case 5 :
			System.out.println("주사위 : " + random + "칸 전진"); break;
		case 6 :
			System.out.println("주사위 : " + random + "칸 전진"); break;
			default : System.out.println("잘못된 주사위 값");		
		}
				
		
	}

}
