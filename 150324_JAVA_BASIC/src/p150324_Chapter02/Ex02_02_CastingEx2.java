package p150324_Chapter02;

//  형변환 예제 2
// String 클래스
// 1. 유일하게 = 연산자로 객체 생성 가능 클래스
// 2. + 연산자 사용가능
// 3. String = String + 기본형

public class Ex02_02_CastingEx2 {

	
	public static void main(String[] args) {
		System.out.println("번호 : " + 1 + 2 + 3);
		System.out.println(1 + 2 + 3 + "번" );
		
		byte b1 = 10;
		byte b2 = 10;
		byte b3 = (byte)(b1 + b2);
		System.out.println(b3);
		Character ch = 'J';
		
		System.out.println(ch.toString() + "ava");
		
		char a = ' ';
		
		System.out.println(b1+b2);		
	}

}
