package Day14_lotto;

import java.util.Scanner;

public interface program {

	/* --menu--
	1. 로또 번호 생성(수동) : 사용자가 직접 입력 6개
		=> createLotto(scan);
	2. 로또 번호 생성(자동) : random 생성 6개
		createLottoAuto()
	3. 당첨 번호 생성(자동) : random 생성 7개 => 배열에 저장
		insertLottoAuto()
	4. 당첨 번호 확인 : 최신 회차 1개만 확인 => 등수도 같이 체크
		checkLotto()
	5. 당첨 번호 리스트 확인 : 현재 회차 당첨 번호가 가장 마지막으로 출력(가장 위에 출력)
		printLotto()
	6. 종료

	1. Lotto 클래스 (6개 배열 생성하는 로또 클래스)
		=> 수동 생성에 대한 메서드

	2. LottoE 클래스 (기존 Lotto 클래스를 상속 받아 처리)
		=> 당첨 번호. 기존 배열(6자리) int 보너스 번호만 처리

	3. LottoManager 클래스
		=> 위쪽 1,2,3,4,5 메뉴의 메서드 처리

	4. LottoMain
		=> 메뉴 처리
	*/
	
	 int[] createLotto(Scanner scan);
	 int[] createLottoAuto();
	 void insertLottoAuto();
	 void checkLotto();
	 void printLotto();
}
