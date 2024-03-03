package Day09;

public class _03_MethodEx02 {

	public static void main(String[] args) {
		
		// 두 정수의 사칙연산( + - / * &)을 처리
		
		
		_03_MethodEx02 me = new _03_MethodEx02();
		int a = 5;
		int b = 8;
		
		int sum = me.sum(a, b);
		System.out.println(sum);
		int sub = me.sub(a, b);
		System.out.println(sub);
		int mul = me.mul(a, b);
		System.out.println(mul);
		double div = me.div(a, b);
		System.out.println(div);
		int rem = me.rem(a, b);
		System.out.println(rem);

	}
	
	
	// 사칙 연산 메서드를 static 없이 생성
	public int sum(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}
	
	public int sub(int num1, int num2) {
		int sub = num1 - num2;
		return sub;
	}
	
	public int mul(int num1, int num2) {
		int mul = num1 * num2;
		return mul;
	}
	
	public double div(int num1, int num2) {
		double div = (double)num1 / num2;
		return div;
	}
	
	public int rem(int num1, int num2) {
		int rem = num1 % num2;
		return rem;
	}

}
