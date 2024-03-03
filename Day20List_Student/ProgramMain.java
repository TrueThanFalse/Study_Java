package Day20List_Student;

import java.util.Scanner;

public class ProgramMain {

	public static void main(String[] args) {
		
		StudentManager sm = new StudentManager();
		
		Scanner scan = new Scanner(System.in);
		
		int menu = -1;
		
		do {
			System.out.println("★☆★☆★수강 관리 프로그램★☆★☆★");
			System.out.println("|1.학생 등록|2.학생 검색|3.학생List|");
			System.out.println("|4.수강신청|5.수강철회|6.종료|");
			System.out.println("★☆★☆★번호를 입력해주세요.★☆★☆★");
			menu = scan.nextInt();
			
			switch(menu) {
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
			case 6: 
				System.out.println("프로그램 종료");
				break;
			}
				
		}while(menu != 6);

	}

}
