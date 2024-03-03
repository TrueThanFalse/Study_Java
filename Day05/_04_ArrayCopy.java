package Day05;

public class _04_ArrayCopy {

	public static void main(String[] args) {
		
		/* arraycopy : 배열 복사
		 * system.arraycopy
		 * 객체를 다시 생성해서 값을 복사
		 * 배열은 길이를 가지고 있음
		 * 한번 정해진 길이는 늘이거나 줄일 수 없음
		 * 따라서 추가&삭제가 불가능
		 * 배열의 길이를 늘이거나 줄이고 싶을 경우 배열 복사를 활용하여 길이를 조절
		 * System.arraycopy(oldarray,old번지부터,newarray,new번지부터,복사개수(oldarray.length));
		 */
		
		int arr[] = new int[3];
		arr[0] = 10;
		arr[1] = 15;
		arr[2] = 20;
		for(int temp : arr) {
			System.out.print(temp+" "); // 10 15 20
		}
		System.out.println();
		System.out.println("-----");
		

		int arr2[] = new int[5];
//		수동으로 배열을 복사
//		for(int i=0; i<arr.length; i++) {
//			arr1[i] = arr[i];
//		}
		
		// arraycopy 활용
		System.arraycopy(arr, 0, arr2, 1, arr.length); // arr.length-1 하면 arr[2] 값은 복사 안됨
		for(int temp : arr2) {
			System.out.print(temp+" "); // 0 10 15 20 0
		}
		
		
		System.out.println();
		System.out.println("-----");
		
		/* 문제. 3개의 값을 담을 수 있는 String 배열 생성 후
		 * 국어, 영어, 수학 글자를 담은 후 향상된 for문으로 출력
		 * 
		 * 5개의 값을 담을 수 있는 String 배열 생성 후 arraycopy
		 * 사회, 과학을 추가하여 향상된 for문으로 출력
		 */
		
		String str[] = new String[3]; // 아래 2개와 같이 작성해도 된다
		// String str[] = new String[] {"국어","영어","수학"};
		// String str[] = {"국어","영어","수학"};
		str[0] = "국어";
		str[1] = "영어";
		str[2] = "수학";
		for(String temp : str) {
			System.out.print(temp + " ");
		}
		System.out.println();
		System.out.println("-----");
		String str2[] = new String[5];
		System.arraycopy(str, 0, str2, 0, str.length);
		str2[3] = "사회";
		str2[4] = "과학";
		for(String temp : str2) {
			System.out.print(temp + " ");
		}
		
		System.out.println();
		System.out.println("-----");
		
	}

}
