package Day05;

public class _01_Array02 {

	public static void main(String[] args) {
		
		/* Array 예제
		 * 5개의 값을 가지는 배열을 생성
		 * 1~50 사이의 랜덤값을 저장한 후 출력
		 */
		
		int size = 5;
		int[] arr = new int[size];
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*50)+1;
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		System.out.println("-----");
		
		/* 정렬 => 교환 시키기
		 * 숫자들을 작은 것부터 순차대로 정렬(오름차순)
		 * 숫자들을 큰 것부터 순차대로 정렬(내림차순)
		 */
		
		 /* 임시 변수를 활용한 값 교환 방식 
		 * int temp = a;
		 * a = b;
		 * b = temp;
		 */

		/* 정렬(오름차순) 교환, 첫번째 방식
		 * 4 37 23 9 43 
		 * 4 37 23 9 43 => pass1 : 4와 37 비교, 4와 23비교, 4와 9비교 ...
		 * 4 9 37 23 46 => pass2
		 * 4 9 23 37 46 => pass3
		 * 4 9 23 37 46 => pass4
		 */
		
		/* 정렬(오름차순) 교환, 두번째 방식
		 * 4 23 37 9 43
		 * 4 23 9 37 43 => pass1 : 4와 23비교, 23과 37비교, 37과 9와 비교, 37과 43비교
		 * 4 9 23 37 43 => pass2
		 */
		
		// 첫번째 방식 => 이중 for문 필요.
		System.out.println("랜덤값 5개>");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" "); // 랜덤값 5개 확인 용
		}
		
		System.out.println();
		System.out.println("-----");
		
		System.out.println("오름차순 정렬>");
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] > arr[j]) { // 오름차순(>), 내림차순(<)
					// 임시 변수를 활용한 값 교환
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int i=0; i<arr.length; i++) { // 정렬 완료된 배열의 출력을 위한 for문
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		System.out.println("-----");
		
		// 향상된 for문
		System.out.println("향상된 for문>");
		// 배열의 각 번지수에 있는 값을 임시 변수 temp에 저장하고 실행문을 반복 실행
		for(int temp : arr) {
			System.out.print(temp+" ");
		}
		/* 완성되어 있는 배열에 대한 값을 찾거나 짝수,홀수 인지 확인하는 등은 가능하지만
		 * 값 자체를 변환하는 것은 불가능. 따라서 완성된 배열을 활용하는 방법이다.
		 * ex) 배열의 값을 나열, 배열의 값이 홀&짝 유무 등 
		 */
		
		
		

		
		

	}

}
