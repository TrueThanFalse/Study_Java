package Day13_student;

public class Subject {

	/* 과목 클래스 : 한 과목의 기본 정보를 나타내는 클래스
	 *  - 과목명, 과목코드, 학점, 교수명, 학기
	 * 
	 *  - 멤버변수 선언, 생성자, getter/setter 선언
	 *  - 그외 필요한 메서드 => toString, print 메서드 정도
	 * 
	 */
	
	private String name;
	private int subjectCode;
	private int credit;
	private String teacher;
	private int term;
	
	public Subject() {}
	public Subject(String name, int subjectCode) {
		this.name = name;
		this.subjectCode = subjectCode;
	}
	public Subject(String name) {
		this.name = name;
	}
	public Subject(String name, int subjectCode, int credit, String teacher, int term) {
//		super();
		this.name = name;
		this.subjectCode = subjectCode;
		this.credit = credit;
		this.teacher = teacher;
		this.term = term;
	}
	
	public void printSubject() {
		System.out.println("과목명: "+name);
	}
	@Override
	public String toString() {
		return "[과목명=" + name + ", 과목코드=" + subjectCode + ", 학점=" + credit + ", 교수=" + teacher
				+ ", 학기=" + term + "]";
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSubjectCode() {
		return subjectCode;
	}
	public void setSubjectCode(int subjectCode) {
		this.subjectCode = subjectCode;
	}
	public int getCredit() {
		return credit;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}
	public String getTeacher() {
		return teacher;
	}
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
	public int getTerm() {
		return term;
	}
	public void setTerm(int term) {
		this.term = term;
	}
	
	
}
