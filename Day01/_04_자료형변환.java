package Day01;

public class _04_자료형변환 {
	
	public static void main(String[] args) {
	
		
		/* 자료형 변환 : casting
		 * 자료형(변수의 타입)
		 * a = b : a의 자료형과 b의 자료형이 같지 않다면 오류가 발생 함.
		 * 자료형 변환을 통해 양쪽의 자료형을 맞춰줄 수 있다.
		 * 
		 * 자동 자료형 변환 : 자료형 변환시 생략해도 문제가 되지 않는 상황. => 크기가 큰 자료형에 크기가 작은 자료형을 담는 상황.
		 * 크기가 큰 자료형(int) = 크기가 작은 자료형(byte)
		 * 
		 * 명시적 자료형 변환 : 리터럴 값 앞에 (타입) 작성
		 */
		
		byte num1 = 10;
		int num2 = num1; // int = byte (자동 형변환 가능)
		
		double num3 = 10.2;
		// num2 = num3; // int = double (자동 형변환 불가능 => 명시적 형변환을 해야 함.)
		num2 = (int)num3; // int = double (자동 형변환 불가능 => 명시적 형변환을 해야 함.)
		System.out.println(num2); // 10 소수점이 버려 짐. int 자료형이므로
		
		int num4 = (int)1.2; // int 자료형이므로 소수점은 버려짐.
		System.out.println(num4); // 1
		
		// 문제 3. 국어, 영어, 수학 세 값의 합계와 평균을 출력 (소수점 살려서)
		
		double a, b, c;
		a = 55.3;
		b = 43.2;
		c = 23.2;
		double sum1 = a + b + c;
		double avg1 = sum1 / 3;
		System.out.println("합계: " + sum1 + " 평균: "+avg1);
				
		// 자료형 변환 활용
		int d, e, f;
		d = 43;
		e = 55;
		f = 23;
		int sum2 = d + e + f;
		double avg2 = (double)sum2 / 3;
		System.out.println(sum2); // 121
		System.out.println(avg2); // 40.33333
		
		// 자로형이 double이고, 나누는 값이 0이면 => Infinity
		// 자료형이 int 이고, 나누는 값이 0이면 => 예외발생(Exception)
		
		System.out.println(avg1/0); // Infinity
		System.out.println(d/0); // Exception
	}
}
