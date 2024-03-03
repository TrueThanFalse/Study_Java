package Day22;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.Scanner;


public class _01_WordMain {

	public static void main(String[] args) {
		
		/* Word package에서 생성한 Word 클래스를 사용하여 단어장 프로그램 작성
		 * 단어장 프로그램 작성
		 * 1.단어등록|2.단어검색|3.단어수정|
		 * 4.단어출력|5.단어삭제|6.단어파일출력|7.종료
		 * 출력은 정렬해서
		 */

		WordManager wm = new WordManager();
		
		Scanner scan = new Scanner(System.in);
		
		int menu = -1;
		do {
			System.out.println("---------- Menu ----------");
			System.out.println("1.단어등록|2.단어검색|3.단어수정|");
			System.out.println("4.단어출력|5.단어삭제|6.단어파일출력|");
			System.out.println("7.종료");
			System.out.println("Choice >");
			
			menu = scan.nextInt();
			
			switch(menu) {
			case 1: wm.addWord(scan); break;
			case 2: wm.searchWord(scan); break;
			case 3: wm.modiWord(scan); break;
			case 4: wm.printWord(); break;
			case 5: wm.delWord(scan); break;
			case 6: 
				try {
					wm.printFileWord();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
				break;
			case 7: System.out.println("프로그램 종료"); break;
			default: System.out.println("잘못된 입력 입니다."); break;		
			}
			
		}while(menu != 7);
		
		scan.close();
		
	}

}

class WordManager{
	
	private ArrayList<Word> list = new ArrayList<Word>();
	
	public WordManager() {
		add();
	}
	
	public void add() {
		list.add(new Word("hello", "안녕"));
		list.add(new Word("hi", "안녕"));
		list.add(new Word("apple", "사과"));
		list.add(new Word("orange", "오렌지"));
		list.add(new Word("banana", "바나나"));
	}
	
	public void addWord(Scanner scan) {
		System.out.println("추가할 단어 입력 >");
		String word = scan.next();
		System.out.println("뜻 입력 >");
		String mean = scan.next();
		list.add(new Word(word, mean));
	}
	
	public void searchWord(Scanner scan) {
		System.out.println("검색할 단어 입력 >");
		String searchWord = scan.next();
// 		Solution
//			for(Word w : list) {
//			if(w.getWord().equals(searchWord)) {
//				System.out.println("--검색 결과--");
//				System.out.println(w);
//			}
//		}
//		System.out.println("검색 단어가 없습니다.");
		list.stream().filter(n-> n.getWord().equals(searchWord))
		.forEach(n-> System.out.println(n));
	}
	
	public void modiWord(Scanner scan) {
		System.out.println("수정할 단어 입력 >");
		String word = scan.next();
//		Solution
//		Word w = new Word(newWord, newMean);
//		boolean result = list.remove(new Word(word,null)); // compareTo로 오류 없음
//		if(!result) {
//			System.out.println("검색 단어 없음");
//			return;
//		}
//		System.out.println("수정 단어 >");
//		String newWord = scan.next();
//		System.out.println("수정 뜻 >");
//		String newMean = scan.next();
//		list.add(w);
		list.stream().filter(n-> n.getWord().equals(word)).forEach(n->{
			System.out.println("수정할 뜻 입력 >");
			String mean = scan.next();
			n.setMean(mean);
		});
		
		
	}
	
	public void printWord() { // 정렬하고 출력하기
		list.stream().sorted().forEach(n-> System.out.println(n));
//		Solution
//		Collections.sort(list);
//		for(Word w : list) {
//			System.out.println(w);
//		}
		
	}
	
	public void delWord(Scanner scan) {
		System.out.println("삭제할 단어 입력 >");
		String word = scan.next();
//		Solution
//		boolean result = list.remove(new Word(word,null)); // compareTo로 오류 없음
//		if(!result) {
//			System.out.println("검색 단어 없음");
//			return;
//		}
		list.removeIf(n-> n.getWord().equals(word));
	}
	
	public void printFileWord() throws IOException {
		
		FileWriter fw = new FileWriter("WordManager.txt");
		list.stream().sorted().forEach(n->{
			String data = n.toString();
			try {
				fw.write(data);
			} catch (IOException e) {
				e.printStackTrace();
			}
		});
		fw.close();
		
//		FileWriter fw2 = new FileWriter("word.txt");
//		BufferedWriter = bw2 = new BufferedWriter(fw2);
//		StringBuffer sb2 = new StringBuffer();
//		//.append : 데이터 추가
//		String data = null;
//		sb2.append("단어장");
//		sb2.append("\r\n"); // 줄바꿈
//		Collections.sort(list);
//		int cnt = 0;
//		while(cnt < list.size()) {
//			sb2.append(list.get(cnt));
//			sb2.append("\r\n"); // 줄바꿈
//			cnt++;
//			
//		}
//		data = sb2.toString();
//		System.out.println(data);
//		bw2.write(data);
//		
//		bw2.close();
//		fw2.close();
		
	}
	
}

class Word implements Comparable{
	
	private String word;
	private String mean;
	
	public Word() {}
	public Word(String word, String mean) {
		this.word = word;
		this.mean = mean;
	}
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public String getMean() {
		return mean;
	}
	public void setMean(String mean) {
		this.mean = mean;
	}
	@Override
	public String toString() {
		return word + " : " + mean;
	}
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(mean, word);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) // 주소가 같은지 확인
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass()) // 클래스 정보 확인
			return false;
		Word other = (Word) obj;
		// return Objects.equals(mean, other.mean) && Objects.equals(word, other.word);
		return Objects.equals(word, other.word);
	}
	
	
	
	@Override // 객체 생성 후 sort를 실행하면 compareTo 실행 됨
	public int compareTo(Object o) {
		// Comparable : 내 클래스의 객체 값과, 매개변수로 들어오는 객체의 값을 비교 함
		// Comparator : 이미 완성된 컬렉션에서 앞의 값과 뒤의 값을 비교 함
		Word word = (Word)o; // 형변환
		return this.word.compareTo(word.word);
		// 내림차순 : 결과 값 앞에 - 부호만 붙여주면 내림차순 
		//return -this.word.compareTo(word.word);
	}
	
	
}