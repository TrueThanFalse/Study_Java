package Day13_student;

import java.util.Scanner;

public interface program {

	/* 인터페이스
	- 학생 리스트 출력 메서드
	- 학생을 추가하는 메서드
	- 학생을 검색하는 메서드
	- 학생의 수강 신청(추가하는) 메서드
	- 학생의 수강 철회 메서드
	*/
	
	void printStudent(); // 학생 전체 리스트 출력
	void insertStudent(Scanner scan); // 스캐너로 메서드 내부에서 입력 받기
	void searchStudent(Scanner scan);
	void registerSubject(Scanner scan);
	// 수강신청을 누가? 홍길동 => 영어(수강신청 메서드 호출(매개변수))
	void deleteSubject(Scanner scan);

	
}
