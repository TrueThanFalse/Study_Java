package Day13_student;

import java.util.Scanner;

public class StudentManager implements program {

	/* 멤버변수 : 학생 클래스를 배열로 생성[5]
	 * - program 인터페이스를 구현
	 * - 메서드는 interface를 구현하는 형태로
	 * - 학생 추가시 배열이 꽉 찼다면 배열을 늘려주는 기능 추가
	 */
	
	private Student[] stuPack = new Student[5];
	private int cnt = 0; // student pack의 index
	
//	void printStudent(); // 학생 전체 리스트 출력
//	void insertStudent(Scanner scan); // 스캐너로 메서드 내부에서 입력 받기
//	void searchStudent(Scanner scan); // 학생 검색
//	void registerSubject(Scanner scan); // 수강 신청
//	void deleteSubject(Scanner scan); // 수강 철회
	
	@Override
	public void printStudent() {
		for(int i=0; i<cnt; i++) {
			System.out.println(stuPack[i].toString());
			stuPack[i].printSubject(); // 서브젝트 클래스에서 바로 못 가져오나? 방법 알아보자
		}	
	}

	@Override
	public void insertStudent(Scanner scan) {
		System.out.println("---학생 등록---");
		System.out.println("학생명 입력>");
		String name = scan.next();
		System.out.println("학번 입력>");
		int studentNum = scan.nextInt();
		System.out.println("전화번호 입력>");
		String phoneNum = scan.next();
		Student stu = new Student(name, studentNum, phoneNum);
		stuPack[cnt] = stu;
		cnt++;
	}

	@Override
	public void searchStudent(Scanner scan) {
		System.out.println("---학생 검색---");
		System.out.println("학생명 입력>");
		String name = scan.next();
		for(int i=0; i<cnt; i++) {
			if(stuPack[i].getName().equals(name)) {
				System.out.println(stuPack[i].toString());
			}
		}
	}

	@Override
	public void registerSubject(Scanner scan) {
		System.out.println("---수강 신청---");
		System.out.println("학번 입력>");
		int studentNum = scan.nextInt();
		for(int i=0; i<cnt; i++) {
			if(stuPack[i].getStudentNum() == studentNum) {
				System.out.println("과목명 입력>");
				String subjectName = scan.next();
				stuPack[i].addSubject(subjectName);
			}
		}
	}

	@Override
	public void deleteSubject(Scanner scan) {
		System.out.println("---수강 철퇴---");
		System.out.println("학번 입력 >");
		int studentNum = scan.nextInt();
		for(int i=0; i<cnt; i++) {
			if(stuPack[i].getStudentNum() == studentNum) {
				System.out.println("철회 과목명 입력>");
				String name = scan.next();
				stuPack[i].subSubject(name);
			}
		}
	}

	/* 멤버변수 : 학생 클래스를 배열로 생성[5]
	 * - program 인터페이스를 구현
	 * - 메서드는 interface를 구현하는 형태로
	 * - 학생 추가시 배열이 꽉 찼다면 배열을 늘려주는 기능 추가
	 */
	
	
	
}
