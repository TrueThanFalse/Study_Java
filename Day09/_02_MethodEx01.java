package Day09;

public class _02_MethodEx01 { // class의 public은 파일명과 일치하는 class만 가능, public class는 오직 1개 
	// 멤버변수 자리
	
	
	
	
	// 메서드 자리
	public static void main(String[] args) { // JVM은 가장 먼저 mail을 찾음
		
		// num1과 num2 숫자 두개를 주고 두 수의 합을 리턴하는 메서드
		
		// 메서드는 메서드를 선언하는 것으로 기능 하지 않음
		  
		int a = 3;
		int b = 5;
		
		// 메서드는 호출하는 것으로 기능 함
		// 호출 : 반복적으로 호출 가능 (여러번 호출 가능)
		
		int hap = sum(a,b);
		System.out.println(hap);
		sum2(a,hap);
		// System.out.println(sum2(a,b)); // 리턴이 없어서 sys.out이 받을것이 없으므로 error 발생 
		
		// static이 없는 메서드 호출
		// 객체 생성 필요 : 클래스 _02_MethodEx01
		// int hap2 = sum3(a,b) // error 발생
		
		// 같은 클래스 내부 인데도 객체를 생성하는 이유는 => 현재 실행 Method가 static을 포함하는 main 메서드이기 때문
		_02_MethodEx01 me = new _02_MethodEx01(); // 객체 생성
		int hap2 = me.sum3(b, hap);
		System.out.println(hap2);
		
	}
	
	// 다음 메서드
	/* 기능 : 두 정수의 합을 리턴하는 메서드
	 * 리턴타입 : 정수 => int
	 * 매개변수 : 두 정수 => int num1, int num2
	 */
	public static int sum(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}
	
	// 메서드 오버로딩 : 같은 이름의 메서드를 여러개 정의 하는 것
	// 메서드 오버로딩이 가능하려면
	// 매개변수의 자료형 종류가 다르거나 개수가 다르거나
	
	// 다음 메서드
	// 기능 : 두 정수의 합을 출력하는 메서드
	// 리턴타입 : 없음 => void
	// 매개변수 : 두 정수 => int num1, int num2
	// void는 보통 출력할 때 활용
	public static void sum2(int num1, int num2) {
		System.out.println(num1+num2);
	}
	
	public int sum3(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}
	
	public void sum4(int num1, int num2) {
		System.out.println(num1+num2);
	}
	
	
	
	
	
	

}

// 클래스 자리
