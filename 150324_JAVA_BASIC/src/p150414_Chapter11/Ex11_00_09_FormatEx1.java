package p150414_Chapter11;

import java.text.DecimalFormat;
/* DecimalFormat 예제
 * format(Number) : 숫자를 지정된 포맷형태로 변경 리턴
 * parse(String) : 입력된 문자열을 지정된 포맷에 맞도록 숫자변경하여 리턴.
 * */
public class Ex11_00_09_FormatEx1 {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#,###.##");
		DecimalFormat df2 = new DecimalFormat("#.###E0");
		try {
			Number num = df.parse("1 234 567 89");
			System.out.print("1 234 567 89" + "->");
			double d = num.doubleValue();
			System.out.print(d + " -> ");
			System.out.println(df2.format(num));
		}catch(Exception e ){}
	}
}
//1 234 567 89->1.0 -> 1E0
