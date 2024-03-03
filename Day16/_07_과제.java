package Day16;

import java.util.Scanner;

public class _07_과제 {

	Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		/* 5개의 문자열 배열을 생성한 후, 5개의 파일명을 입력받는 코드를 작성
		 * 입력받은 파일 중 이미지 파일을 검색하여 출력하는 코드 작성
		 * 이미지파일 형식은 (jpg, png, gif, jpeg)
		 * String[] fileName = {"java.txt","String.jpg","method.png",
		 * "String.pdf","java.pdf"}
		 * 
		 * --이미지 파일--
		 * String.jpg
		 * method.png
		 * */

		_07_과제 good = new _07_과제();
		
		try {
			String[] fileName = good.creationStringArray(5);
			good.printSearchImage(fileName);
		} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
		}

	}
	
	
	
	public String[] creationStringArray(int size) throws RuntimeException{
		if(size <= 0) {
			throw new RuntimeException("배열의 크기는 0보다 작을 수 없습니다.");
		}
		String[] arr = new String[size]; 
		System.out.println(size+"개의 파일을 저장해주세요.");
		for(int i=0; i<arr.length; i++) {
			System.out.println("저장 하실 "+(i+1)+"번째 파일명을 입력>");
			arr[i] = scan.next();
		}
		return arr;
	}
	
	public void printSearchImage(String[] arr) throws RuntimeException{
		if(arr == null) {
			throw new RuntimeException("배열이 존재 하지 않습니다.");
		}
		int cnt = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i].contains("jpg")||arr[i].contains("png")||arr[i].contains("gif")||arr[i].contains("jpeg")) {
				cnt++;
			}
		}
		if(cnt > 0) {
			System.out.println("<<< 검색된 이미지 파일 >>>");
		}else if(cnt == 0) {
			System.out.println("이미지 파일이 없습니다.");
			return;
		}
		for(int k=0; k<arr.length; k++) {
			if(arr[k].contains("jpg")||arr[k].contains("png")||arr[k].contains("gif")||arr[k].contains("jpeg")) {
				System.out.println(arr[k]);
			}
		}
	}

}
