package p150407_Chapter09;
/* String 클래스 예제
 * 클래스 중 유일하게 할당 연산자로 객체생성이 가능한 클래스. ( String str = "str;)
 * 클래스 중 유일하게 + 연산자를 사용할 수 있는 클래스 ( str =  str + 1 )
 * String의 값은 상수풀에 저장되며, 같은 값이 상수풀에 있다면, 같은 String을 참조한다.
 * new String으로 할당하면, String은 힙영역에 새로 할당된다.
 * */
public class Ex09_05_StringEx1 {
	public static void main(String[] args) {
		String str1 = "abc";		// 상수풀에 메모리 할당
		String str2 = "abc";		// 기존 메모리 검색 후 같은 값 참조.
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
