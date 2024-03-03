package Day05;

import java.util.Scanner;

public class _08_과제 {

	public static void main(String[] args) {
		
		// 파일명 5개가 주어졌을 때, 원하는 단어를 입력하면 입력한 단어가 있는 파일들을 출력하도록 코드를 작성하시오.

		
		String[] fileName = {"java의 정석.txt","이것이 java다.jpg",
				"String메서드.txt","String함수.jpg","java의 함수.png"};
		
		Scanner scan = new Scanner(System.in);
		System.out.println("검색할 단어 입력>");
		String in = scan.next(); // 공백 없는 1단어를 입력 // 공백을 허용 할려면 nextline();
		System.out.println("--검색 값: " + in + "--");
		int cnt = 0;
		
		// 향상된 for문
		for(String temp : fileName) {
			if(temp.contains(in)) { // if의 조건식은 true / flase 리턴
				  System.out.println(temp);
				  cnt++;
			}
		}
		
		if(cnt == 0) { // 검색 결과가 없다면
			System.out.println("검색 결과가 없습니다.");
		}else {
			System.out.println("총 검색결과 " + cnt + "개 출력");
		}
		 
		System.out.println("-----");
		// 나의 코드
		for(int i=0; i<fileName.length; i++) {
			if(fileName[i].contains(in)) {
				System.out.println(fileName[i]);
			}
		}
		
		
		scan.close();
		
	}

}