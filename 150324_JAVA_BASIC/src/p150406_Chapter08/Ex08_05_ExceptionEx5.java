package p150406_Chapter08;
/* 자바에서 예외처리는 필수이다. 단지, 생략 될 수 있는 부분도 있다.
 * */
public class Ex08_05_ExceptionEx5 {
	public static void main(String[] args) {
		//throw new Exception("예외 고의 발생");					// try catch문이 무조건 필요하다.
		throw new RuntimeException("예외 고의 발생");	// try catch문을 생략할 수 있다.
	}
}
// Exception in thread "main" java.lang.RuntimeException: 예외 고의 발생
// at p150406_Chapter08.Ex08_05_ExceptionEx5.main(Ex08_05_ExceptionEx5.java:7)