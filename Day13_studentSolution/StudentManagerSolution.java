package Day13_studentSolution;

import java.util.Scanner;

public class StudentManagerSolution implements program{

	private StudentSolution[] std = new StudentSolution[5];
	private int stdCnt = 0; // std 배열의 index 처리를 위한 변수

	@Override
	public void printStudent() {
		System.out.println("--전체 학생 정보--");
		for(int i=0; i<stdCnt; i++) {
			std[i].stdprint(); // 학생 정보
			std[i].subprint(); // 수강 정보
			System.out.println("--------------------");
		}
		
	}

	@Override
	public void insertStudent(Scanner scan) {
		// 1명의 정보 값을 입력 받아 객체를 생성한 후 std 배열에 추가
		System.out.println("--학생정보입력--");
		System.out.println("이름>");
		String name = scan.next();
		System.out.println("학번>");
		String num = scan.next();
		System.out.println("주민번호>");
		String sNum = scan.next();
		System.out.println("학부>");
		String f = scan.next();
		System.out.println("학과>");
		String m = scan.next();
		System.out.println("----------");
		
		// 입력 받은 값으로 객체를 생성
		StudentSolution s = new StudentSolution(name, num, sNum, f, m);
		// 배열이 꽉 찼다면
		if(stdCnt == std.length) {
			StudentSolution[] tmp = new StudentSolution[std.length+5]; // 새 배열
			System.arraycopy(std, 0, tmp, 0, std.length);
			std = tmp;
		}
		// 배열에 등록
		std[stdCnt] = s; // 0번지
		stdCnt++; // 인원증가 => stdCnt=1
		
		
	}

	@Override
	public void searchStudent(Scanner scan) {
		// 검색할 학생의 이름을 입력 받아 배열에서 탐색 후 있다면 학생 정보와 수강 정보를 출력
		System.out.println("검색할 학생명>");
		String name = scan.next();
//		int index = -1; // 찾은 학생의 배열 주소를 입력하기 위한 변수 // 있어도 되지만 없어도 됨
		for(int i=0; i<stdCnt; i++) {
			if(std[i].getStdName().equals(name)) {
				std[i].stdprint();
				std[i].subprint();
				return;
//				index = i;
			}
		}
//		if(index == -1) {
//			System.out.println("검색한 이름이 없습니다."); // index 변수를 추가한 이유
//		}
		System.out.println("검색한 이름이 없습니다.");
		
	}

	@Override
	public void registerSubject(Scanner scan) {
		// 누가 수강 신청을 할 것인가?
		// 수강 신청할 학생 이름을 입력 받기
		int index = -1;
		System.out.println("수강 신청할 학생명>");
		String name = scan.next();
		// 학생의 위치 체크
		for(int i=0; i<stdCnt; i++) {
			if(std[i].getStdName().equals(name)) {
				index = i;
				break;
			}
		}
		// 입력한 학생명이 없다면?
		if(index == -1) {
			System.out.println("학생 정보가 없습니다.");
		}else {
			// 있으면 신청 과목 접수 받기
			System.out.println("수강 신청 과목>");
			String subName = scan.next();
			// 객체를 생성하여
			SubjectSolution s = new SubjectSolution(subName);
			// insertSubject 호출
			std[index].insertSubject(s);
		}

		
		
		
		
	}

	@Override
	public void deleteSubject(Scanner scan) {
		// 수강 철회할 학생명 입력받기
		int index = -1;
		System.out.println("수강 철회 학생명>");
		String name = scan.next();
		// 그 학생의 위치 확인
		for(int i=0; i<stdCnt; i++) {
			if(std[i].getStdName().equals(name)) {
				index = i;
				break;
			}
		}
		// 학번이 없다면
		if(index == -1) {
			System.out.println("학생 정보가 없습니다.");
		}else {
			// 취소할 과목명 입력 받기
			System.out.println("취소할 과목명>");
			String subName = scan.next();
			std[index].deleteSubject(subName);
		}
		
	}
}
