package Day16;

public class _02_Exception02 {

	public static void main(String[] args) {

		// try ~ catch문을 사용하여 예외 처리
		// 나누기 0 넣어서 실행
		try {
			System.out.println(calc(4, 0, '+'));
			System.out.println(calc(4, 0, '-'));
			System.out.println(calc(4, 0, '*'));
//			System.out.println(calc(4, 0, '!'));
			System.out.println(calc(4, 0, '/'));
			System.out.println(calc(4, 0, '%'));
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("계산 종료");
		
//		_02_Exception02 tmp = new _02_Exception02();
//		
//		int num1 = 3;
//		int num2 = 0;
//		
//		try {
//
//			System.out.println(tmp.sum(num1, num2));
//			System.out.println(tmp.sub(num1, num2));
//			System.out.println(tmp.mul(num1, num2));
//			System.out.println(tmp.div(num1, num2));
//			System.out.println(tmp.rem(num1, num2));
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

	}
	
	
	// 두 수, 연산자를 입력 받아 사칙연산을 수행하고 결과를 리턴하는 메서드 생성
	
	public int sum(int num1, int num2) {
		return num1 + num2;
	}
	
	public int sub(int num1, int num2) {
		return num1 - num2;
	}
	
	public int mul(int num1, int num2) {
		return num1 * num2;
	}

	public double div(int num1, int num2) {
		return num1 / num2;
	}
	
	public int rem(int num1, int num2) {
		return num1 % num2;
	}
	
	public static double calc(int num1, int num2, char op) throws RuntimeException{ // throws RuntimeException 생략 가능
		double result = 0; // 리턴 값을 담을 변수
		// 예외가 발생할 수 있는 상황을 미리 앞에서 처리
		// throw를 발생 시키게 되면 예외를 메서드를 호출하는 객체에게 넘기는 현상 (예외 떠넘기기)
		// throw를 발생 시키게 되면 메서드 선언부 끝에 throws 발생할 수 있는 예외를 반드시 작성해야 함
		// RuntimeException는 생략가능
		if((op=='/' || op=='&') && num2 ==0) {
			throw new RuntimeException("num2는 0이 될 수 없습니다.");
		}
		switch(op) {
		case '+' : result = num1 + num2; break;
		case '-' : result = num1 - num2; break;
		case '*' : result = num1 * num2; break;
		case '/' : result = num1 / num2; break;
		case '%' : result = num1 % num2; break;
		default:
			throw new RuntimeException(op+"는 산술 연산자가 아닙니다.");
		}
		return result;
	}
	
}
