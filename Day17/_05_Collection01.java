package Day17;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class _05_Collection01 {

	public static void main(String[] args) {

		/* 컬렉션 프레임워크 : 표준화된 방식의 자료구조
		 * List, Set, Map
		 * 데이터를 묶어서 관리할 때 사용 (배열 대신 List 사용)
		 * 
		 * List
		 *  - 배열과 동작하는 방식이 동일
		 *  - 값을 하나씩 저장
		 *  - 중복 가능
		 *  - index 존재 함
		 *  - 배열 대신에 가장 많이 사용
		 * 
		 * Set
		 *  - 값을 하나씩 저장
		 *  - 중복 불가!★★★ (로또 번호 같은 것을 만들 때 유용함)
		 *  - index 없음!★ (for문 사용 어려움) // 정렬 불가능 // 자주 사용하기 어렵다
		 *  - 순서를 보장하지 않음(순서 없음)
		 * 
		 * Map
		 *  - 값을 2개씩 저장★★★ => key/value 쌍으로 저장 <ex. 국어(key) 90점(value)>
		 *  - key는 중복 불가, value는 중복 가능
		 *  - key가 중복되면 덮어쓰기 함
		 *  - 아이디/패스워드 처럼 같이 묶어서 하나의 자료로 저장해야 할 때 사용됨
		 *  - 순서를 보장하지 않음(순서 없음)
		 *  
		 *  <컬렉션 프레임워크 특징>
		 *  int arr[] = new int[5]
		 *  String arr[] = new String[5];
		 *  배열은 기본 자료형으로 사용 가능하다.
		 *  but
		 *  collection 에서는 클래스로 데이터를 관리
		 *  int -> Integer, String, long -> Long, byte -> Byte, double -> Double ......
		 *  int와 String을 제외한 나머지 자료형은 첫글자만 대문자로 바꾸면 클래스로 인식 됨
		 *  클래스를 지정하지 않으면 Object가 자동으로 들어간다.
		 */
		
		List<Integer> list = new ArrayList<Integer>(); // 일반적인 선언
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		List list3 = new ArrayList(); // Object가 자동으로 들어간 케이스
		
		// add() : 리스트에 요소를 추가
		list.add(10);
		list.add(20);
		list.add(30);
		System.out.println(list); // List는 자동으로 toString이 포함되어 있음★
		
		// size() : List의 개수 리턴 (배열의 길이 같은 개념)
		System.out.println(list.size());
		
		System.out.println("-------------------");
		
		// 앞에서 String 선언을 해서 뒤쪽 String은 생략 가능
		// 앞에도 자료형을 선언하지 않으면 Object 자동으로 들어감
		List<String> list4 = new ArrayList<>();
		list4.add("유재석");
		list4.add("송지효");
		list4.add("양세찬");
		System.out.println(list4);
		System.out.println(list4.size());
		
		System.out.println("-------------------");	
		
		// list2에 1부터 10까지 입력하고 출력
		for(int i=1; i<=10; i++) {
			list2.add(i);
		}
		System.out.println(list2);
		for(int i=1; i<=10; i++) { // List는 중복 가능!!!★
			list2.add(i);
		}
		System.out.println(list2);
		
		System.out.println("-------------------");
		
		// get(index) : index 번지의 값을 가져오는 것
		// set(index, 값) : index 번지의 값을 변경하는 것
		System.out.println(list2.get(0));
		list2.set(0, 5);
		System.out.println(list2.get(0));
		System.out.println(list2);
		
		System.out.println("-------------------");
		
		// list2의 모든 요소를 하나씩 출력
		for(int i=0; i<list2.size(); i++) {
			if(list2.get(i) % 2 == 0) {
				System.out.print(list2.get(i)+" ");
			}
		}
		
		// remove(index) : index 번지 객체 삭제 
		// remove(object): 처음 만나는 object 객체 삭제
		list2.remove(0);
		System.out.println(list2);
		Integer a = 10;
		list2.remove(a); // 처음 만나는 10 삭제(10번지 10)
		System.out.println(list2);
		list2.remove(a); // 처음 만나는 10 삭제(20번지 10)
		System.out.println(list2);
		
		// contains(Object) : List에 값이 있는지 검색, true/false 리턴
		Integer b = 5;
		System.out.println(list2.contains(b));
		
		// clear() : 리스트 비우기
		list2.clear();
		System.out.println(list2);
		
		// isEmpty() : List가 비어 있는지 체크 true/false 리턴
		System.out.println(list2.isEmpty());
		
		// list2에 1부터 5까지 값을 추가하고 각 요소를 출력
		for(int i=1; i<=5; i++) {
			list2.add(i);
			System.out.print(list2.get(i-1) + " ");
		}
		// 향상된 for문으로 출력
		System.out.println();
		for(int tmp : list2) { // int와 Integer는 같은 자료형이라 자동으로 형변환 됨
			System.out.print(tmp + " ");
		}
		
		/* index를 사용할 수 없는 컬렉션을 출력하기 위해 사용하는 객체
		* Interator : index가 없는 컬렉션을 출력하기위해 사용 ★
		* List는 index가 있기 때문에 get(i)를 사용 가능
		* 하지만 Set이나 Map은 순서를 보장하지 않으므로 for문, get(i) 사용 불가
		* 따라서 향상된 for문 혹은 Iterator 처럼 순서와 상관없이 값을 가져올수 있는 구문에서 출력 가능
		*/
		
		System.out.println();
		System.out.println("> Iterator 출력 <");
		Iterator<Integer> it = list2.iterator();
		while(it.hasNext()) { // 다음 요소가 있는지 체크
			Integer tmp = it.next(); // 다음 요소 가져오기
			System.out.print(tmp + " ");
		}
		// 요즘에는 향상된 for문이 간단하게 사용 할 수 있어 향상된 for문으로 사용 출력 함
		
		System.out.println("-------------------");
		
		// indexOf(값) : 값의 index 번지를 리턴(숫자 리턴) / 값이 없으면 -1 리턴
		Integer c = 5;
		System.out.println(list2.indexOf(c));
		System.out.println(list2.indexOf(3));
		
		// sort(객체) : 정렬
		// - 객체 : comparator 인터페이스를 구현한 객체를 넣어야 함. <'내부(익명)클래스'를 활용함>
		list2.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
//				o1 - 02; : 오름차순
//				o2 - o1; : 내림차순
				return o2 - o1;
			}
		});
		System.out.println(list2);
		
		
		
		
	}

}
