package p150413_Chapter11;

import java.util.Calendar;
// Calendar 클래스 예제 2
public class Ex11_00_04_CalendarEx2 {
	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		Calendar cal = Calendar.getInstance();
			// 2015. 4. 15, 12:30:30 설정
		cal.set(2015, Calendar.APRIL ,15,12,30,30);		// 월은 
	
			// 오늘과 cal 날짜차이 구하기
		int tday = today.get(Calendar.DAY_OF_YEAR);
		int cday = cal.get(Calendar.DAY_OF_YEAR);
		System.out.println("날짜 차이는 : " + (cday - tday));
		String weekday[] = {"일","월","화","수","목","금","토"};
		System.out.println(weekday[cal.get(Calendar.DAY_OF_WEEK)-1]+"요일 입니다.");
	}
}
//날짜 차이는 : 2
//수요일 입니다.
