package Day05;

public class _02_Array03 {

	public static void main(String[] args) {
		
		// 문제. 1~10까지 담고 있는 배열 arr를 생성 후 출력
		
		int size = 10;
		int[] arr = new int[size];
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		System.out.println("-----");
		
		// 내림차순으로 정렬하라
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		// 출력 방법은 2가지 방법 모두 가능
		for(int temp : arr) {
			System.out.print(temp+" ");
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		
	

	}

}
