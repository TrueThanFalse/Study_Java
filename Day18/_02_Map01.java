package Day18;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class _02_Map01 {

	public static void main(String[] args) {
		
		/* Map
		 * - 값을 2개 저장 ★★★ key / value 값으로 저장
		 * - key가 메인. value는 key에 종속 됨
		 * - key는 중복 불가! value는 중복 가능(종속된 값이라 중복 가능 여부가 의미가 없음)
		 * - HashMap을 가장 많이 사용 함
		 * 
		 * HashMap<String,Interger> map = new HashMap<String,Integer>();
		 * Map은 값이 2개여서 Iterator를 Map 자체로 사용 불가
		 * 향상된 for문도 Iterator도 Set으로 key 값을 추출 후 사용( keyset() )
		 * 
		 * list, set => .add()
		 * 
		 * Map => .put()
		 * keyset(), values() => 전체 추출
		 */
		
		HashMap<String,Integer> map = new HashMap<>();
		map.put("햄버거", 7000);
		map.put("피자", 15000);
		map.put("음료수", 2000);
		System.out.println(map);
		// List,Set은 배열 취급 []
		// Map은 객체 취급 {}
		System.out.println(map.keySet()); // 리턴이 Set
		System.out.println(map.values()); // 리턴이 Collection
		
		System.out.println("-----");
		
		// key가 햄버거인 가격을 출력
		System.out.println(map.get("햄버거"));
		System.out.println("-----");
		
		// 향상된 for문 - 가장 많이 사용 됨, 간단하니까~
		for(String tmp : map.keySet()) {
			System.out.println(tmp+": "+map.get(tmp));
		}
		System.out.println("-----");
	
		// Iterator
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String tmp = it.next();
			System.out.println(tmp+": "+map.get(tmp));
		}
		System.out.println("-----");
		
		// entrySet : key와 value를 묶어줌
		System.out.println(map.entrySet());
		System.out.println("-----");
		for(Map.Entry<String,Integer> tmp : map.entrySet()) {
			System.out.println(tmp.getKey()+":"+tmp.getValue());
		}
		
		
		
		
	}

}
