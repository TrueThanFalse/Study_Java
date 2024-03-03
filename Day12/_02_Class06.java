package Day12;

public class _02_Class06 {

	public static void main(String[] args) {

		EzenStudent s = new EzenStudent("유재석", 3, "010-8888-9999", "인천");
		s.print(); // 메서드를 이용한 출력
		
		// 객체를 출력하면 자동으로 toString 메서드를 호출
		// toString을 활용하려면 반드시 sysout이 필요. 또한 모든 return은 String 타입이다.
		System.out.println(s);
		System.out.println(s.toString());
		
		EzenStudent s2 = new EzenStudent();
		System.out.println(s2);
		
	}

}

/* 객체를 초기화 하는 방법 : 기본값(null,0), 명시적 초기 값, 초기화 블럭, 생성자
 * 1. 기본값 : 문자(null), 숫자(0)
 * 
 * 2. 명시적 초기화 : 멤버변수의 선언과 동시에 초기값을 명시
 * 		기본값 지정 ex) private int num=0;
 * 
 * 3. 초기화 블럭
 * 		{
 * 		초기화 내용
 * 		}
 * 
 * 4. 생성자
 * 
 * 초기화 우선 순위
 * 1.생성자 2.초기화 블럭 3.명시적 초기값 4.기본값 
 */



/* 학생 클래스
 * 멤버변수 : 지점, 이름, 반, 전화번호
 * 메서드 : 출력 (print메서드) => toString 메서드
 * getter,setter
*/
class EzenStudent{
	private String name = "미상";
	private int ban;
	private String tell;
	private String branch = "서울";
	
	{
		// 초기화 블럭
		branch = "인천";
		ban = 3;
	}
	
	// 생성자
	public EzenStudent() {}
	public EzenStudent(String name, int ban, String tell, String branch) {
//		super();
		this.name = name;
		this.ban = ban;
		this.tell = tell;
		this.branch = branch;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBan() {
		return ban;
	}

	public void setBan(int ban) {
		this.ban = ban;
	}

	public String getTell() {
		return tell;
	}

	public void setTell(String tell) {
		this.tell = tell;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	@Override
	public String toString() {
		return "EzenStudent [name=" + name + ", ban=" + ban + ", tell=" + tell + ", branch=" + branch + "]";
	}
	
	public void print() {
		System.out.println("이름: "+name+" 반: "+ban+" 번호: "+tell+" 지역: "+branch);
	}
	
	
	
	
	
	
}