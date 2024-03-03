package Day18;

import java.util.HashSet;
import java.util.TreeSet;

public class _06_Set02 {

	public static void main(String[] args) {
		// Set 생성 후
		// 1~45까지 랜덤수 6개 생성 후 출력
		
		// Set은 자동으로 중복 불가!
		
		HashSet<Integer> set = new HashSet<Integer>();
		
		while(set.size() <= 5) {			
			set.add((int)(Math.random()*45)+1);
		}
		
//		while(true) {
//			if(set.size() <= 5) {
//				set.add((int)(Math.random()*45)+1);
//			}
//			break;
//		}

		System.out.println(set);
		
		System.out.println("---------------------");
		
		// TreeSet => 정렬 기능이 존재 함
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		while(treeSet.size() <= 5) {			
			treeSet.add((int)(Math.random()*45)+1);
		}
		System.out.println(treeSet);

	}

}
