package Day18;

import java.util.HashMap;

public class _03_Map02 {

	public static void main(String[] args) {
		
		/* Map을 이용하여 과목과 점수를 입력하고
		 * 합계와 평균을 출력
		 * Map은 한 사람의 점수임
		 * 
		 * --홍길동의 점수--
		 * 국어 89
		 * 영어 45
		 * 수학 23
		 * 합계:
		 * 평균:
		 */

		HashMap<String,Integer> hong = new HashMap<>();
		hong.put("국어", 78);
		hong.put("영어", 55);
		hong.put("수학", 97);
		
		System.out.println(hong.get("과학"));
		int sum = 0;
		double avg = 0;
		for(String key : hong.keySet()) {
			sum += hong.get(key);
			System.out.println(key+":"+hong.get(key));
		}
		avg = (double)sum / hong.size();
		System.out.println("합계: "+sum);
		System.out.println("평균: "+avg);
		
		
		
	
		
		
		
	}

}
