package Day13_studentSolution;

import java.util.Scanner;

public class ProgramMainSolution {

	public static void main(String[] args) {
		
		StudentManagerSolution sm = new StudentManagerSolution();
		
		Scanner scan = new Scanner(System.in);
		
		int menu = 0;
		
		do {
			System.out.println("---수강관리프로그램---");
			System.out.println("|1.학생 등록|2.학생 검색|3.학생List|");
			System.out.println("|4.수강신청|5.수강철회|6.종료|");
			
			menu = scan.nextInt();
			
			switch(menu) {
			
			case 1: 
				System.out.println("학생 등록 메뉴");
				sm.insertStudent(scan);
				break;
			case 2: 
				System.out.println("학생 검색 메뉴");
				sm.searchStudent(scan);
				break;
			case 3: 
				System.out.println("학생 조회 메뉴");
				sm.printStudent();
				break;
			case 4: 
				System.out.println("수강 신청 메뉴");
				sm.registerSubject(scan);
				break;
			case 5: 
				System.out.println("수강 철회 메뉴");
				sm.deleteSubject(scan);
				break;
			case 6:
				break;
				default: System.out.println("잘못된 메뉴입니다.");
			}
			
		}while(menu != 6);
		System.out.println("프로그램 종료");
		
		scan.close();

	}

}
