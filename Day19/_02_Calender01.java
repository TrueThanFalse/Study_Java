package Day19;

import java.util.Calendar;
import java.util.Date;

public class _02_Calender01 {

	public static void main(String[] args) {
		
		/* 날짜 시간 클래스
		 * Date 클래스 : 현재 잘 안쓰는 클래스
		 * Calender 클래스 : 추상클래스, 직접 객체를 생성할 수 없음
		 * 	- 추상클래스, 직접 객체를 생성할 수 없음
		 *  - new 키워드를 통해 겍체 구현 불가
		 *  - getInstance() 메서드를 통해 구현한 인스턴스를 가져올 수 있음
		 *  - 사용자 컴퓨터 시스템의 날짜와 시간을 불러오는 클래스
		 *  
		 * month : 0월~11월 => +1 필요.
		 * day : 1~31일
		 * week : 1=일, 2=월 3=화 ...
		 * am_pm : am=0, pm=1
		 */
		
		Date d = new Date(); // 직접 객체 생성 가능
		
		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR);
		System.out.println(year);
		int month = now.get(Calendar.MONTH)+1; // 0월 부터 시작
		System.out.println(month);
		int day = now.get(Calendar.DAY_OF_MONTH);
		System.out.println(day);
		int week = now.get(Calendar.DAY_OF_WEEK);
		System.out.println(week);
		System.out.println(year+"년"+month+"월"+day+"일");
		
		// hour, minute, second
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		int ampm = now.get(Calendar.AM_PM);
		
		System.out.println("----------");
		// 2023-09-11 (월)
		// 오전 09:43
		if(month < 10) {
			switch(week) {
			case 1: System.out.println(year+"-0"+month+"-"+day+" (일)"); break;
			case 2: System.out.println(year+"-0"+month+"-"+day+" (월)"); break;
			case 3: System.out.println(year+"-0"+month+"-"+day+" (화)"); break;
			case 4: System.out.println(year+"-0"+month+"-"+day+" (수)"); break;
			case 5: System.out.println(year+"-0"+month+"-"+day+" (목)"); break;
			case 6: System.out.println(year+"-0"+month+"-"+day+" (금)"); break;
			case 7: System.out.println(year+"-0"+month+"-"+day+" (토)"); break;
			default : System.out.println("Error!"); break;
			}
		}else {
			switch(week) {
			case 1: System.out.println(year+"-"+month+"-"+day+" (일)"); break;
			case 2: System.out.println(year+"-"+month+"-"+day+" (월)"); break;
			case 3: System.out.println(year+"-"+month+"-"+day+" (화)"); break;
			case 4: System.out.println(year+"-"+month+"-"+day+" (수)"); break;
			case 5: System.out.println(year+"-"+month+"-"+day+" (목)"); break;
			case 6: System.out.println(year+"-"+month+"-"+day+" (금)"); break;
			case 7: System.out.println(year+"-"+month+"-"+day+" (토)"); break;
			default : System.out.println("Error!"); break;
			}
		}

		if(month < 10) {
			switch(ampm) {
			case 0: System.out.println("오전 0"+hour+":"+minute); break;
			case 1: System.out.println("오후 0"+hour+":"+minute); break;
			default : System.out.println("Error!"); break;
			}
		}else {
			switch(ampm) {
			case 0: System.out.println("오전 "+hour+":"+minute); break;
			case 1: System.out.println("오후 "+hour+":"+minute); break;
			default : System.out.println("Error!"); break;
			}
		}
		
		// Solution
		String weekString = null;
		switch(week) {
		case 1: weekString="일"; break;
		case 2: weekString="월"; break;
		case 3: weekString="화"; break;
		case 4: weekString="수"; break;
		case 5: weekString="목"; break;
		case 6: weekString="금"; break;
		case 7: weekString="토"; break;
		default: break;
		}
		System.out.println(year+"-"+month+"-"+day+" ("+weekString+")");
		System.out.println((ampm == 0? "오전":"오후")+" "+hour+":"+minute+":"+second);

		

	}

}
