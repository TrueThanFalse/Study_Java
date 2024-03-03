package Day17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class _06_List01 {

	public static void main(String[] args) {
		
		// 하루 일과를 저장하는 List를 생성 <String> 
		
		List<String> list = new ArrayList<String>();
		list.add("기상");
		list.add("출근");
		list.add("퇴근");
		list.add("운동");
		list.add("취침");
		
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i)+" ");
		}
		
		System.out.println();
		
		// 향상된 for문으로 출력
		for(String tmp : list) {
			System.out.print(tmp+" ");
		}
		
		System.out.println();
		
		// iterator로 출력
		Iterator<String> it = list.iterator();
		while(it.hasNext()) { // hasNext() : 다음의 요소 값이 존재 하는지 확인
			String tmp = it.next(); // next() : 다음 요소 값 가져오기
			System.out.print(tmp+" ");	
		}
		
		System.out.println();
		
		// Collection.sort(List);
		// 간단하게 정렬 할 수 있는 Collection 클래스의 기능. 하지만 무조건 오름차순
		Collections.sort(list);
		System.out.println(list);
		
		// sort(Comparator c) : 오름차순, 내림차순 가능
		list.sort(new Test()); // 내부클래스가 아닌 외부 클래스 활용한 방법
		System.out.println(list);
		

	}

}

class Test implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		// comparteTo 메서드 사용
		// o1.compareTo(o2) : 오름차순
		// o2.compareTo(o1) : 내림차순
		return o2.compareTo(o1);
	}
	
}
