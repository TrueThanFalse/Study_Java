package Day11;

public class _01_EzenComputerAnwser {

	/* 수강 관리 프로그램
	 * EzenComputer 클래스 생성
	 * 학생의 기본정보 : 이름, 생년월일, 나이, 전화번호
	 * 학원 정보 : 학원이름 = "EZEN", 지점
	 * 수강 정보 : 수강과목, 기간
	 * 
	 * ex)  홍길동 990101, 24, 010-1111-1111 // 학생 정보 출력
	 * 		EZEN, 인천지점 // 학원 정보 출력
	 * 		자바(6개월), DB(1개월), html(2개월) // 수강 정보 출력
	 * 
	 * 기능
	 * - 학생정보출력, 학원정보출력, 수강정보출력
	 * - 학생의 수강정보를 추가하는 기능
	 */


// final => 변경 불가능한

private String name;
private String birth;
private int age;
private String phone;
public final static String company = "EZEN"; // 클래스 변수
private String branch;
// 회사명 같은 변하지 않는것은 final과 static으로 불변하고 어디서든 공유 할 수 있도록 설정

//수강정보 => 한사람이 여러과목을 수강할 수 있음
private String[] course = new String[5]; // 수강과목 최대 5개
private String[] period = new String[5]; // 수강기간

private int cnt = 0; // 배열의 index 처리를 위한 변수

//생성자
public _01_EzenComputerAnwser() {}
public _01_EzenComputerAnwser(String name, String phone, String branch) {
	this.name = name;
	this.phone = phone;
	this.branch = branch;
}

// 소스에서 자동 생성한 생성자
public _01_EzenComputerAnwser(String name, String birth, int age, String phone, String branch) {
	// super(); => 부모꺼 키워드, this는 내꺼 키워드 // 상속 받을 경우 부모의 생성자 // 'java.lang.Object'를 뜻함 // 상속 받지 않을거니 주석처리
	this.name = name;
	this.birth = birth;
	this.age = age;
	this.phone = phone;
	this.branch = branch;
}

//메서드
public void printInfo() {
	System.out.println(name+", "+birth+", "+age+", "+phone);
}

public void printCompany() {
	System.out.println(company+"("+branch+")");
}

public void printCourse() { // 배열 => for문으로 반복하여 출력 해야함
	if(course.length == 0 || cnt == 0) {
		System.out.println("수강 이력이 없습니다");
		return; // 출력을 멈추고 메서드 종료
	}
	// if문에서 멈추지 않았다는건 수강 과목이 있다는 것
	for(int i=0; i<cnt; i++) { // 과목이 추가되면 cnt가 1증가
		System.out.print(course[i]+"("+period[i]+") ");
	}
	System.out.println(); // 과목 출력이 끝나면 줄바꿈
}

public void insertCourse(String course, String period) {
	this.course[cnt] = course;
	this.period[cnt] = period;
	cnt++; // 과목이 추가되면 index 번지가 증가
}

//게터세터
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getBirth() {
	return birth;
}
public void setBirth(String birth) {
	this.birth = birth;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getBranch() {
	return branch;
}
public void setBranch(String branch) {
	this.branch = branch;
}
public String[] getCourse() {
	return course;
}
public void setCourse(String[] course) {
	this.course = course;
}
public String[] getPeriod() {
	return period;
}
public void setPeriod(String[] period) {
	this.period = period;
}
public int getCnt() {
	return cnt;
}
//public void setCnt(int cnt) { // setCnt는 없는 것이 좋다. 왜? cnt는 수정 될 경우 큰 error를 초래할 수 있고 set을 할 필요성이 없는 변수이므로
//	this.cnt = cnt;
//}
public static String getCompany() {
	return company;
}


}
