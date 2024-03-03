package Day22;

import java.io.File;

public class _05_FileObject {

	public static void main(String[] args) {
		
		// 파일이 가지고 있는 정보 출력

		File f = new File("E:\\_Java_WorkSpace\\_Java_Work\\out.txt");
		System.out.println(f.getName()); // 경로를 제외한 이름
		System.out.println(f.getPath()); // 경로 + 이름
		System.out.println(f.getParent()); // 경로만
		System.out.println(File.separator); // => \ 파일구분자 (많이 사용 됨)
		
		// 파일명과 경로가 만약 String 형태로 들어온다면? 구분 해야 함
		String fstr = f.toString();
		System.out.println(fstr);
		
		// fstr에서 드라이브만 추출
		String fstr2 = fstr.substring(0,fstr.indexOf(File.separator));
		System.out.println(fstr2);
		// 파일명만 추출
		String fstr3 = fstr.substring(fstr.lastIndexOf(File.separator)+1);
		System.out.println(fstr3);
		// 파일 경로만 추출
		String fstr4 = fstr.substring(fstr.indexOf(File.separator),fstr.lastIndexOf(File.separator)+1);
		System.out.println(fstr4);
		
		
	}

}
