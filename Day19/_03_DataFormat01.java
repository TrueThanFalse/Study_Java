package Day19;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class _03_DataFormat01 {

	public static void main(String[] args) throws ParseException {
		
		/* 날짜의 형식을 맞춰주기 위한 설정
		 * format 설정
		 * 날짜는 년,월,일,요일,시,분,초
		 * 날짜 -> 문자로 변환 (String화)
		 */

		Date date = new Date();
		System.out.println(date);
		
		// 날짜를 문자로 변환
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd (E) hh:mm:ss"); // month만 대문자
		String dateString = sdf.format(date);
		System.out.println(dateString);
		
		// 문자열을 날짜로 변환
		String birth = "2009-09-30 17:30:50";
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); // HH 하면 24시간제 표기
		Date date2 = sdf2.parse(birth);
		System.out.println(date2);
		
	}

}
