package Day20List_Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {

	/* -- 수강관리 프로그램 List로 작성--
	 * 1.학생등록|2.학생검색|3.학생리스트|4.수강신청|5.수강철회|6.종료
	 * 
	 * 기존 배열의 수강관리프로그램을 List로 변경해서 구현
	 */
	
	private String stuName;
	private String stuCode;
	private String stuPhoneNum;
	private ArrayList<Subject> list = new ArrayList<Subject>();
	
	public Student() {}
	public Student(String stuName, String stuCode, String stuPhoneNum) { 
		this.stuName = stuName;
		this.stuCode = stuCode;
		this.stuPhoneNum = stuPhoneNum;
	}
	
	// 학생 정보만 출력하는 메서드
	public void printStuInfo() {
		System.out.println("이름: "+stuName+", 학번: "+stuCode+", 전화번호: "+stuPhoneNum);
	}
	// 수강 과목 출력하는 메서드(배열 출력)
	public void printSubInfo() {
//		list.stream().forEach(n->{
//			String subName = n.getSubname();
//			String subCode = n.getSubCode();
//			double subCredit = n.getSubCredit();
//			System.out.println("과목명: "+subName+"과목코드: "+subCode+"학점: "+subCredit);
//		});
		list.stream().forEach(n-> System.out.println(n)); // Subject의 toString 출력
	}
	// 수강 과목 추가(신청) =>
	public void addSubject(Scanner scan) {
		System.out.println("수강 신청할 과목명 >");
		String name = scan.next();
		list.add(new Subject(name));
		System.out.println("<<< 수강 신청 완료 >>>");
	}
	// 수강 과목 삭제(철회)
	public void subSubject(Scanner scan) {
		System.out.println("수강 철회할 과목명 >");
		String name = scan.next();
		list.removeIf(n-> n.getSubname().equals(name));
		
//		for(Subject tmp : list) {
//			if(tmp.getSubname().equals(name)) {
//				list.remove(list.indexOf(tmp));
//			}
//		}
		
//		list.stream().filter(n-> n.getSubname().equals(name)).forEach(n->{
//			list.remove(list.indexOf(n));
//		});
//		System.out.println("<<< 수강 철회 완료 >>>");
	}
	
	
	
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getStuCode() {
		return stuCode;
	}
	public void setStuCode(String stucode) {
		this.stuCode = stucode;
	}
	public String getStuPhoneNum() {
		return stuPhoneNum;
	}
	public void setStuPhoneNum(String stuPhoneNum) {
		this.stuPhoneNum = stuPhoneNum;
	}
	public ArrayList<Subject> getList() {
		return list;
	}
	public void setList(ArrayList<Subject> list) {
		this.list = list;
	}
	@Override
	public String toString() {
		return "Student [stuName=" + stuName + ", stucode=" + stuCode + ", stuPhoneNum=" + stuPhoneNum + ", list="
				+ list + "]";
	}

	
	
}
