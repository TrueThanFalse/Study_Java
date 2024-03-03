package Day18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class _01_Set01 {

	public static void main(String[] args) {
		
		/* Set
		 * 중복 금지★ : 가장 큰 장점 (중복 금지만 활용하고 다시 List로 돌리는 경우가 많다)
		 * 순서 보장 X (index가 없음)
		 * HashSet이 일반적이다
		 * getter, setter 불가
		 */
		
		HashSet<String> set = new HashSet<String>();
		set.add("apple");
		set.add("banana");
		set.add("apple");
		set.add("peach");
		set.add("홍길동");
		set.add("이순신");
		set.add("banana");
		
		System.out.println(set);
		for(String tmp : set) {
			System.out.print(tmp+" ");
		}
		
		System.out.println();
		System.out.println("--iterator 출력--");
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String tmp = it.next();
			System.out.print(tmp+" ");
		}
		
		System.out.println();
		System.out.println("------------------------------");
		// Set을 List로 변환 후 정렬
		List<String> list = new ArrayList<String>(set);
		System.out.println(list);
		Collections.sort(list); // 정렬은 한글보다 영어가 우선
		System.out.println(list);
		
		list.sort(new Comparator<String>() {// 내림차순 정렬 

			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
			
		});
		System.out.println(list);

	}

}
