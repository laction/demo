package p150408_Chapter09;

import java.util.ArrayList;

/* wrapper 클래스 : 기본형 8개를 클래스화 한 클래스. => 기본형을 객체화할 떄 사용
 * 종류
 * 기본형			wrapper클래스
 * boolean	Boolean
 * char			Character
 * byte			Byte
 * short			Short
 * int				Integer
 * long			Long
 * float			Float
 * double		Double
 * 
 * 기본형과 참조형은 서로 형변환되지 않는다.
 * 하지만, 기본형과 wrapperㅋ르래스는 형변황 가능 ( JDK 5.0 이후 )
 * 	기본형 -> wrapper 클래스 : auto-Boxing
 * 	            <-                              : autu-UnBoxing 
 * */
public class Ex09_11_WrapperEx1 {
	public static void main(String[] args) {
		Integer i1 = new Integer(100);
		Integer i2 = 100;
		System.out.println("i1 == i2 ?"+(i1==i2));						// 서로 다른 참조형 변수
		System.out.println("i1.equals(i2) : "+i1.equals(i2));		// 기본적으로 내용 비교
		System.out.println("i1.toString()" + i1.toString());
		System.out.println("MAX_VALUE : " + Integer.MAX_VALUE);
		System.out.println("MIN_VALUE : " + Integer.MIN_VALUE);
		
		int pi = i1.intValue();		// JDK 5.0 이전
		pi = i1;								// JDK 5.0 이후 (auto-UnBoxing)
		
		pi = Integer.parseInt("123");
		System.out.println(pi);
		
		double pd = Double.parseDouble("12.3");
		float pf = Float.parseFloat("123.5");
		pi = Integer.parseInt("FF",16);
	}
}
//i1 == i2 ?false
//i1.equals(i2) : true
//i1.toString()100
//MAX_VALUE : 2147483647
//MIN_VALUE : -2147483648
//123
