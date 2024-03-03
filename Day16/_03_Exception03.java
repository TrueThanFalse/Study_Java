package Day16;

public class _03_Exception03 {

	public static void main(String[] args) {
		
		/* 자주 발생하는 예외 코드 List
		 * 자주 발생되는 Exception 종류
		 * - ClassCastException : 수행할 수 없는 타입 변환이 진행될 경우
		 * - ArrayIndexOutOfBoundsException : 배열에 잘못된 인덱스를 사용하여 접근할 경우
		 * - NullPointerException : null 객체의 인스턴스 메소드를 호출하는 등의 경우
		 * - ArithmeticException : 산술 연산에서 정수를 0으로 나누는 등 연산을 수행할 수 없는 경우
		 */

		// ArithmeticException : / by zero => 0으로 나누었을 때
		//System.out.println(1/0);
		
		// ArrayIndexOutOfBoundsException : 배열의 번지가 넘어갔을 때
		int arr[] = new int[5];
		//arr[6] = 1;
		
		
		// ClassCastException : 클래스의 캐스팅이 잘못 되었을 때(형변환 오류)
		P p = new P();
		//C c = (C)p;
		
		// NullPointerException : 객체가 생성 되지 않은 경우
		C c = null;
		//c.print();
	}

}

class P{
	int num = 10;
}
class C extends P{
	int num1 = 100;
	
	public void print() {
		System.out.println(num1);
	}
}