package Day07;

public class _01_Method04 {

	public static void main(String[] args) {
		
		/* 메서드 : 기능을 하기위한 하나의 코드 조각 (기능정의서)
		 * 
		 * 접근제한자 리턴타입 메서드명(매개변수) { 
		 * 코드;
		 * }
		 * 
		 * return : 
		 *  -역할 1. 메서드에서 전달해야하는 값을 리턴타입으로 전달함
		 *  -역할 2. 메서드를 종료 함
		 */
		
		/* 문제. 메서드 생성하세요.
		 * 1. 랜덤(1~100) 정수 5개를 배열에 담는 메서드 (정수 배열을 리턴)
		 * 2. 배열을 전달 받아서 평균을 연산하는 메서드 (평균을 리턴)
		 * 3. 배열의 정수 5개와 평균을 출력하는 메서드 (출력)
		 * 메인에서는 연산식이 있으면 안 됨
		 * 메서드간의 데이터 전달 및 호출만 있어야 함.
		 */
		
		int[] arr = randomArray(5);
		avg(arr);
		out(arr);
		
		System.out.println("-----");
		
		// 선생님 답안
		// 랜덤 생성 메서드 호출
		int arr2[] = random();
		double avg = average(arr2);
		print(arr2, avg);
		
		System.out.println("-----");
		
		// 메서드 간의 호출
		average();
		
	}
	
	/* 랜덤(1~100) 정수 5개를 배열에 담는 메서드 (정수 배열을 리턴)
	 * 리턴타입 : int
	 * 매개변수 : int, 배열 총량
	 * 메서드명 : random
	 */
	
	public static int[] randomArray(int num) {
		int[] arr = new int[num];
		for(int i=0; i<num; i++) {
			arr[i] = (int)(Math.random()*100)+1;
		}
		return arr;
	}
	
	
	/* 배열을 전달 받아서 평균을 연산하는 메서드 (평균을 리턴)
	 * 리턴타입 : double
	 * 매개변수 : 배열명
	 * 메서드명 : avg
	 */
	
	public static double avg(int[] name) {
		double sum = 0;
		for(int i=0; i<name.length; i++) {
			sum += name[i];
		}
		double avg = sum / name.length;
		return avg;
	}
	
	
	
	/* 배열의 정수 5개와 평균을 출력하는 메서드 (출력)
	 * 리턴타입 : double
	 * 매개변수 : 배열명
	 * 메서드명 : out
	 */
	
	public static void out(int[] name) {
		for(int i=0; i<name.length; i++) {
			System.out.println("배열의 "+i+"번지에 저장 된 값 : "+name[i]);
		}
		System.out.println("평균 : " + avg(name));
		
		// 메서드 avg를 호출하면 평균을 따로 계산할 필요가 없다.
//		avg = sum / name.length;
//		System.out.println("평균 : "+avg);
		return;
	}
	
	
	
	// 선생님 답안 (메서드 호출 없이 매개변수로만 작성)
	
	/* 랜덤(1~100) 정수 5개를 배열에 담는 메서드 (정수 배열을 리턴)
	* 리턴타입 : 정수 배열 => int[]
	* 매개변수 : X
	* 메서드명 : random
	*/
	public static int[] random() {
		int arr[] = new int[5];
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*100)+1;
			// return arr; => for문 내부의 return은 단 한번도 return이 없을 수 있으므로 error 발생 함
		}
		return arr;
	}
	
	/* 배열을 전달 받아서 평균을 연산하는 메서드 (평균을 리턴)
	 * 리턴타입 : 평균을 리턴 => double
	 * 매개변수 : 배열 => int arr[] 또는 X
	 * 메서드명 : average
	 */
	
	public static double average(int arr[]) { // 매개변수에 랜덤수를 생성한 배열이 이미 있다.
		// 계산만 하면 됨
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		return (double)sum / arr.length;
	}
	
	/* 메서드 간의 호출 활용
	 * 배열을 전달 받아서 평균을 연산하는 메서드 (평균을 리턴)
	 * 리턴타입 : X
	 * 매개변수 : X
	 * 메서드명 : average
	 */
	
	// 메서드 오버로딩 : 같은 메서드명을 사용해도, 매개변수의 종류나, 개수가 다르면 사용 가능 함
	public static void average() {
		// 랜덤수 생성을 위해 random 메서드를 호출해야 함
		int arr[] = random(); // 랜덤 배열 생성
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		double avg = sum / arr.length;
		// print 호출
		print(arr, avg);
	}
	
	/* 배열의 정수 5개와 평균을 출력하는 메서드 (출력)
	 * 리턴타입 : void(없음)
	 * 매개변수 : 정수배열, 평균 => int arr[], double avg
	 * 메서드명 : print
	 */
	
	public static void print(int arr[], double avg) {
		System.out.println("5개의 랜덤 정수 값");
		// System.out.println(arr); => 주소만 출력 됨
		for(int temp : arr) {
			System.out.print(temp + " ");
		}
		System.out.println(); // 줄바꿈
		System.out.println("평균 : "+avg);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}