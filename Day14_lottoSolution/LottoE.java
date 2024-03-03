package Day14_lottoSolution;

public class LottoE extends Lotto{

	// LottoE 당첨 번호를 생성하는 클래스
		// Lotto를 상송 받아서 보너스 번호만을 처리
		
		private int bonus;

		// 메서드
		// 오버라이딩 해야할 메서드 종류 : randomLotto, init, toString, insertNumbers
		@Override
		protected void randomLotto() {
			super.randomLotto(); // 기존 메서드: numbers의 배열은 이미 채워진 상황
			while(true) { // 중복 값이 있었을 경우 반복적으로 생성
				int r = random();
				if(!isContain(r)) {
					bonus = r;
					break;
				}
			}
		}

		@Override
		protected void init() {
			super.init(); // numbers 배열 재생성
			bonus = 0; // 보너스 번호 초기화
		}

		@Override
		public String toString() {
			// 보너스 번호 추가
			return super.toString()+"["+bonus+"]";
		}

		@Override
		protected void inserNumbers(int[] arr) { // 7자리
			// 수동으로 7자리의 배열이 들어온다면
			super.inserNumbers(arr); // 6자리 배열 생성은 이미 완료
			// 마지막 한자리가 남아 있는 상황 -> 보너스 번호에 추가
			bonus = arr[arr.length-1];
		}
		
		public void inserNumbers(int[] arr, int bonus) {
			super.inserNumbers(arr); // 6자리 완료
			this.bonus = bonus; // 보너스 번호만 추가
		}
		
		//getter
		public int getBonus() {
			return bonus;
		}
}
