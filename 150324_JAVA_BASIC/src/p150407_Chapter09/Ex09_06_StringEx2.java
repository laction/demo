package p150407_Chapter09;
/* String 클래스의 메서드 연습
 * */
public class Ex09_06_StringEx2 {
	public static void main(String[] args) {
		
		System.out.println("ABCDEFGH".charAt(4));		// charAt(4) : 4번 인덱스의 문자를 리턴

		System.out.println("ABCDEFGH".compareTo("abc"));		// compareTo() : 나의 문자 - 상대문자의 차를 리턴

		System.out.println("ABCDEFGH".compareToIgnoreCase("abcdefgh")); // compareToIgnoreCase() : 대소문자 구별없이 compareTo()
																			
		System.out.println("ABCDEFGH".concat("abc"));// concat() : s + "abc" 두문자를 연결해 주는 메서드
							
		System.out.println("ABCDEFGH".endsWith("FGH"));	// endWith() : 끝이 FGH인지를 확인.
						
		System.out.println("ABCDEFGH".equals("ABCDEFGH"));		// equals() : 내용을 비교. 같으면 true;
					
		System.out.println("ABCDEFGH".equalsIgnoreCase("abcdefgh"));		// equalsIgnoreCase() : 대소문자 구분없이 equals()
		
		
		System.out.println("This is a String".indexOf('i'));	// 문자를 찾고 위치값을 반환
		
		System.out.println("This is a String".indexOf("is"));	// 문자열을 찾고 위치값을 반환
		
		System.out.println("This is a String".indexOf('i',7));	// 문자열을 7번째 문자부터 찾고 위치값을 반환
		
		System.out.println("This is a String".indexOf("This",1));	// 문자열이 존재하지 않으면 -1을 반환.
		
		System.out.println("This is a String".lastIndexOf("is"));	// 문자를 뒤에서부터 찾고 앞 기준의 위치값을 반환.
		
		System.out.println("This is a String".length());		// 문자열의 길이를 반환
		
		System.out.println("This is a String".replace('i', 'Q'));		// 문자를 치환
		
		System.out.println("This is a String".replace("is", "IS"));		// 문자열을 치환
		
		System.out.println("This is a String".replaceAll("is", "IS"));		// 문자열을 치환
		
		System.out.println("This is a String".startsWith("This"));		// 문자열의 시작을 비교. 같으면 true.
		
		System.out.println("This is a String".substring(5));		// 5번부터의 문자열을 반환
		
		System.out.println("This is a String".substring(5,13));		// 5번부터 12번까지 문자열을 반환
		
		System.out.println("This is a String".toLowerCase());	// 모두 소문자로
		
		System.out.println("This is a String".toUpperCase());	// 모두 대문자로
		
		String [] tokens = "a,b,c,d,e,f,g,h".split(",");			// String을 특정문자열을 기준으로 String []로 치환
		for(String str: tokens) System.out.println(str);
		
		System.out.println("     a   b   c     ".trim());		// 좌우 공백을 지움.
		
		System.out.println(String.valueOf(true) + 123);		// String으로 바꿔줌.
		System.out.println(true + "123");
		
		System.out.println(Integer.parseInt("123")+5);		// Wrapper 클래스로. 인스턴스로 기본형 연산이 가능.
		System.out.println(Float.parseFloat("12.3")+10);	
		
							// JDK 5.0 이후 버전
		System.out.println(String.format("%010.2f",12.3456));	// format() : 형식 지정 문자. 10칸을 확보하고 남는 칸은 0으로 채움. 소수점 2째 자리까지 반올림.	
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

