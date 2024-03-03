package Day20List_Student;

public class Subject {

	private String subname;
	private String subCode;
	private double subCredit;
	
	public Subject() {}
	public Subject(String subname) {
		this.subname = subname;
	}
	
	public String getSubname() {
		return subname;
	}
	public void setSubname(String subname) {
		this.subname = subname;
	}
	public String getSubCode() {
		return subCode;
	}
	public void setSubCode(String subCode) {
		this.subCode = subCode;
	}
	public double getSubCredit() {
		return subCredit;
	}
	public void setSubCredit(double subCredit) {
		this.subCredit = subCredit;
	}
	@Override
	public String toString() {
		return "과목명: " + subname + ", 과목코드: " + subCode + ", 학점: " + subCredit + "점";
	}
	
	
	
	
}
