package Day14_lottoSolution;

import java.util.Scanner;

public class LottoManager implements lottoProgram{

	// 멤버변수 선언
		LottoE[] lotto = new LottoE[5]; // 당첨 번호 배열 List
		private int cnt = 0; // 당첨 배열의 index 역할
		Lotto user = new Lotto(); // 사용자 번호
		
		public void printMenu() {
			System.out.println("-- 로또 프로그램--");
			System.out.println("1.로또번호생성(수동)");
			System.out.println("2.로또번호생성(자동)");
			System.out.println("3.당첨번호생성(자동)");
			System.out.println("4.당첨확인(마지막회차)");
			System.out.println("5.당첨번호목록확인(전체)");
			System.out.println("6.종료");
			System.out.println(">> menu >>");
		}
		
		@Override
		public void createLotto(Scanner scan) {
			// 로또 수동 입력 메뉴
			System.out.println("로또번호 입력.(중복X,1~45범위 숫자 6개)");
			int[] tmp = new int[6]; // 입력 받을 임시 배열
			for(int i=0; i<tmp.length; i++) {
				tmp[i] = scan.nextInt();
			}
			// 중복 체크 후 
			if(isDuplicated(tmp)) {
				System.out.println("오류 발생! 취소!");
			}else {
				user.inserNumbers(tmp);
				printLotto("로또번호:"+user);
			}
			
		}
		
		// 출력 메서드
		public void printLotto(String str) {
			System.out.println("----------");
			System.out.println(str);
		}
		
		// 수동으로 입력한 배열에 같은 수가 중복되어 포함 되어 있는지 체크하는 메서드
		public boolean isDuplicated(int[] arr) {
			for(int i=0; i<arr.length; i++) {
				for(int k=i+1; k<arr.length; k++) {
					if(arr[i] == arr[k]) {
						return true;
					}
				}
			}
			// 숫자 범위도 체크하기
			for(int i=0; i<arr.length; i++) {
				if(arr[i] < 0 || arr[i] > 45) {
					return true;
				}
			}
			return false;
		}

		@Override
		public void createLottoAuto() {
			// 자동 번호 생성
			user.randomLotto();
			printLotto("로또번호:"+user);
		}
		
		// 당첨 번호 수동 입력 메서드
		public void insertLotto(Scanner scan) {
			System.out.println("로또당첨번호 입력.(중복X,1~45범위 숫자 7개), 보너스는 마지막에 배치");
			int[] tmp = new int[7];
			for(int i=0; i<tmp.length; i++) {
				tmp[i] = scan.nextInt();
			}
			// 중복 체크, 범위 이탈 케이스 확인
			if(isDuplicated(tmp)) {
				System.out.println("오류 발생! 취소!");
			}else {
				if(cnt == lotto.length) {
					LottoE[] arr = new LottoE[lotto.length+5];
					System.arraycopy(lotto, 0, arr, 0, lotto.length);
					lotto = arr;
				}
				LottoE tmpLotto = new LottoE();
				tmpLotto.inserNumbers(tmp);
				lotto[cnt] = tmpLotto;
				cnt++;
				printLotto("당첨번호:"+tmpLotto);
			}
		}
		
		@Override
		public void insertLottoAuto() {
			if(cnt == lotto.length) {
				LottoE[] arr = new LottoE[lotto.length+5];
				System.arraycopy(lotto, 0, arr, 0, lotto.length);
				lotto = arr;
			}
			LottoE tmp = new LottoE();
			tmp.randomLotto();
			lotto[cnt] = tmp;
			cnt++;
			printLotto("당첨번호:"+tmp); // tmp는 toString으로 작동 됨
		}

		@Override
		public void checkLotto() {
			// 당첨 확인 메서드
			if(user.isContain(0)) { // 로또 번호를 생성하지 않은 경우
				System.out.println("사용자 번호를 생성 해주세요.");
				return;
			}
			// 로또 당첨 번호가 없을 경우
			if(cnt == 0) {
				System.out.println("당첨 번호를 생성 해주세요.");
				return;
			}
			
			// 1. 일치하는 개수 => count // count 변수 선언
			int count=0;
			// 2. 마지막에 저장된 당첨 번호 객체 가져오기
			LottoE tmp = lotto[cnt-1];
			// 3. for문으로 일치 갯수 확인
			for(int i=0; i<user.getNumbers().length; i++) {
				// 최신 당첨 번호의 i번지 1개의 값을 num로 저장
				int num = tmp.getNumbers()[i]; // 당첨번호 첫번째 값
				// user 배열에 num가 있는지 확인
				if(user.isContain(num)) {
					count++;
				}
				
			}
			// 4. rank 확인 후 출력
			int rank = -1;
			switch(count) {
			case 6: rank=1; break;
			case 5: 
				if(user.isContain(tmp.getBonus())) {
					rank=2;
				}else {
					rank=3;
				}
				break;
			case 4: rank=4; break;
			case 3: rank=5; break;
			}
			if(rank != -1) {
				System.out.print(count+"개 일치 |");
				System.out.println(rank+"등 당첨!");
			}else {
				System.out.print(count+"개 일치 |");
				System.out.println("꽝~!");
			}		
		}

		@Override
		public void printLotto() {
			// 전체 당첨 리스트
			// for문 활용하여 lotto 배열 출력
			System.out.println("★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★");
			System.out.println("---역대 당첨 번호 리스트---");
			for(int i=cnt-1; i>=0; i--) { // 역순으로 출력
				System.out.println((i+1)+"회차 당첨번호:"+lotto[i]);
			}
			
		}
}
