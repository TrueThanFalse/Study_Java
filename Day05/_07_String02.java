package Day05;

public class _07_String02 {

	public static void main(String[] args) {
		
		// 이것이자바다.txt => 파일명과 확장자를 분리하여 출력
		
		String fileName = "이것이자바다.txt";
		System.out.println(fileName.substring(0,fileName.indexOf(".")));
		System.out.println(fileName.substring(fileName.indexOf(".")+1));

		// 선생님 답안
		System.out.println(fileName.contains("자바")); // boolean 리턴
		String file = fileName.substring(0, fileName.indexOf("."));
		System.out.println("file" + file);
		
		String sux = fileName.substring(fileName.indexOf(".")+1);
		System.out.println("확장자" + sux);
		
				
				


	}

}
