package p150408_Chapter09;
/* StringBuffer Ŭ���� ����
 * �������� ���ڿ� ��ü��
 * �⺻������ 16���� ���۸� ���ο� ������ �ִ�.
 * new StringBuffer(100) => 116���� ���۸� ������.
 * ��ü�� 8K ������ ���ۿ뷮�� �����ϴٰ� ��.
 * 
 * equals �޼��尡 �������̵� ���� �ʾҴ�.
 * 	=> ����񱳴� toString �޼���� String ��ü�� ���� �� equals �޼��带 ����ؾ� ��.
 * */
public class Ex09_07_StringBufferEx1 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("abc");
		StringBuffer sb2 = new StringBuffer("abc");
		
		if(sb == sb2)	System.out.println("sb == sb2");
					else		System.out.println("sb != sb2");
		
		System.out.println("sb.equals(sb2) : " + sb.equals(sb2));
		System.out.println(	"sb.toString().equals(sb2.toString()) : "
										+		  sb.toString().equals(sb2.toString()));		
	}
}
//sb != sb2
//sb.equals(sb2) : false
//sb.toString().equals(sb2.toString()) : true

