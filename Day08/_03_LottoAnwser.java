package Day08;

public class _03_LottoAnwser {

	public static void main(String[] args) {

		
		int lotto[] = new int[7];
		int user[] = new int[6];
		
		randomArray(user);
		randomArray(lotto);
		System.out.println("<< 사용자 번호 >>");
		printArray(user);
		System.out.println("<< 당첨 번호 >>");
		printArray(lotto);
		
		int rank = lottoRank(lotto, user);
		if(rank == -1) {
			System.out.println("꽝~!");
		}else {
			System.out.println("축~!" + rank + "등 입니다.");
		}

	}
	
	// 1. 번호(1~45)를 랜덤으로 생성하는 기능
	public static int random() {
		return (int)(Math.random()*9)+1; // 07번 과제를 위해 9로 수정됨
	}
	
	/* 2. 1번 기능을 배열에 저장하는 기능
	 * 배열을 완성 => 리턴 필요 없음.
	 * 매개변수 => 배열
	 */
	
	public static void randomArray(int arr[]) {
		// 중복 상관 없이 채우기
//		for(int i=0; i<arr.length; i++) {
//			arr[i] = random();
//		}
		
		// 중복 없이 채우기
//		for(int i=0; i<arr.length; i++) {
//			int r = random();
//			for(int j=0; j<=i; j++) {
//				if(arr[j] != r) { // 없다면...
//					arr[i] = r;
//				}else { // 있다면...
//					i--; // => 뒤로 가서 재확인이 필요하므로 while문을 활용하는 것이 효율적이다
//				}
//			}
//		}
		
		// 중복 없이 채우기
		int i = 0;
		while(i < arr.length) {
			int r = random();
			if(!isContain(arr, r)) {
				arr[i] = r;
				i++;
			}
		}
		
		
	}
	
	/* 3. 배열 출력 메서드
	 * 배열을 주고 출력
	 */
	
	public static void printArray(int arr[]) {
		if(arr.length == 7) {
			for(int i=0; i<arr.length-1; i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println("["+arr[arr.length-1]+"]");
			System.out.println();
		}else {
			for(int i=0; i<arr.length; i++) {
				System.out.print(arr[i]+" ");	
			}
		System.out.println();
		}
	}
	
	/* 4. 중복 체크 메서드
	 * 중복이면 true, 중복이 아니면 false
	 * 리턴타입 : blooean
	 * 매개변수 : int arr[], random 값
	 * 메서드명 : isContain
	 */
	
	public static boolean isContain(int arr[], int random) {
		for(int tmp : arr) {
			if(tmp == random) {
				return true;
			}
		}
		return false;
	}
	
	public boolean isContain2(int arr[], int random) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == random) {
				return true;
			}
		}
		return false;
	}
	
	/* 5. 등수를 체크하는 기능
	 * 리턴타임 : 등수 => int => 등수에 해당하지 않으면 -1을 리턴
	 * 매개변수 : 로또번호, 유저번호
	 * 메서드명 : lottoRank
	 *
	 * 1등 => 6자리 일치
	 * 2등 => 5자리 일치 + 보너스 번호 일치
	 * 3등 => 5자리 일치
	 * 4등 => 4자리 일치
	 * 5등 => 3자리 일치
	 * 꽝~ (-1 리턴)
	 * */
	
	public static int lottoRank(int lotto[], int user[]) {
		// lotto배열과 user배열의 개수가 다르므로 매개변수 입력 순서가 같아야 함.
		if(lotto.length <= user.length) {
			return -1;
		}
		
		int cnt = 0; // 당첨 개수
		for(int i=0; i<user.length; i++) { 
			// lotto 길이로 하면 안된다. lotto의 마지막 번호는 보너스 번호이므로
			if(isContain(user, lotto[i])) {
				cnt++;
			}
		}
		
		switch(cnt) {
		case 6 : return 1;
		case 5 :
			if(isContain(user, lotto[lotto.length-1])) {
				return 2;
			}else {
				return 3;
			}
			//isContain(user, lotto[lotto.length-1]? 2 : 3;
		case 4 :
			return 4;
		case 3 :
			return 5;
			default : return -1;
		}
		
	}
	
	
	
	

}
