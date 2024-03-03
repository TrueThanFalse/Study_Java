package Day05;

public class _06_String01 {

	public static void main(String[] args) {
		
		/* String 클래스 = 문자열을 다루는 클래스
		 * Stirng str = new String();
		 * String str = "가나다"; // 객체가 있는 참조변수지만 기본 자료형 생성 가능
		 * index => 0부터 시작
		 */
		
		String str = "Hello world~";
		System.out.println(str);
		
		// ---문자열 메서드들---
		// charAt(index) : index번지에 있는 한글자를 리턴
		System.out.println("--charAt--");
		System.out.println(str.charAt(0)); // H
		System.out.println(str.charAt(5)); // 공백 => 공백도 글자다
		System.out.println(str.charAt(6)); // w
		
		// length : 문자열의 전체 길이 (공백 포함. 공백도 1글자 취급 한다)
		System.out.println("--length--");
		System.out.println(str.length()); // 12
		
		// compareTo(str) : str문자열과 비교하여 같으면 0, 사전순으로 앞이면 -1, 뒤면 1
		// 문자열 정렬시 활용한다
		System.out.println("--compareTo--");
		System.out.println("b".compareTo("a")); // 1
		System.out.println("b".compareTo("c")); // -1
		System.out.println("b".compareTo("b")); // 0
		System.out.println("g".compareTo("c")); // 4
		
		// comcat(str) : 이어붙이기 (+연산자와 같은 의미) // 다른 언어에서는 +연산자를 사용 할 수 없을때 comcat 활용
		System.out.println("--concat--");
		System.out.println("abc".concat("def")); // abcdef
		System.out.println("abc"+"def"); // abcdef
		
		/* equals(str) : 두 문자열이 같은지 확인(대소문자 구분 함), boolean 리턴
		 * == : 주소가 같은지 확인
		 * equals : 내용이 같은지 확인 
		 */
		System.out.println("--equals--");
		System.out.println("abc".equals("abc")); // true
		System.out.println("abc".equals("def")); // false
		System.out.println("abc".equals("Abc")); // false
		
		/* indexOf(str) : 문자의 위치가 몇번째에 있는지 찾아주는 기능 ★★★
		 * 0부터 시작, 숫자 리턴
		 * 찾는 문자가 없다면 -1 리턴
		 * lastIndexOf(str) : 해당 문자의 마지막 위치를 숫자로 리턴
		 */
		System.out.println("--indexOf--");
		System.out.println("abc".indexOf("c")); // 2
		System.out.println("abc".indexOf("f")); // -1
		String email = "abc@naver.co.kr";
		System.out.println(email.indexOf("@")); // 3
		System.out.println(email.indexOf(".")); // 9
		System.out.println(email.lastIndexOf(".")); // 12
		
		// substring : 문자열 추출 ★★★
		// str.substring(시작번지,끝번지) => 시작번지는 포함, 끝번지는 포함X
		System.out.println("--substring--");
		System.out.println(email.substring(0,5)); // abc@n
		System.out.println(email.substring(0, email.indexOf("@"))); // abc
		System.out.println(email.substring(email.indexOf("@"))); // @naver.co.kr // 끝번지를 작성 안하면 끝까지 출력
		System.out.println(email.substring(email.indexOf("@")+1)); // naver.co.kr
		
		// trim : 불필요한 공백 제거
		System.out.println("--trim--");
		System.out.println("     Hello     ".trim()); // Hello
		
		// replace : 글자 치환
		System.out.println("--repalce--");
		System.out.println("Hello World".replace("World", "JAVA")); // Hello JAVA
		
		// split : 특정 값을 기준으로 나누기
		System.out.println("--split--");
		String str1 = "dog,cat,tiger";
		String[] str2 = str1.split(","); // 아무것도 넣지 않으면 1글자씩 전부 나눈다.
		for(String temp : str2) {
			System.out.println(temp);
		}
		
		// parseInt : 문자를 숫자로 변환
		System.out.println("--parseInt--");
		String num1 = "1";
		String num2 = "2";
		System.out.println(num1+num2);
		int num3 = Integer.parseInt(num1);
		int num4 = Integer.parseInt(num2);
		System.out.println(num3+num4);
		
		// contains(str) : 해당 글자를 포함하고 있는지를 체크 ★★★ boolean 리턴
		System.out.println("--contains--");
		System.out.println(email.contains("@"));
		

	}

}
