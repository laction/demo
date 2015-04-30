package p150414_Chapter11;

import java.text.DecimalFormat;
/* DecimalFormat ����
 * format(Number) : ���ڸ� ������ �������·� ���� ����
 * parse(String) : �Էµ� ���ڿ��� ������ ���˿� �µ��� ���ں����Ͽ� ����.
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
