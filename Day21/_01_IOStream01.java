package Day21;

import java.io.IOException;

public class _01_IOStream01 {

	public static void main(String[] args) {
		
		/* 교제 780p 입출력(Input,Output) Stream
		 * Stream(스트림) : 단방향으로 데이터가 흘러가는 형태
		 * Java는 입력스트림, 출력스트림을 통해 데이터를 입출력 한다.
		 * 다양한 장치에 독립적이고 일관성 있는 입출력을 유지하기 위해 입출력 스트림을 통해 일관성을 제공
		 * 
		 * 2가지 형태의 스트림
		 * - 바이트 형태의 스트림 : 기본(문자, 그림, 멀티미디어)
		 * - 문자 형태의 스트림 : 문자만 입출력을 할 때 사용
		 * 
		 * 바이트 스트림
		 * - 입력(InputStream)  : FileInputStream, BufferedInputStream, DataInputStream ......
		 * - 출력(OutputStream) : FileOutputStream, BufferedOutputStream, DataOutputStream, PrintOutputStream ......
		 * 
		 * 문자 스트림
		 * - 입력(Reader) : FileReader, BufferedReader, InputStreamReader ......
		 * - 출력(Writer) : FileWriter, BufferedWriter, PrintWriter ......
		 * 
		 * --------------------
		 * 기반스트림 / 보조스트림
		 * 기반스트림 : 대상에서 직접 자료를 읽고 쓰는 기능이 있는 스트림
		 * 기반스트림 종류 : fileInputStream, fileOutputStream, fileReader, fileWriter ......
		 *
		 * 보조스트림 : 직접 읽고 쓰는 기능은 없지만, 추가적인 기능을 더해주는 스트림 (Buffered)
		 * 보조스트림 종류 : inputStreamReader, BufferedReader, BufferedWriter ......
		 */
		
		// 표준 출력(모니터=콘솔) 스트림
		System.out.println();
		
		// 표준 입력(키보드) 스트림 // 반드시 try~catch 필요
		try {
			// 한번에 한 바이트 읽기
			int b = System.in.read();
			System.out.println("read() > "+b);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// 표준 에러 출력
		System.err.println("11111");

	}

}
