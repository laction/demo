package p150324_Chapter02;
// 형변환 예제
// 형변환 연산자 : (자료형)
public class Ex02_01_CastingEx1 {
	public static void main(String[] args){
		/*
		 * byte (1), short(2), int(4), long(8), float(4), double(8)
		 *  <=  : 형변환 연산자 반드시 기술
		 *   => : 형변환 연산자 생략 가능
		 * */
		byte b1 = 10;
		int i1 = b1 ; 			// 형변환 연산자 생략가능
		byte b2 = (byte) i1;	// 형변환 연산자 생략불가
		b1 = (byte) 300;
		System.out.println(b1);		
	}
}
