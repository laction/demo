package p150406_Chapter08;
/* Exception : 예외의 최상단 클래스. 모든 예외클래스는 Exception을 상속받은 상태.
 * 						모든 예외 클래스는 Exception 참조변수형으로 형변환이 가능하다.
 * 					 catch 구문의 최하단에 존재해야 한다. (알수 없는 예외를 처리하기 위함)
 * catch 구문의 순서는 (자손 -> 부모) 순으로 배치해야 한다.  
 * */

public class Ex08_02_ExceptionEx2 {
	public static void main(String[] args) {		
		for (int Case = 0 ; Case < 3; Case++)
		try {
			if ( Case == 0 ) System.out.println(args[0]);	//  java.lang.ArrayIndexOutOfBoundsException: 0
			if ( Case == 1 ) System.out.println(3/0);			// java.lang.ArithmeticException : / by zero
			if ( Case == 2 ) System.out.println(Integer.parseInt("abc")); // NumberFormatException
		} catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Command 라인에 값이 필요합니다.");
		} catch(ArithmeticException e){
			System.out.println("0으로 나누지 마세요.");
		} catch (NumberFormatException e){
			System.out.println("숫자를 입력하세요.");
		} catch(Exception e){
			System.out.println("알수 없는 에러입니다.");			
		}
	}
}
//Command 라인에 값이 필요합니다.
//0으로 나누지 마세요.
//숫자를 입력하세요.
