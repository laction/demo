package p150408_Chapter09;
// StringBuffer ����
//JDK 5.0 ���Ŀ� StringBuilder Ŭ������ ���� ����
//StringBuffer��  StringBuilder�� �޼��尡 ����. 
//StringBuffer  	: ��� �޼��尡 �����忡 ����ȭ �Ǿ��ִ�.
//StringBuilder  	: ��� �޼��尡 �����忡 ����ȭ �Ǿ����� �ʴ�.
public class Ex09_08_StringBufferEx2 {
	public static void main(String[] args) {
		StringBuffer sb= new StringBuffer();
		sb.append("abc").append(123).append(true);
		System.out.println(sb);
		sb.delete(1, 3);
		System.out.println(sb);
		sb.deleteCharAt(4);
		System.out.println(sb);
		sb.insert(5,"@@");
		System.out.println(sb);
		sb.insert(6,7.89);
		System.out.println(sb);
		
		sb = new StringBuffer("ABCDEFG");
		sb.replace(0, 3, "abc");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
	}	
}
//abc123true
//a123true
//a123rue
//a123r@@ue
//a123r@7.89@ue
//abcDEFG
//GFEDcba
