package Day02;

public class _01_MathClass {

	public static void main(String[] args) {
		
		
		/* Math.method
		 * 반올림 => Math.round : 소수점의 자리수는 무조건0
		 * Math.ceil : 올림, Math.floor : 버림
		 */
		
		double num = 34.6666;
		
		System.out.println(Math.round(num)); // 35
		System.out.println(Math.ceil(num)); // 35.0
		System.out.println(Math.floor(num)); // 34.0
		
		/* 어시스턴트를 보면 Math.round의 경우 long 타입을 return 해준다. 따라서 아래와 같이 에러가 발생 할 수 있다.
		 * int roundNum = Math.round(num); => Math.round의 return이 long 타입 이므로 범위가 long 보다 작은 int에 저장 할 수 없다. 에러 발생.
		 * 따라서 아래와 같이 자료형 변환이 필요.
		 * int roundNum = (int)Math.round(num);
		 * long roundNum = Math.round(num);
		*/
		
		// Math.max : 두 값 중 최대값, Math.min : 두 값 중 최소값
		
		double num2 = 37.4444;
		System.out.println(Math.max(num, num2)); // 37.4444
		System.out.println(Math.min(num, num2)); // 34.6666
		
		/* ★★★ Math.random : 0과 1사이의 아무값을 리턴. (0은 포함) 
		* 0 <= random < 1
		* (int)(Math.random()*10)+1 : 1부터 10까지의 정수를 얻는 코드
		* 곱하는 숫자가 곧 최대값의 범위이다. (최대값 자체는 포함 하지 않음)
		* 
		* Start부터 시작하는 n개의 정수 중 임의의 정수 하나를 랜덤 추출
		* int 변수 = (int)(Math.random()*n) + start(1,2,3...);
		*/
		
		System.out.println(Math.random()); // 0은 포함, 1은 미포함 => 일반적으로 코딩에서 시작은 포함, 끝은 미포함
		System.out.println(((int)Math.random()*10)+1); // 0*10 + 1 => 1
		System.out.println((int)(Math.random()*10)+1); // (0<=x<1)*10 + 1 => 1~10
		
		
	}

}
