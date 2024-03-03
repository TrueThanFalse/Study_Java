package Day19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.Scanner;

public class _09_과제Solution {

	public static void main(String[] args) {
	
		// Word 클래스 -> 단어, 의미
		// Comparator는 sort 할때만 사용 됨. 즉 1번만 사용되므로 내부 클래스로 활용 된다.
		// 정렬 => Comparator 구현 객체 / 기존 클래스 + comparable 구현
		// 정렬은 equals 비교하여 정렬
		// 어떤 값을 기준으로 정렬?
		
		
		// 자료구조는 그저 객체를 담는 변수
		// 객체는 반드시 생성해서 list에 add 해야 함
		ArrayList<Word2> list = new ArrayList<Word2>();
		
		Scanner scan = new Scanner(System.in);
		
		int menu = -1;
		do {
			// menu의 값이 0이면 입력 stop, 그 전에는 계속 입력
			System.out.println("단어를 입력하시겠습니까? (계속:1, 그만:0)");
			menu = scan.nextInt();
			if(menu == 0) {
				System.out.println("입력 종료");
				break;
			} else {
				System.out.println("단어 입력>");
				String word = scan.next();
				System.out.println("의미 입력>");
				String mean = scan.next();
				
				Word2 w = new Word2(word,mean);
				list.add(w);
			}
		}while(menu != 0);
		
		// 정렬
		Collections.sort(list);
		
		for(Word2 tmp : list) {
			System.out.println(tmp);
		}
		
		scan.close();
		
		
		

	}

}

class Word2 implements Comparable{
	
	private String word;
	private String mean;
	
	public Word2() {}
	public Word2(String word, String mean) {
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
		Word2 other = (Word2) obj;
		// return Objects.equals(mean, other.mean) && Objects.equals(word, other.word);
		return Objects.equals(word, other.word);
	}
	
	
	
	@Override // 객체 생성 후 sort를 실행하면 compareTo 실행 됨
	public int compareTo(Object o) {
		// Comparable : 내 클래스의 객체 값과, 매개변수로 들어오는 객체의 값을 비교 함
		// Comparator : 이미 완성된 컬렉션에서 앞의 값과 뒤의 값을 비교 함
		Word2 word = (Word2)o; // 형변환
		return this.word.compareTo(word.word);
		// 내림차순 : 결과 값 앞에 - 부호만 붙여주면 내림차순 
		//return -this.word.compareTo(word.word);
	}
	
	
}