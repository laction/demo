package p150325_Chapter04;
// 조건문 if 예제
// if(조건식) { 문장 } else { 문장 }
// 조건식의 결과가 참인경우만 문장이 실행.
public class Ex04_01_IfEx1 {
	public static void main(String[] args) {
		int score = 65;
		if ( score >= 60 ) { 
			System.out.println("합격을 축하합니다.");
		}else { // 그렇지 않으면
			System.out.println("불합격 ! 다음기회에...");
		}
		System.out.println( (score>=0)?"양수":"음수" );
		if(score >= 0)	System.out.println("양수");
		else						System.out.println("음수");
		
					if(score >= 90){	System.out.println("A학점");
		}else 	if(score >= 80){	System.out.println("B학점");
		}else 	if(score >= 70){	System.out.println("C학점");
		}else 	if(score >= 60){	System.out.println("D학점");
		}else {									System.out.println("F학점");		}
					
		System.out.println("----------1---------");
		
		// 문자가 대문자면 대문자출력, 소문자면 소문자로 출력하기.
		// 숫자면 숫자로 출력. 그외 문자는 일반문자로 출력하기.					
		char 문자 = 'C';										System.out.println(문자);		
				
				if( 'a' <= 문자 && 문자 <='z')		System.out.println("소문자");
		else if( 'A' <= 문자 && 문자 <='Z') 	System.out.println("대문자");
		else if( '0' <= 문자 && 문자 <='9') 	System.out.println("숫자");
		else															System.out.println("일반문자");		
	}
}
//합격을 축하합니다.
//양수
//양수
//D학점
//----------1---------
//C
//대문자
