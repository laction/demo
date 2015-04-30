// 변수 예제
// 식별자 약속 : 
// 1. 클래스 : 대문자로 시작. 의미구분이 될 때마다 첫단어는 대문자
//			ex : JavaTest
// 2. 변수와 메서드 : 소문자 시작
//				두단어의 합성인 경우 두번째 단어의 첫자 대문자
//			ex : setNumber
// 3. 상숭 : 모든 문자를 대문자로
//		합성단어인 경우 _로 연결하자
//			ex : MAX_NUMBER
// 식별자 규정
// 영문자와 숫자 특수문자중($,_)만 사용가능
// 숫자로는 시작할 수 없다.
// ex : top10 ( o ) , _id ( o )
//       7up ( x )
// 2. 대소문자를 구분한다.
// ex : if ( x ) : 예약어임
//        If ( o ) : 예약어가 아님.

package p150324_Chapter02;

public class Ex02_04_VarEx1 {

	public static void main(String[] args) {
		// 변수의 선언 : 메모리 할당
		// 자료형 변수명 ; 
		// 자료형이란 : 변수를 종류를 지정하는 형태
				
		boolean b = true;
		b = false ; 
		int i =100;
		i = 'A' ; 
		System.out.println(i);  // 65
		System.out.println(b); // false
		
		byte b2 = 10;
		// b2 = 300; // 오버플로우 에러
		
		// float f = 1.1 ; // !!! 에러 :  일반적인 실수형은 double로 인식. 1.1f와 같이 실수에 f를 붙혀서 float형으로 표현 가능
		float 	f = 1.1f;
					f = (float)1.1; // 실수형 리터럴은 자료형이 double
				
					/* 접미사 : 대소문자 구분 없음
					 * l L : long형 리터럴
					 * f F : float형 리터럴
					 * d D : double형 리터럴 (기본형)
					 * */
			String Lee = "SuperMario" ;
			
			System.out.println(Lee);
	}
}
