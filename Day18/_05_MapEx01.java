package Day18;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class _05_MapEx01 {

	public static void main(String[] args) {
		
		/* Map을 이용한 성적 관리 프로그램 생성
		 * -- menu --
		 * 1. 성적 추가
		 * 2. 성적 조회 (전체 출력) : 합계 / 평균 같이 출력
		 * 3. 성적 조회 (과목 조회) : 국어 => 98점, 서치 후 일치하는 과목 출력
		 * 4. 성적 수정 : 검색 후 수정
		 * 5. 성적 삭제 : 검색 후 삭제
		 * 6. 종료
		 * 
		 * CRUD
		 * C(create) : 생성
		 * R(read) : 조회
		 * U(update) : 수정
		 * D(delete) : 삭제
		 */

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		Scanner scan = new Scanner(System.in);
		
		int sum = 0;
		double avg = 0;
		int menuChoice = 0;
		
		a: while(true) {
			System.out.println("★☆★☆★ Menu ★☆★☆★");
			System.out.println("1. 성적 추가");
			System.out.println("2. 성적 조회(ALL)");
			System.out.println("3. 성적 조회(과목)");
			System.out.println("4. 성적 수정");
			System.out.println("5. 성적 삭제");
			System.out.println("6. 종료");
			System.out.println("Menu 선택(1~6) >");
			menuChoice = scan.nextInt();
			
			if(menuChoice < 1 || menuChoice > 6) {
				System.out.println("Error! 잘못된 입력입니다. (1~6 정수 입력 필요)");
				continue;
			}
//			}else if(menuChoice == 6) {
//				System.out.println("★☆★ 프로그램 종료 ★☆★");
//				break;
//			}
			
			switch(menuChoice) {
			case 1:
				System.out.println("<<< 성적 추가>>>");
				System.out.println("과목명 >");
				String sc1 = scan.next();
				System.out.println("점수 >");
				int sc2 = scan.nextInt();
				map.put(sc1, sc2);
				System.out.println("--- 성적 추가 완료---");
				continue;
			case 2:
				System.out.println("<<< 성적 조회(ALL) >>>");
				for(String key : map.keySet()) {
					if(key == null) {
						System.out.println("과목을 추가해주세요.");
						continue a;
					}
					sum += map.get(key);
					System.out.println(key+": "+map.get(key)+" ");
				}
				System.out.println("합계: "+sum);
				avg = (double)sum / map.size();
				System.out.println("평균: "+avg);
				System.out.println("--- 성적 조회 완료 ---");
				continue;
			case 3:
				System.out.println("<<< 성적 조회(과목) >>>");
				System.out.println("검색 과목명 >");
				String sc3 = scan.next();
				if(map.get(sc3) == null) {
					System.out.println("검색한 과목이 존재 하지 않습니다.");
					continue a;
				}
				System.out.println(sc3+": "+map.get(sc3)+"점");
//				for(String key : map.keySet()) {
//					if(key.equals(sc3)) {
//						System.out.println(key+": "+map.get(key)+"점");
//					}
//				}
				System.out.println("--- 성적 조회 완료 ---");
				continue;
			case 4:
				System.out.println("<<< 성적 수정 >>>");
				System.out.println("수정 할 과목명 >");
				String sc4 = scan.next();
				if(map.get(sc4) == null){
					System.out.println("수정 할 과목명이 존재하지 않습니다.");
				}
//				for(String key : map.keySet()) {
//					if(ex.isContain(map, key)) {
//						System.out.println("수정 할 점수 >");
//						int sc5 = scan.nextInt();
//						map.replace(key, sc5);
//					}else {
//						System.out.println("수정 할 과목명이 없습니다.");
//						break;
//					}
//				}
				System.out.println("수정 할 점수 >");
				int sc5 = scan.nextInt();
				map.replace(sc4, sc5);
				System.out.println("--- 성적 수정 완료 ---");
				continue;
			case 5:
				System.out.println("<<< 성적 삭제 >>>");
				System.out.println("삭제 할 과목명 >");
				String sc6 = scan.next();
				if(map.get(sc6) == null) {
					System.out.println("삭제 할 과목명이 존재하지 않습니다.");
					continue;
				}
				map.remove(sc6);
				System.out.println("--- 성적 삭제 완료---");
				continue;
			case 6:
				System.out.println("★☆★ 프로그램 종료 ★☆★");
				break a;
			}
			
		}
		
		
		
		// Solution
		
		Subject sb = new Subject();
		int menu = -1;
		do {
			sb.printMenu();
			menu = scan.nextInt();
			switch(menu) {
			case 1: sb.insert(scan); break;
			case 2: sb.print(); break;
			case 3: sb.printSub(scan); break;
			case 4: sb.modify(scan); break;
			case 5: sb.delete(scan); break;
			case 6: break;
			default:
				System.out.println("잘못된 메뉴입니다.");
			}
		}while(menu != 6);
		System.out.println("프로그램 종료");
		
		
		
		scan.close();
		
		
	}

//	public boolean isContain(HashMap<String,Integer> map, String key) {
//		for(String tmp : map.keySet()) {
//			if(tmp == key) {
//				return true;
//			}
//		}
//	}
//	return false;
	
}


// Solution
class Subject{
	
	private HashMap<String, Integer> map = new HashMap<String, Integer>();
	
	public void printMenu() {
		System.out.println("★☆★☆★ 성적 관리 프로그램 ★☆★☆★");
		System.out.println("1.성적 추가|2.성적조회(ALL)|3.성적조회(과목)");
		System.out.println("4.성적 수정|5.성적삭제|6.종료");
		System.out.println("Menu 선택(1~6) >");
	}
	
	// 과목 추가
	public void insert(Scanner scan) {
		System.out.println("과목과 성적을 입력해주세요. (ex. 국어 90)");
		String subject = scan.next();
		int score = scan.nextInt();
		
		if(score < 0 || score > 100) { // 점수 에러 체크
			System.out.println("잘못된 성적입니다.");
			return;
		}
		if(map.get(subject) == null) { // 과목 중복 체크
			map.put(subject, score);
		}else {
			System.out.println(subject +"는 이미 존재하는 과목입니다.");
		}
	}
	
	// 전체 출력
	public void print() {
		int sum = 0;
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String subject = it.next();
			sum += map.get(subject);
			System.out.println(subject+":"+map.get(subject));
		}
		System.out.println("합계:"+sum);
		System.out.println("평균:"+(double)sum/map.size());
	}
	
	public void printSub(Scanner scan) {
		System.out.println("조회할 과목 입력");
		String subject = scan.next();
		Integer score = map.get(subject); // int로 하면 null을 인식할 수 없다.
		if(score == null) {
			System.out.println(subject+"는 없는 과목입니다.");
		}else {
			System.out.println(subject+":"+score);
		}
		
	}
	
	// 과목 수정
	public void modify(Scanner scan) {
		System.out.println("수정할 과목과 성적 입력 >");
		String subject = scan.next();
		int score = scan.nextInt();
		if(score < 0 || score > 100) { // 점수 에러 체크
			System.out.println("잘못된 성적입니다.");
			return;
		}
		// key중복 불가. 기존의 key를 받으면 덮어 쓰기 함.
		// null 처리 안해도 됨
		map.put(subject, score); // key중복 불가. 기존의 key를 받으면 덮어 쓰기 함.
		
		// null 처리 해야 함
		map.replace(subject, score); // subject 못 찾으면 null 리턴
	}
	
	// 성적 삭제
	public void delete(Scanner scan) {
		System.out.println("삭제할 과목 입력 >");
		String subject = scan.next();
		if(map.get(subject) == null) {
			System.out.println(subject+"는 없는 과목입니다.");
		}else {
			map.remove(subject);
			System.out.println(subject+" 과목이 삭제되었습니다.");
		}
	}

	public HashMap<String, Integer> getMap() {
		return map;
	}

	public void setMap(HashMap<String, Integer> map) {
		this.map = map;
	}
	
	
}
