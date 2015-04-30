package p150325_Chapter04;
/* switch 구문 예제
 *  switch ( 조건값 ) { case 값 1 : 문장1  case 값2 : 문장2 .... default : 문장 n }
 *  break : 해당 switch 구문을 빠진다.
 *  조건값으로 사용이 가능한 자료형은   byte, short, int, char, String(jdk 7.0 이후)
 *	 모든 switch문을 if else문으로 변경 가능. 모든 if문을 switch 구문으로는 변경할 수 없다.  
 * */
public class Ex04_02_SwitchEx1 {
	public static void main(String[] args) {
		int score = 100;		
		switch( score / 10 ){
			case 10:
			case 9 :		System.out.println("A학점");	break;
			case 8 :		System.out.println("B학점");	break;
			case 7 :		System.out.println("C학점");	break;
			case 6 :		System.out.println("D학점");	break;
			default :		System.out.println("F학점");	break;
		}		
	}
}
//A학점
