package Day21;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class _06_BufferedReader03 {

	public static void main(String[] args) throws IOException {
		
		/* BufferedReader, FileReader를 이용하여 out.txt 파일을
		 * map에 저장하고 합계와 총 인원수를 출력
		 * 입력한 값을 읽어들이면 값은 전부 String 형태로 읽음
		 * 계산을 위해서는 int 자료형으로 변환이 필요
		 * Integer.parseInt(값) : String => int 변환 됨
		 */
		
		
		BufferedReader br = new BufferedReader(new FileReader("out.txt"));
		HashMap<String, Integer> map = new HashMap<String, Integer>();
			
		int sum = 0;
		
		while(true) {
			String line = br.readLine();
			if(line == null) {
				break;
			}
			String key = line.substring(0, 3);
			String tmpscore = line.substring(4, 6);
			int score = Integer.parseInt(tmpscore);
			map.put(key, score);
		}
		
		for(String tmp : map.keySet()) {
			sum += map.get(tmp);
		}
		System.out.println("합계: "+sum);
		System.out.println("인원수: "+map.size());
		
		
		// Solution
		BufferedReader br2 = new BufferedReader(new FileReader("out.txt"));
		HashMap<String, Integer> map2 = new HashMap<String, Integer>();
		
		String line2 = "";
		while((line2 = br2.readLine()) != null) {
			// substring(포함,미포함)
			String name = line2.substring(0, line2.indexOf(" "));
			int score = Integer.parseInt(line2.substring(line2.indexOf(" ")+1));
			map2.put(name, score);
		}
		System.out.println(map2);
		int sum2 = 0;
		for(String key : map.keySet()) {
			System.out.println(key+":"+map.get(key));
			sum2 += map.get(key);
		}
		System.out.println("인원수: "+map.size()+"합계: "+sum2);
		
	}
		
		
		
		
		
		
		
		
//BufferedReader br = new BufferedReader(new FileReader("test.txt"));
//		
//		while(true) {
//			String line = br.readLine(); // readLine() : 한라인 읽어오기
//			if(line == null) { // 더이상 읽을 라인이 없다면
//				break;
//			}
//			System.out.println(line);
//		}
//		br.close();
		

	

}
