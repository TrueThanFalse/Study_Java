package Day13_student;

public class Student {

	/* 학생 클래스 : 한 학생의 정보를 나타내는 클래스
	 * - 이름, 학번, 주민번호, 전화번호, 학부, 학과, 과목s(과목 클래스를 배열로 생성[5])
	 * - 멤버변수 선언, 생성자, getter/setter, 기타 메서드
	 * - 기타 메서드 => 학생이 수강을 신청하는 메서드(배열이 꽉 차면 새로운 배열 늘리기), 철회하는 메서드, 기타 출력
	 */
	
	private String name;
	private int studentNum;
	private int residentNum;
	private String phoneNum;
	private String college;
	private String major;
	private Subject[] subPack = new Subject[5];
	private int cnt = 0; // Subject pack의 index
	
	public Student() {}
	public Student(String name, int studentNum, String phoneNum) {
//		super();
		this.name = name;
		this.studentNum = studentNum;
		this.phoneNum = phoneNum;
	}
	public Student(String name, int studentNum, int residentNum, String phoneNum, String college, String major) {
//		super();
		this.name = name;
		this.studentNum = studentNum;
		this.residentNum = residentNum;
		this.phoneNum = phoneNum;
		this.college = college;
		this.major = major;
	}
	
	public void addSubject(String name) {
		Subject tmp = new Subject(name);
		subPack[cnt] = tmp;
		cnt++;
	}
	
	public void subSubject(String name) {
		for(int i=0; i<cnt; i++) {
			if(subPack[i].getName().equals(name)) {
				for(int j=i; j<cnt-1; j++) {
					subPack[j] = subPack[j+1];
				}
			}
		}
		subPack[cnt] = null; // 잘못 되었음. cnt-1이 정답. 꽉 채웠을때 error 발생할 것임.
		cnt--;
	}
	
	public void printSubject() {
		for(int i=0; i<cnt; i++) {
			System.out.println(subPack[i].toString());
		}
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStudentNum() {
		return studentNum;
	}
	public void setStudentNum(int studentNum) {
		this.studentNum = studentNum;
	}
	public int getResidentNum() {
		return residentNum;
	}
	public void setResidentNum(int residentNum) {
		this.residentNum = residentNum;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public Subject[] getPack() {
		return subPack;
	}
	public void setPack(Subject[] pack) {
		this.subPack = pack;
	}
	@Override
	public String toString() {
		return "[이름=" + name + ", 학번=" + studentNum + ", 주민번호=" + residentNum + ", 전화번호="
				+ phoneNum + ", 학과=" + college + ", 학부=" + major + "]";
	}
	
	
	
	
}
