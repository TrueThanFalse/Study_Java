package Day21;

import java.io.FileWriter;
import java.io.IOException;

public class _03_FileWriter01 {

	public static void main(String[] args) {
		
		/* FileWriter : 문자 기반 스트림 // File 만들기
		 * FileWriter 변수 = new FileWriter(파일명); 
		 * 
		 */

		try {
			FileWriter fw = new FileWriter("test.txt");
			for(int i=1; i<=10; i++) {
				String data = i+". test입니다 \r\n"; // \r\n 줄바꿈
				fw.write(data);
			}
			fw.close();
			
			// 파일에 데이터 추가 방법 (파일명,true)
			// true 키워드로 생성이 아닌 추가 한다고 작성 하지 않으면 계속 덮어쓰기 함
			FileWriter fw2 = new FileWriter("test.txt",true);
			for(int i=11; i<=20; i++) {
				String data = i+".★ test입니다 \r\n"; // \r\n 줄바꿈
				fw2.write(data);
			}
			fw2.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
