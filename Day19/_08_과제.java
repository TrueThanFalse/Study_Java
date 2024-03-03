package Day19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class _08_과제 {

	public static void main(String[] args) {
		
		/* 단어장
		 * Word 클래스 생성
		 * 단어 : 의미
		 * hello : 안녕
		 * apple : 사과
		 * banana : 바나나
		 * 
		 * 단어를 추가, 출력(정렬해서 출력)
		 */

		Scanner scan = new Scanner(System.in);
		
		ArrList al = new ArrList();
		
		al.addWord(scan);
		al.addWord(scan);
		al.addWord(scan);
		al.printSort();
		
	}

}

class Word{
	
	// Word 클래스 -> 단어, 의미
	// 정렬 => Comparator 구현 객체 / 기존 클래스 + comparable 구현
	// 정렬은 equals 비교하여 정렬
	private String name;
	private String mean;
	
	public Word(String name, String mean) {
		this.name = name;
		this.mean = mean;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMean() {
		return mean;
	}

	public void setMean(String mean) {
		this.mean = mean;
	}

	@Override
	public String toString() {
		return name+" : "+mean;
	}

}



class ArrList {
	
	private ArrayList<Word> list = new ArrayList<Word>();

	public void addWord(Scanner scan) {
		System.out.println("단어명>");
		String name = scan.next();
		System.out.println("뜻>");
		String mean = scan.next();
		Word tmp = new Word(name, mean);
		list.add(tmp);
	}

	public void printSort() {
        Collections.sort(list, new Comparator<Word>() {
            @Override
            public int compare(Word word1, Word word2) {
                return word1.getName().compareTo(word2.getName()); // name을 기준으로 오름차순 정렬
            }
        });

        for (Word word : list) {
            System.out.println(word);
        }
    }

	public ArrayList<Word> getList() {
		return list;
	}

	public void setList(ArrayList<Word> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "ArrayMain [list=" + list + "]";
	}
	
}
