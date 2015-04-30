package p150413_Chapter11;

import java.util.Calendar;
/* Calendar 클래스 : 추상클래스임. 객체생성불가
 * 									getInstance() 메서드로 객체를 구함.
 * */
public class Ex11_00_03_CalendarEx {
	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		System.out.println(today.get(Calendar.YEAR )+ "년");
		System.out.println(today.get(Calendar.MONTH )+ "월");
		System.out.println(today.get(Calendar.WEEK_OF_YEAR )+ "째 주(올해의)");
		System.out.println(today.get(Calendar.WEEK_OF_MONTH)+"째 주(이번달의)");
		System.out.println(today.get(Calendar.DATE)+"일자");
		System.out.println(today.get(Calendar.DAY_OF_YEAR)+"일째(올해로)");
		System.out.println(today.get(Calendar.DAY_OF_MONTH)+"일째(이번달로)");		// DATE와 동일.
		System.out.println(today.get(Calendar.DAY_OF_WEEK)+"일째(요일로)");
		System.out.println(today.get(Calendar.AM_PM)+" (0:오전,1:오후)");
		System.out.println(today.get(Calendar.HOUR)+"시(12시)");
		System.out.println(today.get(Calendar.HOUR_OF_DAY)+"시(24시)");
		System.out.println(today.get(Calendar.MINUTE)+"(분)");
		System.out.println(today.get(Calendar.SECOND)+"초");
		System.out.println(today.get(Calendar.MILLISECOND)+"밀리초");
		System.out.println(today.get(Calendar.ZONE_OFFSET)/(60*60*1000)+"(today.get(Calendar.ZONE_OFFSET)/(60*60*1000))");
		System.out.println(today.getActualMaximum(Calendar.DATE)+"(이번달의 마지막일)");
	}
}
//2015년
//3월
//16째 주(올해의)
//3째 주(이번달의)
//13일자
//103일째(올해로)
//13일째(이번달로)
//2일째(요일로)
//1 (0:오전,1:오후)
//0시(12시)
//12시(24시)
//42(분)
//45초
//316밀리초
//9(today.get(Calendar.ZONE_OFFSET)/(60*60*1000))
//30(이번달의 마지막일)
