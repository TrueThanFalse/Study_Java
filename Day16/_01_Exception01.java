package Day16;

public class _01_Exception01 {

	public static void main(String[] args) {
	
		/* Exception : 예외 처리
		 * => 실행시 발생할 수 있는 예외를 처리하여 정상 처리로 유지시키는 기능
		 * 
		 * 자주 발생되는 Exception 종류
		 * - ClassCastException : 수행할 수 없는 타입 변환이 진행될 경우
		 * - ArrayIndexOutOfBoundsException : 배열에 잘못된 인덱스를 사용하여 접근할 경우
		 * - NullPointerException : null 객체의 인스턴스 메소드를 호출하는 등의 경우
		 * - ArithmeticException : 산술 연산에서 정수를 0으로 나누는 등 연산을 수행할 수 없는 경우
		 * 
		 * Exception 사용법
		 * try ~ catch ~ finally(생략가능)
		 * try : 예외가 발생할 가능성이 있는 문구를 작성
		 * catch : try 구문에서 발생한 예외를 처리
		 * finally : try 구문 외 반드시 실행 되어야 하는 구문이 있을 경우 사용
		 */

		int arr[] = new int[5];
		try {
			// 예외 발생 코드
			arr[0]=45;
			arr[1]=23;
			arr[6] = 1; // 예외 발생 코드
			arr[3]=65; // 실행 안 됨
			// 예외가 발생한 이후 try 코드는 실행 되지 않음
		} catch (Exception e) {
			System.out.println("배열의 범위가 벗어났습니다.");
			e.printStackTrace(); // 예외가 무엇인지 알려 줌
			e.getMessage();
		}
		// 예외 처리 없이 예외가 발생하면 예외 발생 이후의 코드는 실행 되지 않음		

		
		System.out.println("입력이 완료 되었습니다.");
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}

}
