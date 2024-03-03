package Day11;

public class _01_EzenComputer {
		
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
	public final static String company = "EZEN";
	private String branch;
	// 회사명 같은 변하지 않는것은 final과 static으로 불변하고 어디서든 공유 할 수 있도록 설정
	// 수강정보 => 한사람이 여러과목을 수강할 수 있음
	private String[] course = new String[5]; // 수강과목 최대 5개
	private String[] period = new String[5]; // 수강기간
	
	private int cnt = 0; // 배열의 index 처리를 위한 변수
	
	//생성자
	public _01_EzenComputer() {}
	public _01_EzenComputer(String name, String phone, String branch) {
		this.name = name;
		this.phone = phone;
		this.branch = branch;
	}
	
	// 소스에서 자동 생성한 생성자
	public _01_EzenComputer(String name, String birth, int age, String phone, String branch) {
		// super(); => 부모꺼 키워드, this는 내꺼 키워드 // 상속 받을 경우 부모의 생성자 // 'java.lang.Object'를 뜻함 // 상속 받지 않을거니 주석처리
		this.name = name;
		this.birth = birth;
		this.age = age;
		this.phone = phone;
		this.branch = branch;
	}
	//메서드
	// 학생정보출력, 학원정보출력, 수강정보출력 기능
	public void studentOut() {
		System.out.println("이름: "+name+"("+age+")"+" 생년월일: "+birth+" tel: "+phone);
	}
	
	public void companyOut() {
		System.out.println("학원: "+company+" 지역: "+branch+"지점");
	}
	
	public void courseOut() {
		System.out.print("수강 과목: ");
		for(int i=0; i<5; i++) {
			if(course[i] == "null") {
				break;
			}
			System.out.print(course[i]+"("+period+")");
			if(course[i] != "null") {
				System.out.print(", ");
			}
		}
		System.out.println();
	}
	
	// 학생 수강 정보를 추가하는 기능
	public void addCourse(String str1, String str2) {
			course[cnt] = str1;
			period[cnt] = str2;
			cnt++;
	}
	
	
	//getter,setter
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
	public static String getCompany() {
		return company;
	}
	

}
