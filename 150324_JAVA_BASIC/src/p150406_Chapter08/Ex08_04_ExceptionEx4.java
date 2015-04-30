package p150406_Chapter08;
/* throw : 예외 발생
 * try 구문은 예외처리(제거) 기능, throw 예외 발생시키는 기능을 가짐.
 *  */
public class Ex08_04_ExceptionEx4 {
	public static void main(String[] args) {
		try {
			// 예외객체 생성
			Exception e = new Exception ("고의로 예외발생");
			// throw e 객체를 예외 발생, JVM 통지.
			throw e;
		} catch (Exception e){
			System.out.println( "에러메시지 : " + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("프로그램 정상 종료");
	}
}
//에러메시지 : 고의로 예외발생
//프로그램 정상 종료
//java.lang.Exception: 고의로 예외발생
//	at p150406_Chapter08.Ex08_04_ExceptionEx4.main(Ex08_04_ExceptionEx4.java:7)
