package Day21;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class _05_BufferedReader02 {

	public static void main(String[] args) throws IOException {
		
		/* BufferedReader, PrintWriter
		 * 파일을 읽어들여, 복사하여 객체 생성
		 * test.txt 읽어들여서 text2.txt로 쓰기
		 */

		BufferedReader br = null;
		PrintWriter pw = null;
		
		final String path_OUT = "test2.txt"; // 복사할 객체 명
		System.out.println("복사를 시작 합니다.");
		
		br = new BufferedReader(new FileReader("test.txt"));
		pw = new PrintWriter(new FileWriter(path_OUT));
		
		System.out.println("복사를 위한 객체 생성 완료");
		
		String line = "";
		while((line = br.readLine()) != null) {
			System.out.println(line); // 콘솔 출력
			pw.println(line); // 줄바꿈 포함
//			pw.write(line+"\r\n"); // 줄바꿈을 직접 입력한 것
		}
		
		System.out.println("텍스트 복사 완료");
//		br.close();
//		pw.close();
		if(br != null) { // 객체가 생성 되어있다면 실행문을 실행하라
			br.close();
		}
		if(pw != null) {
			pw.close();
		}
		
	}

}
