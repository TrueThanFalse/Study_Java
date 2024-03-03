package Day20StudentSolution;

import java.util.HashMap;
import java.util.Objects;

public class Student {

	// 멤버변수 : 이름, 나이, 전화번호, map<과목,점수>, 합계, 평균
	private String name;
	private int age;
	private String phone;
	private HashMap<String, Integer> subject = new HashMap<String, Integer>();
	private int sum;
	private double avg;
	
	// 생성자
	public Student() {}
	public Student(String name) {
		this.name = name;
		this.age = 15;
	}
	public Student(String name, int age, String phone) {
		this.name = name;
		this.age = age;
		this.phone = phone;
	}
	
	
	// get/set
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public HashMap<String, Integer> getSubject() {
		return subject;
	}
	public void setSubject(HashMap<String, Integer> subject) {
		this.subject = subject;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}

	// 기능 메서드
	// 각 학생별 본인의 점수 등록 / 출력 / 삭제
	public void printOne() {
		System.out.println(name+"("+age+")");
		if(phone != null) {
			System.out.println(phone);
		}
		//수강 정보
		printSubject();
		//합계, 평균 출력
		calc();
		if(sum != 0) {
			System.out.println("result:"+sum+"["+avg+"]");
		}else {
			//점수가 없으면?
			System.out.println("점수가 없습니다.");
		}
		System.out.println("--------------------");
		
	}
	
	// subject 출력 메서드
	public void printSubject() {
		for(String tmp : subject.keySet()) {
			System.out.println(tmp+":"+subject.get(tmp));
		}
	}
	
	// subject의 점수를 합계, 평균 계산하는 메서드
	public void calc() {
		this.sum = 0;
		this.avg = 0;
		for(String tmp : subject.keySet()) {
			sum += subject.get(tmp);
		}
	}
	
	// 과목,점수 등록
	public void addSubject(String subject, int score) {
		this.subject.put(subject, score);
		System.out.println("점수 추가 완료");
	}
	
	// 과목,점수 삭제
	public void delSubject(String subject) {
		if(this.subject.remove(subject) == null) {
			System.out.println("해당 과목이 없습니다.");
			return;
		}else {
			this.subject.remove(subject);
			System.out.println("점수 삭제 완료");
		}
		
	}
	@Override
	public String toString() {
		return "name:" + name + "(" + age + ") " + ((phone != null)? phone : "");
	}
	
	
	// remove를 위해 equals를 name으로 오버라이딩
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) // 주소가 일치하면
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass()) // 클래스 정보가 다르면
			return false;
		Student other = (Student) obj;
		return Objects.equals(name, other.name);
	}
	
}
