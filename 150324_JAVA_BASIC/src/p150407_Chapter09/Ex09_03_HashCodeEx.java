package p150407_Chapter09;
/* 해쉬코드란 객체를 구별하는 고유의 값
 * 두객체의 해쉬코드값이 다른경우는 두객체는 서로 다른 객체다.
 * hashCode()메서드는 내용이 같으면 같은 값이 나오도록 오버라이딩이 가능하다.
 *  = > Collection에서 다시 설명.
 *  
 *  객체의 내용이 같은지를 판단하는 기준이 되는 메서드가 equals()메서드와 hashCode() 메서드를 사용.
 */
public class Ex09_03_HashCodeEx {
	public static void main(String[] args) {
		String str1 = new String ("abc");
		String str2 = new String ("abc");
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println("---- 동일 문자열로서, 리터럴 풀의 같은 객체를 참조----");
		
		if(str1 == str2) System.out.println("str1 == str2");
				else				System.out.println("str1 != str2");		
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println("---- 참조변수 자체의 해쉬코드는 다르다. ----");
	}
}
//96354
//96354
//---- 동일 문자열로서, 리터럴 풀의 같은 객체를 참조----
//str1 != str2
//31168322
//17225372
//---- 참조변수 자체의 해쉬코드는 다르다. ----
