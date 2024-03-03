package Day20StudentSolution;

import java.util.Scanner;

public class ProgramMain {

	public static void main(String[] args) {
		
		/*
		 * 1.학생추가|2.학생리스트|3.학생검색|
		 * 4.학생수정|5.학생삭제|6.과목추가|
		 * 7.과목수정|8.과목삭제|9.종료
		 * 
		 * subject class -> map<과목,점수> 교체할 것이다
		 * 
		 * student class -> subject class를 멤버 변수로 추가
		 * 
		 * 프로젝트 할 때 작업 구상 순서
		 * 아이템 선정 -> 메뉴 구성 -> 필요한 class와 Collection을 예상 ->
		 * 각 class,Collention의 기능 세분화(인터페이스 작성) -> 조원 분배 -> 코드 합치기 -> test
		 */
		
		/* 1. 인터페이스 구성
		 * 2. student class 생성
		 * 3. main 구성(test 실행을 위해서)
		 * 4. manager 구성
		 */
		
		Scanner scan = new Scanner(System.in);
		
		StudentManager sm = new StudentManager();
		
		int menu = 0;
		do {
			System.out.println("--- 학생 관리 프로그램 ---");
			System.out.println("1.학생추가|2.학생리스트|3.학생검색|");
			System.out.println("4.학생수정|5.학생삭제|6.과목추가|");
			System.out.println("7.과목수정|8.과목삭제|9.종료");
			menu = scan.nextInt();
			
			switch(menu) {
			case 1: sm.addStd(scan); break;
			case 2: sm.printStd(); break;
			case 3: sm.searchStd(scan); break;
			case 4: sm.modStd(scan); break;
			case 5: sm.delStd(scan); break;
			case 6: sm.addSub(scan); break;
			case 7: sm.modSub(scan); break;
			case 8: sm.delSub(scan); break;
			case 9: System.out.println("프로그램 종료"); break;
			default: System.out.println("Error : 잘못된 메뉴 선택");
			}

		}while(menu != 9);

	}

}
