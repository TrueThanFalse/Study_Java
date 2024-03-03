package Day19;

import java.util.NavigableSet;
import java.util.TreeSet;

public class _01_Set03 {

	public static void main(String[] args) {
		
		/* '이것이 자바다' 챕터 15. 콜렉션 자료. 641p.
		 * ArrayList : 검색 유리 / LinkedList : 삽입, 삭제 유리
		 * 어떤 List, Set, Map 이든 선언 -> 메서드 사용은 동일 함
		 * 하지만 내부에서 어떻게 동작하는지는 구조가 조금 다르다
		 * 각 List, Set, Map 마다 본인만의 메서드가 다르다
		 */
		
		// TreeSet, TreeMap : 검색 유리, 오름 차순으로 데이터를 정렬해서 저장
		
		int[] score = {80,89,80,94,78,59,84,56,60,70,90};
		// 해당 점수들 중 가장 큰점수와 작은 점수를 출력
		TreeSet<Integer> set = new TreeSet<>();
		for(int i=0; i<score.length; i++) {
			set.add(score[i]);
		}
		System.out.println(set); // 80 중복 값은 하나가 삭제되어 1개만 출력 됨
		
		// first() : 가장 앞에 있는 값 출력
		// last() : 가장 뒤에 있는 값 출력
		System.out.println("최소값: "+set.first());
		System.out.println("최대값: "+set.last());
		
		// headSet(tmp) : 지정된 객체보다 작은값(앞쪽) 출력
		// tailSet(tmp) : 지정된 객체보다 큰값(뒤쪽) 출력
		
		System.out.println("80보다 작은 값: "+set.headSet(80)); // 80 제외
		System.out.println("80보다 큰 값: "+set.tailSet(80)); // 80 포함
		
		// subSet() : 범위를 Set으로 추출 (범위 검색, 시작값 포함/끝값 미포함)
		System.out.println("70~90 사이의 값: "+set.subSet(70, 90)); // 70포함, 90 미포함

		// 내림차순 정렬 기능
		NavigableSet<Integer> desSet = set.descendingSet();
		System.out.println(desSet);
		

	}

}
