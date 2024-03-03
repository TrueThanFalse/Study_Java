package Day20StudentSolution;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManager implements Program{

	// 멤버 변수
	private List<Student> student = new ArrayList<Student>();
	
	public StudentManager() {
		add();
	}
	
	// 기본 학생 추가
	public void add() {
		student.add(new Student("홍길동",16,"010-1111-1111"));
		student.add(new Student("김순이",18,"010-222-222"));
		student.add(new Student("이순신"));
		student.add(new Student("유재석"));
		student.add(new Student("송지효",23,"010-333-333"));
	}
	
	
	@Override
	public void addStd(Scanner scan) {
		System.out.println("학생명 >");
		String name = scan.next();
		student.add(new Student(name));
	}

	@Override
	public void printStd() {
		// TODO Auto-generated method stub
		for(int i=0; i<student.size(); i++) {
			System.out.println(student.get(i));
		}
	}

	@Override
	public void searchStd(Scanner scan) {
		// 학생명을 입력 받아 학생 정보를 출력
		System.out.println("학생명 >");
		String name = scan.next();
		for(int i=0; i<student.size(); i++) {
			if(student.get(i).getName().equals(name)) {
				student.get(i).printOne();
				return;
			}
		}
		System.out.println("검색한 학생을 찾을 수 없습니다.");
	
	}

	@Override
	public void modStd(Scanner scan) {
		// 수정할 정보(이름,나이,전화번호)
		System.out.println("학생명 >");
		String name = scan.next();
		for(int i=0; i<student.size(); i++) {
			if(student.get(i).getName().equals(name)) {
				System.out.println("수정할 정보 >");
				String op = scan.next();
				switch(op) {
				case "이름" :
					System.out.println("수정할 이름 >");
					String modName = scan.next();
					student.get(i).setName(modName);
					break;
				case "나이" :
					System.out.println("수정할 나이 >");
					int modAge = scan.nextInt();
					student.get(i).setAge(modAge);
					break;
				case "전화번호" :
					System.out.println("수정할 전화번호 >");
					String modPhone = scan.next();
					student.get(i).setPhone(modPhone);
					break;
					default: System.out.println("존재 하지 않습니다.");
				}
				return;
			}
		}
		System.out.println("학생이 존재 하지 않습니다.");
	}

	@Override
	public void delStd(Scanner scan) {
		// remove는 index 삭제, 오브젝트 삭제가 가능
		System.out.println("삭제할 학생명 >");
		String name = scan.next();
//		for(int i=0; i<student.size(); i++) {
//			if(student.get(i).getName().equals(name)) {
//				student.remove(i);
//				return;
//			}
//		}
		
		// remove(object) 삭제 => object 자체로 이름이 일치하는 같은 객체
		//student.removeIf(n-> n.getName().equals(name));
		if(student.remove(new Student(name)) != true) {
			System.out.println("학생이 존재 하지 않습니다.");
		}else {
			student.remove(new Student(name));
		}
	}

	@Override
	public void addSub(Scanner scan) {
		System.out.println("학생명 >");
		String name = scan.next();
		System.out.println("과목 >");
		String sub = scan.next();
		System.out.println("점수 >");
		int score = scan.nextInt();
		for(int i=0; i<student.size(); i++) {
			if(student.get(i).getName().equals(name)) {
				student.get(i).addSubject(sub, score);
				return;
			}
		}
		System.out.println("학생이 존재 하지 않습니다.");	
	}
	

	@Override
	public void modSub(Scanner scan) {
		// TODO Auto-generated method stub
		System.out.println("학생명 >");
		String name = scan.next();
		System.out.println("과목 >");
		String sub = scan.next();
		System.out.println("점수 >");
		int score = scan.nextInt();
		for(int i=0; i<student.size(); i++) {
			if(student.get(i).getName().equals(name)) {
				student.get(i).delSubject(sub);
				student.get(i).addSubject(sub, score);
				return;
			}
		}
		System.out.println("학생이 존재 하지 않습니다.");	
		
	}

	@Override
	public void delSub(Scanner scan) {
		// TODO Auto-generated method stub
		System.out.println("학생명 >");
		String name = scan.next();
		System.out.println("과목 >");
		String sub = scan.next();
//		for(int i=0; i<student.size(); i++) {
//			if(student.get(i).getName().equals(name)) {
//				student.get(i).delSubject(sub);
//				return;
//			}
//		}
		
		// index 메서드 활용
		int i = index(name);
		if(i == -1) {
			System.out.println("학생이 존재 하지 않습니다.");	
		}else {
			student.get(i).delSubject(sub);
		}
		
	}
	
	// 학생명을 주고, 그 학생명의 위치를 리턴하는 메서드
	public int index(String name) {
		for(int i=0; i<student.size(); i++) {
			if(student.get(i).getName().equals(name)) {
				return i;
			}
		}
		return -1; // 0번지 포함이므로 모두 해당 되지 않으면 -1로 리턴
	}

	
	
}
