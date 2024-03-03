package Day14_lottoSolution;

import java.util.Scanner;

public interface lottoProgram {

	void createLotto(Scanner scan); // 수동 로또 번호 입력
	void createLottoAuto(); // 자동 로또 생성
	void insertLottoAuto(); // 당첨 번호
	void checkLotto(); // 최신 당첨번호와 사용자 번호를 체크, 등수 확인
	void printLotto(); // 역대 당첨 번호 리스트 출력
}
