package Day18;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class _04_Map03 {

	public static void main(String[] args) {
		
		/* 과목과 점수를 입력 받아 과목:점수, 합계, 평균 출력
		 * 종료 키워드가 나올때까지 반복 (종료 키워드 = 0)
		 * 
		 * 과목> 국어 점수> 89 입력 받고
		 * 다시 입력? 종료(0) >
		 * 종료 후 출력
		 */

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		Scanner scan = new Scanner(System.in);
		
		int choise = -1;
		int sum = 0;
		double avg = 0;
		
		do {
			System.out.println("과목 입력 >");
			String tmp1 = scan.next();
			System.out.println(tmp1+"의 점수 입력 >");
			int tmp2 = scan.nextInt();
			map.put(tmp1, tmp2);
			System.out.println("계속 입력 하시겠습니까? 1 입력해주세요 >");
			System.out.println("입력 종료는 0을 입력하세요.");
			choise = scan.nextInt();
		}while(choise != 0);
		
		for(String key : map.keySet()) {
			sum += map.get(key);
			System.out.println(key+": "+map.get(key));
		}
		avg = (double)sum / map.size();
		System.out.println("합계: "+sum);
		System.out.println("평균: "+avg);
		
//		Iterator<String> it = map.keySet().iterator();
//		while(it.hasNext()) {
//			String tmp = it.next();
//			sum += map.get(tmp);
//			System.out.println(tmp + ": " + map.get(tmp));
//		}
//		System.out.println("합계: "+sum);
//		System.out.println("평균: "+avg);
		
		scan.close();
	}

}
