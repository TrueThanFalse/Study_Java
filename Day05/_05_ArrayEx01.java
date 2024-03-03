package Day05;

public class _05_ArrayEx01 {

	public static void main(String[] args) {
		
		/* 2차원 배열
		 * 표처럼 행과 열을 가지는 배열
		 * 자료형 배열명[][] = new 자료형[길이][길이];
		 * [행][열]
		 */
		
		int arr[][] = new int[3][3];
		int cnt = 1;
		//행개수
		for(int i=0; i<arr.length; i++) { // arr.length 아무것도 없을때는 행의 길이를 나타낸다.
			//열개수
			for(int j=0; j<arr[0].length; j++) { // arr[0].length [0]번지 수의 열 길이를 나타낸다.
				arr[i][j] = cnt;
				cnt++;
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
