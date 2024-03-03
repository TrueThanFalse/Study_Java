package Day14_lottoSolution;

import java.util.Arrays;
import java.util.Random;

public class Lotto {

	// 사용자 번호를 출력하는 로또 클래스 (상속 해줘야 함)
		protected int[] numbers = new int[6];
		
		// 메서드
		// 1. random 번호를 생성
		// Random() 메서드 활용 => Random().nextInt(범위)+시작값;
		protected int random() {
			return new Random().nextInt(45)+1;
		}
		
		// 2. 랜덤 번호 6개를 numbers에 저장하는 메서드 (중복 금지)
		protected void randomLotto() {
			// 초기화(메서드 호출)
			init();
			
			int cnt=0;
			while(cnt < 6) {
				int r = random();
				if(!isContain(r)) {
					numbers[cnt] = r;
					cnt++;
				}
			}
		}
		
		// 3. 중복 번호 체크 메서드
		// 완성된 배열의 중복 체크 메서드와 다르다.
		// 이 메서드는 배열에 값을 넣기 전에 중복 체크하는 메서드이다.
		protected boolean isContain(int num) {
			if(num < 0 || num > 45) {
				System.out.println("숫자의 범위가 1~45까지 입니다.");
				return false;
			}
			for(int tmp : numbers) {
				if(tmp == num) {
					return true;
				}
			}
			return false;
		}
		
		// 4. 배열을 초기화
		protected void init() {
			// 기존 배열을 버리고 new 배열로 연결
			numbers = new int[6];
			// 버려진 배열 메모리는 알아서 메모리 삭제 됨
		}
		
		// 5. 번호 확인(toString)
		@Override
		public String toString() {
			return Arrays.toString(numbers);
		}
		
		// 6. 수동 번호 생성
		// 입력은 manager class에서 받아서 -> 메서드 호출
		// 매개변수로 배열을 받으면 numbers로 복사
		protected void inserNumbers(int[] arr) {
			if(arr.length < numbers.length) {
				System.out.println("배열의 길이가 작습니다.");
			}
			// 배열 복사: arraycopy => for문 보다 처리 속도가 빠르다
			System.arraycopy(arr, 0, numbers, 0, numbers.length);
		}
		
		//getter
		public int[] getNumbers() {
			return numbers;
		}
}
