package Day13_studentSolution;

public class SubjectSolution {

	/* 멤버변수 선언.
	 * 생성자
	 * 메서드
	 * getter/setter
	 * toString
	 */
	
	private String subCode;
	private String subName;
	private double subCredite;
	private int subTime;
	private String subProfessor;
	private String subSemester;
	private String subScheduler;
	
	public SubjectSolution() {}
	public SubjectSolution(String subName) {
		this.subName = subName;
	}
	public SubjectSolution(String subCode, String subName, double subCredite, int subTime, String subProfessor,
			String subSemester, String subScheduler) {
		super();
		this.subCode = subCode;
		this.subName = subName;
		this.subCredite = subCredite;
		this.subTime = subTime;
		this.subProfessor = subProfessor;
		this.subSemester = subSemester;
		this.subScheduler = subScheduler;
	}
	
	public String getSubCode() {
		return subCode;
	}
	public void setSubCode(String subCode) {
		this.subCode = subCode;
	}
	public String getSubName() {
		return subName;
	}
	public void setSubName(String subName) {
		this.subName = subName;
	}
	public double getSubCredite() {
		return subCredite;
	}
	public void setSubCredite(double subCredite) {
		this.subCredite = subCredite;
	}
	public int getSubTime() {
		return subTime;
	}
	public void setSubTime(int subTime) {
		this.subTime = subTime;
	}
	public String getSubProfessor() {
		return subProfessor;
	}
	public void setSubProfessor(String subProfessor) {
		this.subProfessor = subProfessor;
	}
	public String getSubSemester() {
		return subSemester;
	}
	public void setSubSemester(String subSemester) {
		this.subSemester = subSemester;
	}
	public String getSubScheduler() {
		return subScheduler;
	}
	public void setSubScheduler(String subScheduler) {
		this.subScheduler = subScheduler;
	}
	
	@Override
	public String toString() {
		return "SubjectSolution [subCode=" + subCode + ", subName=" + subName + ", subCredite=" + subCredite
				+ ", subTime=" + subTime + ", subProfessor=" + subProfessor + ", subSemester=" + subSemester
				+ ", subScheduler=" + subScheduler + "]";
	}
}
