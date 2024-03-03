package Day11;

public class _02_EzenComputerMain {

	public static void main(String[] args) {

//		_01_EzenComputer su = new _01_EzenComputer("유재석", "010-5555-4444");
//		su.setAge(31);
//		su.setBirth("920418");
//		su.setBranch("인천");
//		su.addCourse("자바");
//		su.addCourse("스프링");
//		su.addPeriod("6개월");
//		su.addPeriod("2개월");
//		su.studentOut();
//		su.companyOut();
//		su.courseOut();
		
		_01_EzenComputerAnwser ez = new _01_EzenComputerAnwser("하하", "010-3333-8888", "광주");
		ez.printInfo();
		ez.printCompany();
		ez.printCourse();
		ez.insertCourse("java", "6개월");
		ez.printCourse();
		
		_01_EzenComputerAnwser ez2 = new _01_EzenComputerAnwser("김종국","880101",45,"5555","광주");
		ez2.printInfo();
		ez2.insertCourse("java", "3개월");
		ez2.insertCourse("sql", "3개월");
		ez2.printCourse();
				
		/* 학생 클래스를 담을수 있는 배열을 생성 후
		 * 7명의 학생을 등록
		 */
		
		_01_EzenComputerAnwser[] std = new _01_EzenComputerAnwser[7];
		std[0] = new _01_EzenComputerAnwser("철수", "790905", 25, "3333", "인천");
		std[1] = new _01_EzenComputerAnwser("영수", "250203", 27, "2222", "광주");
		std[2] = new _01_EzenComputerAnwser("희철", "550103", 28, "1111", "인천");
		std[3] = new _01_EzenComputerAnwser("철수", "890706", 29, "3333", "서울");
		std[4] = new _01_EzenComputerAnwser("재민", "740806", 33, "4444", "인천");
		std[5] = ez;
		std[6] = ez2;
		std[0].insertCourse("DB", "1개월");
		std[1].insertCourse("java", "3개월");
		std[1].insertCourse("html", "5개월");
		
		/* 과제
		 * 학생 이름으로 검색 => 학생의 모든 정보 출력
		 * 지점 정보로 검색 => 학생 정보만 출력
		 * 보너스 : 과목을 수강하는 학생만 검색 => 모든 정보 출력
		 */
		
		System.out.println("----------");
		String searchName = "철수";
		System.out.println(searchName+"님의 정보 >");
		for(int i=0; i<std.length; i++) {
			if(std[i].getName().equals(searchName)) {
				std[i].printInfo();
				std[i].printCompany();
				std[i].printCourse();
			} // else { System.out.println("검색 정보가 없습니다."); 
		}
		
		System.out.println("----------");
		String searchBranch = "인천";
		for(int i=0; i<std.length; i++) {
			if(std[i].getBranch().equals(searchBranch)) {
				std[i].printInfo();
			}
		}
		
		System.out.println("----------");
		String searchCourse = "java";
		for(int i=0; i<std.length; i++) {
			for(int j=0; j<std[i].getCnt(); j++) {
				/* for 조건식에 j<std[i].getCourse.length을 하면
				 * Course 배열의 길이인 5를 리턴 받는다.
				 * 하지만 값이 존재하는 배열은 cnt-1 까지 존재하는 것이다.
				 * 과목을 추가하지 않았다면 null 상태로 error가 발생한다.
				 */
				if(std[i].getCourse()[j].equals(searchCourse)) {
					/* if 조건식을 std[i].getCourse()[j] == searchCourse로 하면
					 * 객체의 실제값이 아닌 주소를 비교한다. error가 발생 안될 수 있지만 문법상 틀리다.
					 * equals로 힙 영역의 실제 값을 비교하여야 올바르다. 
					 */
					std[i].printInfo();
					std[i].printCompany();
					std[i].printCourse();
				}
			}
			
		}
		
		
	}

}


