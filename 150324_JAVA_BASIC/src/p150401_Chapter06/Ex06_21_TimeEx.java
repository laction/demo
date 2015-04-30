package p150401_Chapter06;
import java.util.Date;
class Time{
	private int hour ;
	private int minute;
	private int second;
				// 값을 보호하고 제약조건을 걸어 클래스의 일관성을 높일 수 있다.
	public void setHour(int h){			if ( h <0 || h >23 ) return;		hour = h;	}
	public void setMinute(int m){		if (m < 0 || m > 59) return;	minute = m;			}
	public void setSecond(int s){		if( s < 0 || s > 59) return;		second = s;	}
	public String getTime() {		return hour + ":" + minute + ":" + second ;	}
}
public class Ex06_21_TimeEx {
	public static void main(String[] args) {
		Time t = new Time();
		Date date = new Date();
		t.setHour(date.getHours());
		t.setMinute(date.getMinutes());
		t.setSecond(date.getSeconds());
		System.out.println(t.getTime());
	}
}
//10:8:8
