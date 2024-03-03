package Day08;

public class _02_Lotto {

	public static void main(String[] args) {
		
		/* 로또 번호 생성
		 * 1~45까지 랜덤 정수 생성
		 * 로또 번호 => 1~45 정수 중 6개 => 사용자 번호
		 * 당첨 번호 => 1~45 정수 중 7개 => 기본 번호 6개 + 보너스 번호
		 * 
		 * 로또 번호 출력 ex) 1 2 3 4 5 6
		 * 당첨 번호 출력 ex) 1 2 3 4 5 6 [7]
		 * 로또 번호는 중복 되면 안 됨.
		 * 로또 등수 확인
		 * 1등 => 6자리 일치
		 * 2등 => 5자리 일치 + 보너스 번호 일치
		 * 3등 => 5자리 일치
		 * 4등 => 4자리 일치
		 * 5등 => 3자리 일치
		 * 꽝 => 나머지
		 */
		
		/* 생성 해야 할 메서드 생각해보기
		 * 사용자 번호 배열 생성
		 * 로또 번호 배열 생성
		 * 생성 된 배열 정렬
		 * 생성 된 배열 중복 체크
		 * 사용자 번호 출력
		 * 로또 번호 출력
		 * 로또 번호 당첨 번호 비교 하여 등수 출력
		 * 
		 */
		
		
	}
	
public int[] userArr() {
	int[] arr = new int[6];
	for(int i=0; i<arr.length; i++) {
		arr[i] = (int)(Math.random()*45)+1;
	}
	return arr;
}

public int[] lottoArr() {
	int[] arr = new int[7];
	for(int i=0; i<arr.length; i++) {
		arr[i] = (int)(Math.random()*45)+1;
	}
	return arr;
}

public int[] soltArr(int[] arr) {
	for(int i=0; i<arr.length-1; i++) {
		for(int j=i+1; j<arr.length; j++) {
			if(arr[i] == arr[j]) {
				arr[j] = (int)(Math.random()*45)+1;
			}
		}
	}
	return arr;
}


	

		
		
		
		
		
		
		
		
		
}
