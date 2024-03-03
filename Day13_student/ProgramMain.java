package Day13_student;

import java.util.Scanner;

public class ProgramMain {

	public static void main(String[] args) {
		
		/* 메뉴를 출력하여 사용자로부터 어떤 기능을 수행할 것인지 처리
		 * 1. 학생 등록
		 * 2. 학생 검색 => ? 학생 정보 + 수강 정보
		 * 3. 학생 리스트 => 학생들 이름
		 * 4. 수강 신청
		 * 5. 수강 철회
		 * 6. 종료
		 */
		Scanner scan = new Scanner(System.in);
		StudentManager sm = new StudentManager();
		
		int number=0;
		
		a: do {
			System.out.println("수강 관리 프로그램");
			System.out.println("|1.학생 등록|2.학생 검색|3.학생List|4.수강신청|5.수강철회|6.종료|");
			System.out.println("숫자를 입력하세요.");
			number = scan.nextInt();
			switch(number) {
			case 1: sm.insertStudent(scan);
				break;
			case 2: sm.searchStudent(scan);
				break;
			case 3: sm.printStudent();
				break;
			case 4: sm.registerSubject(scan);
				break;
			case 5: sm.deleteSubject(scan);
				break;
			case 6: System.out.println("종료!");
				break a;
				default: System.out.println("잘못된 입력입니다.");
			}
		}
		while(true);
		
		scan.close();
		

	}

}
