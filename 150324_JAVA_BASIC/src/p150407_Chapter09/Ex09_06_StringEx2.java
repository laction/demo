package p150407_Chapter09;
/* String Ŭ������ �޼��� ����
 * */
public class Ex09_06_StringEx2 {
	public static void main(String[] args) {
		
		System.out.println("ABCDEFGH".charAt(4));		// charAt(4) : 4�� �ε����� ���ڸ� ����

		System.out.println("ABCDEFGH".compareTo("abc"));		// compareTo() : ���� ���� - ��빮���� ���� ����

		System.out.println("ABCDEFGH".compareToIgnoreCase("abcdefgh")); // compareToIgnoreCase() : ��ҹ��� �������� compareTo()
																			
		System.out.println("ABCDEFGH".concat("abc"));// concat() : s + "abc" �ι��ڸ� ������ �ִ� �޼���
							
		System.out.println("ABCDEFGH".endsWith("FGH"));	// endWith() : ���� FGH������ Ȯ��.
						
		System.out.println("ABCDEFGH".equals("ABCDEFGH"));		// equals() : ������ ��. ������ true;
					
		System.out.println("ABCDEFGH".equalsIgnoreCase("abcdefgh"));		// equalsIgnoreCase() : ��ҹ��� ���о��� equals()
		
		
		System.out.println("This is a String".indexOf('i'));	// ���ڸ� ã�� ��ġ���� ��ȯ
		
		System.out.println("This is a String".indexOf("is"));	// ���ڿ��� ã�� ��ġ���� ��ȯ
		
		System.out.println("This is a String".indexOf('i',7));	// ���ڿ��� 7��° ���ں��� ã�� ��ġ���� ��ȯ
		
		System.out.println("This is a String".indexOf("This",1));	// ���ڿ��� �������� ������ -1�� ��ȯ.
		
		System.out.println("This is a String".lastIndexOf("is"));	// ���ڸ� �ڿ������� ã�� �� ������ ��ġ���� ��ȯ.
		
		System.out.println("This is a String".length());		// ���ڿ��� ���̸� ��ȯ
		
		System.out.println("This is a String".replace('i', 'Q'));		// ���ڸ� ġȯ
		
		System.out.println("This is a String".replace("is", "IS"));		// ���ڿ��� ġȯ
		
		System.out.println("This is a String".replaceAll("is", "IS"));		// ���ڿ��� ġȯ
		
		System.out.println("This is a String".startsWith("This"));		// ���ڿ��� ������ ��. ������ true.
		
		System.out.println("This is a String".substring(5));		// 5�������� ���ڿ��� ��ȯ
		
		System.out.println("This is a String".substring(5,13));		// 5������ 12������ ���ڿ��� ��ȯ
		
		System.out.println("This is a String".toLowerCase());	// ��� �ҹ��ڷ�
		
		System.out.println("This is a String".toUpperCase());	// ��� �빮�ڷ�
		
		String [] tokens = "a,b,c,d,e,f,g,h".split(",");			// String�� Ư�����ڿ��� �������� String []�� ġȯ
		for(String str: tokens) System.out.println(str);
		
		System.out.println("     a   b   c     ".trim());		// �¿� ������ ����.
		
		System.out.println(String.valueOf(true) + 123);		// String���� �ٲ���.
		System.out.println(true + "123");
		
		System.out.println(Integer.parseInt("123")+5);		// Wrapper Ŭ������. �ν��Ͻ��� �⺻�� ������ ����.
		System.out.println(Float.parseFloat("12.3")+10);	
		
							// JDK 5.0 ���� ����
		System.out.println(String.format("%010.2f",12.3456));	// format() : ���� ���� ����. 10ĭ�� Ȯ���ϰ� ���� ĭ�� 0���� ä��. �Ҽ��� 2° �ڸ����� �ݿø�.	
		}
}
//E
//-32
//0
//ABCDEFGHabc
//true
//true
//true
//2
//2
//13
//-1
//5
//16
//ThQs Qs a StrQng
//ThIS IS a String
//ThIS IS a String
//true
//is a String
//is a Str
//this is a string
//THIS IS A STRING
//a
//b
//c
//d
//e
//f
//g
//h
//a   b   c
//true123
//true123
//128
//22.3
//0000012.35

