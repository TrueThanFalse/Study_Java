package Day20List_Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {

	private ArrayList<Student> stuList = new ArrayList<Student>(); 
	
	public StudentManager() {}
	
	public void printStudent() {
		// 학생 전체 리스트 출력
		System.out.println("<<< 학생 전체 목록 >>>");
		stuList.stream().forEach(n->{
			n.printStuInfo();
			n.printSubInfo();
		});
		System.out.println("<<< 학생 목록 출력 완료 >>>");
	}
	
	public void insertStudent(Scanner scan) {
		// 스캐너로 메서드 내부에서 입력 받기
		System.out.println("<<< 학생 추가 >>>");
		System.out.println("학생명 >");
		String stuName = scan.next();
		System.out.println("학번 >");
		String stuCode = scan.next();
		System.out.println("전화번호 >");
		String stuPhoneNum = scan.next();
		stuList.add(new Student(stuName, stuCode, stuPhoneNum));
		System.out.println("<<< 학생 추가 완료 >>>");
	}
	
	public void searchStudent(Scanner scan) {
		// 검색할 학생의 이름을 입력 받아 배열에서 탐색 후 있다면 학생 정보와 수강 정보를 출력
		System.out.println("<<< 학생 검색 >>>");
		System.out.println("검색할 학생명 >");
		String stuName = scan.next();
		stuList.stream().filter(n-> n.getStuName().equals(stuName)).forEach(n->{
			n.printStuInfo();
			n.printSubInfo();
		});
		System.out.println("<<< 학생 검색 종료 >>>");
	}
	
	
	public void registerSubject(Scanner scan) {
		// 수강신청을 누가? 홍길동 => 영어(수강신청 메서드 호출(매개변수))
		System.out.println("<<< 수강 신청 >>>");
		System.out.println("당신의 학번은? >");
		String stuCode = scan.next();
		stuList.stream().filter(n-> n.getStuCode().equals(stuCode)).forEach(n-> {
			n.addSubject(scan);
		});
	}

	void deleteSubject(Scanner scan) {
		// 수강 철회할 학생명 입력받기
		System.out.println("<<< 수강 철회 >>>");
		System.out.println("당신의 학번은? >");
		String stuCode = scan.next();
		stuList.stream().filter(n-> n.getStuCode().equals(stuCode)).forEach(n-> {
			n.subSubject(scan);
		});
	}

	public ArrayList<Student> getStuList() {
		return stuList;
	}

	public void setStuList(ArrayList<Student> stuList) {
		this.stuList = stuList;
	}

	@Override
	public String toString() {
		return "StudentManager [stuList=" + stuList + "]";
	}
	
	
	
}
