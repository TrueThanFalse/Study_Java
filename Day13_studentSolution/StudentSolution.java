package Day13_studentSolution;

public class StudentSolution {

	private String stdName;
	private String stdNum;
	private String stdresisterNum;
	private String faculty;
	private String major;
	private SubjectSolution[] subjectList = new SubjectSolution[5]; // Subject 클래스를 배열로 보관
	private int subCnt = 0; // Subject 배열의 index 처리를 위한 변수
	
	public StudentSolution() {}
	public StudentSolution(String stdName, String stdNum, String stdresisterNum, String faculty, String major) {
		super();
		this.stdName = stdName;
		this.stdNum = stdNum;
		this.stdresisterNum = stdresisterNum;
		this.faculty = faculty;
		this.major = major;
	}
	
	// 메서드
	// 학생 정보만 출력하는 메서드
	public void stdprint() {
		System.out.println("학생명(학번):"+stdName+"("+stdNum+")");
	}
	
	// 수강 과목 출력하는 메서드(배열 출력)
	public void subprint() {
		//수강과목이 없을 때
		if(subCnt == 0) {
			System.out.println("수강 중인 과목이 없습니다");
		}
		//수강과목이 있을 때: 배열을 출력
		for(int i=0; i<subCnt; i++) {
			//toString을 이용한 출력
			System.out.println(subjectList[i]);
			
			//메서드를 이용한 출력
			//subjectList[i].메서드명(); // 메서드 호출
		}
	}
	
	// 수강 과목 추가(신청) => subjectList 배열에 값이 들어가는 것 => 리턴 할 것이 없다
	public void insertSubject(SubjectSolution s) {
		//배열이 다 찼다면 늘려주기
		if(subCnt == subjectList.length) {
			//새로운 배열을 생성, 기존 size보다 +5 OR *2 등등
			SubjectSolution[] tmp = new SubjectSolution[subjectList.length+5];
			//arraycopy 이용하여 기존 배열을 새로운 배열에 복사
			System.arraycopy(s, 0, tmp, 0, subjectList.length);
			//배열의 교체
			subjectList = tmp;
		}
		
		subjectList[subCnt] = s;
		subCnt++;
	}
	
	// 수강 과목 삭제(철회)
	public void deleteSubject(String subName) {
		//과목의 위치를 찾기 위한 index 번지 설정
		int index = -1;
		if(subName == null) {
			return;
		}
		for(int i=0; i<subCnt; i++) {
			if(subjectList[i].getSubName().equals(subName)) {
				index = i;
				break;
			}
		}
		if(index == -1) {
			System.out.println("찾는 과목이 없습니다.");
			return;
		}
		//찾았을 경우
		for(int i=index; i<subCnt-1; i++) {
			subjectList[i] = subjectList[i+1];
		}
		//마지막 번지는 null로 채우기
		subjectList[subCnt-1] = null;
		subCnt--;
	}
	
	
	@Override
	public String toString() {
		return "StudentSolution [stdName=" + stdName + ", stdNum=" + stdNum + ", stdresisterNum=" + stdresisterNum
				+ ", faculty=" + faculty + ", major=" + major + "]";
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public String getStdNum() {
		return stdNum;
	}
	public void setStdNum(String stdNum) {
		this.stdNum = stdNum;
	}
	public String getStdresisterNum() {
		return stdresisterNum;
	}
	public void setStdresisterNum(String stdresisterNum) {
		this.stdresisterNum = stdresisterNum;
	}
	public String getFaculty() {
		return faculty;
	}
	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public int getSubCnt() {
		return subCnt;
	}
}
