package p150407_Chapter09;
/* String Ŭ���� ����
 * Ŭ���� �� �����ϰ� �Ҵ� �����ڷ� ��ü������ ������ Ŭ����. ( String str = "str;)
 * Ŭ���� �� �����ϰ� + �����ڸ� ����� �� �ִ� Ŭ���� ( str =  str + 1 )
 * String�� ���� ���Ǯ�� ����Ǹ�, ���� ���� ���Ǯ�� �ִٸ�, ���� String�� �����Ѵ�.
 * new String���� �Ҵ��ϸ�, String�� �������� ���� �Ҵ�ȴ�.
 * */
public class Ex09_05_StringEx1 {
	public static void main(String[] args) {
		String str1 = "abc";		// ���Ǯ�� �޸� �Ҵ�
		String str2 = "abc";		// ���� �޸� �˻� �� ���� �� ����.
		str2 = "bcd";
		
		if(str1 == str2)	System.out.println("str1 == str2");
					else 		System.out.println("str1 != str2");
		if(str1.equals(str2))	System.out.println("str1 == str2");
					else 		System.out.println("str1 != str2");
		
		String str3 = new String("abc");	
		String str4 = new String("abc");
		
		if (str3 == str4)	System.out.println("str1 == str2");
						else			System.out.println("str1 != str2");
		if (str3.equals(str4))		System.out.println("str1 == str2");
							else					System.out.println("str1 != str2");
		
		String str5 = String.valueOf(100);
		System.out.println(str5);
		str5 = str5 + 100;
		System.out.println(str5);
		}	
}
//str1 != str2
//str1 != str2
//str1 != str2
//str1 == str2
//100
//100100
