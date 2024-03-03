package Day08;

public class _01_Method08 {

	public static void main(String[] args) {
		
		/* 배열이 주어졌을 때
		 * 1. 배열을 정렬하는 메서드
		 * 2. 배열 5개씩 출력하는 메서드
		 */
		
		int[] arr = new int[] {1,2,9,13,7,5,6,10,4,8,3,11,12,14,15,17,16};
		
		printArray(arr);
		// 호출 단축키 ctrl + spacebar
		// ex) pr 입력 후 ctrl + spacebar

		System.out.println();
		System.out.println("---정렬 후---");
		
		sortArray(arr);
		printArray(arr);
		
		System.out.println();
		System.out.println("------");
		
		int size = 17;
		int[] arr2 = randomArray(size);
		printArray(arr2);
		
		System.out.println();
		System.out.println("---정렬 후---");
		
		sortArray(arr2);
		printArray(arr2);
		

		
	}
	
	/* 배열을 받아서 콘솔에 출력하는 메서드
	 * 리턴타입 : void
	 * 매개변수 : 배열 => int[]
	 * 옆으로 출력하되 5개씩 한줄로 나열하여 출력
	 */
	
//	public static void printArray(int[] arr) {
//		for(int i=0; i<3; i++) {
//			for(int j=0; j<arr.length; j++) {
//				System.out.print(arr[j]+" ");
//			}
//			System.out.println();
//		}
//		return;
//	}
	
	//solution
	public static void printArray(int[] arr) {
//		for(int i=0; i<arr.length; i++) {
//			if(i%5==0 && i!=0) { // i!=0 => i가 0일때는 줄바꿈 하지 마라
//				System.out.println();
//			}
//			System.out.println(arr[i]+" ");
//		}
		
		int row = (int)Math.ceil((double)arr.length / 5); // Math.ceil : 올림
		int cnt = 0;
		a: for(int i=1; i<=row; i++) { // 행
			for(int j=1; j<=5; j++) { // 열
				System.out.print(arr[cnt]+" ");
				cnt++;
				if(cnt==arr.length) {
					break a;
				}
			}
			System.out.println();
		}
	}
	
	/* 주어진 정수 배열을 정렬하는 기능
	 * 리턴타입 : 정수 배열 -> 내 생각은 틀렸음
	 * - void 가 정답이다 => 정렬은 받은 배열에서 정렬 되는 것이다.
	 * - 리턴을 하면 정렬된 새로운 배열이 생성 되는것이다.
	 * - 메모리 낭비 발생 
	 * 매개변수 : 정수 배열
	 */
	
	public static void sortArray(int[] arr) {
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] > arr[j]) { // 오름차순 정렬
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return; 
	}
	
	// 지역변수는 리턴을 해야만 실제 값이 변경 됨.
	// 객체는 리턴을 안해도 객체가 변하면 객체 값은 변함. 단, 리턴을 안 했으므로 주소는 동일 함
	
	
	
	/* 새로운 배열을 만들어서 랜덤수를 채워 리턴하는 메서드
	 * 랜덤수 범위는 (1~100까지)
	 * 배열의 길이를 매개변수로 받음
	 * 
	 * 리턴타입 : 정수 배열 = int[]
	 * 매개변수 : 배열 길이 => int
	 */
	
	public static int[] randomArray(int size) {
		int[] arr = new int[size];
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*100)+1;
		}
		return arr;
	}

}
