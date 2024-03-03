package Day19;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class _04_LocalDateTime01 {

	public static void main(String[] args) {
		
		/* LocalDateTime : 현재의 날짜와 시간
		 * LocalTime : 시간만
		 * LocalDate : 날짜만
		 */
		
		LocalDateTime today = LocalDateTime.now();
		System.out.println(today);
		System.out.println(today.getYear());
		System.out.println(today.getMonth());
		System.out.println(today.toString()); // 문자열 리턴
		
		String curr = today.toString(); // String화
		
		// T 기준으로 앞에 있는 연월일 추출
		System.out.println(curr.substring(0,curr.indexOf("T")));
		// T 기준으로 뒤에 있는 시분초 추출
		System.out.println(curr.substring(curr.indexOf("T")+1));
		System.out.println(curr.substring(curr.indexOf("T")+1, curr.indexOf(".")));

		// 일반적으로 사용하는 방식
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd (a)HH:mm:ss"); // 형식 설정
		System.out.println(dtf.format(today));
		
		// 값을 입력하여 날짜 출력
		LocalDateTime sDate = LocalDateTime.of(2009, 9, 30, 17, 30);
		System.out.println(sDate.format(dtf));
		
		
	}

}
