package p150408_Chapter09;
// String Ŭ������ StringVuffer Ŭ���� ��
public class Ex09_09_StringVsStringBuffer {
	public static void main(String[] args) {
		String str = "base";
		System.out.println(str.replace('e', 'k')+"et");
		str += "ball";
		System.out.println(str);
		
		StringBuffer sb= new StringBuffer("base");
		System.out.println(sb.replace(3, 4, "k").append("et"));
		sb.append("ball");
		sb.append(sb);
	}
}
//basket
//baseball
//basket
