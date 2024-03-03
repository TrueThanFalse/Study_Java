package Day16;

public class _06_ExceptionEx01 {

	public static void main(String[] args) {

		_06_ExceptionEx01 tmp = new _06_ExceptionEx01();
		int[] arr = null;
		int[] arr2 = null;
		
		try {
			arr = tmp.arr1(5, -1, 10); // 배열 리턴 메서드
			tmp.arr2(arr2, 1, 10);
		} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
		}
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]+" ");
		}
		
		
		
	}

	// 메서드 생성
	/* 기능 : 배열의 길이가 주어지면 길이 만큼 배열을 생성하여 배열을 돌려주는 메서드 (매개변수 = size, start, count)
	 * 			배열 안에 random 값(1~10)을 채워서 리턴, start와 count 매개변수, start=1, count=10
	 * 			- size가 0보다 작다면 예외발생
	 * 			- start가 0보다 작다면 예외발생
	 * 			- throws 생략 가능
	 */
	
	public int[] arr1(int size, int start, int count) throws RuntimeException{
		if(size < 0) {
			throw new RuntimeException("배열의 크기가 0보다 작을 수 없습니다.");
		}
		if(start < 0) {
			throw new RuntimeException("숫자의 시작 값은 0보다 작을 수 없습니다.");
		}
		int[] arr = new int[size];
		for(int i=0; i<arr.length; i++) {
			int r = (int)(Math.random()*count)+start;
			arr[i] = r;
		}
		return arr;
	}
	
			
	/* 기능 : 배열을 받아서 배열에 랜덤 값을 채우는 메서드 (매개변수 = arr, start, count)
	 * 			- arr 배열이 null일 경우 예외발생
	 * 			- arr 배열의 길이가 0보다 작을 경우 예외발생
	 */
	
	public void arr2(int[] arr, int start, int count) throws Exception{
			if(arr == null) {
				throw new Exception("배열의 값이 Null 입니다.");
			}
			if(arr.length < 0) {
				throw new Exception("배열의 길이는 0보다 작을 수 없습니다.");
			}
			for(int i=0; i<arr.length; i++) {
				arr[i] = (int)(Math.random()*count)+start;
			}
	}
			
}
