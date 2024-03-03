package Day16;

public class _07_과제Solution {

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
		
		String[] fileName = {"png.txt","String.jpg","method.png","String.pdf","jpg.pdf"};
		
		String[] img = {"jpg", "png", "gif", "jpeg"};
		
		_07_과제Solution ex = new _07_과제Solution();

		try {
			for(String tmpFile : fileName) {
				String search = tmpFile.substring(tmpFile.lastIndexOf(".")+1);
//				System.out.println();
				if(ex.isContains(img, search)) {
					System.out.println(tmpFile);
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

	// isContains 메서드
	// 배열에서 찾는 문자열이 있는지 체크, true/false 리턴
	public boolean isContains(String[] arr, String search) {
		if(arr == null || arr.length == 0) {
			throw new RuntimeException("배열이 null 입니다.");
		}
		if(search == null || arr.length == 0) {
			throw new RuntimeException("검색어가 없습니다.");
		}
		
		for(String tmp : arr) {
			if(tmp.equals(search)) {
				return true;
			}
		}
		return false;
	}
	
}
