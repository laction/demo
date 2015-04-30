package p150407_Chapter09;
/* �ؽ��ڵ�� ��ü�� �����ϴ� ������ ��
 * �ΰ�ü�� �ؽ��ڵ尪�� �ٸ����� �ΰ�ü�� ���� �ٸ� ��ü��.
 * hashCode()�޼���� ������ ������ ���� ���� �������� �������̵��� �����ϴ�.
 *  = > Collection���� �ٽ� ����.
 *  
 *  ��ü�� ������ �������� �Ǵ��ϴ� ������ �Ǵ� �޼��尡 equals()�޼���� hashCode() �޼��带 ���.
 */
public class Ex09_03_HashCodeEx {
	public static void main(String[] args) {
		String str1 = new String ("abc");
		String str2 = new String ("abc");
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println("---- ���� ���ڿ��μ�, ���ͷ� Ǯ�� ���� ��ü�� ����----");
		
		if(str1 == str2) System.out.println("str1 == str2");
				else				System.out.println("str1 != str2");		
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println("---- �������� ��ü�� �ؽ��ڵ�� �ٸ���. ----");
	}
}
//96354
//96354
//---- ���� ���ڿ��μ�, ���ͷ� Ǯ�� ���� ��ü�� ����----
//str1 != str2
//31168322
//17225372
//---- �������� ��ü�� �ؽ��ڵ�� �ٸ���. ----
