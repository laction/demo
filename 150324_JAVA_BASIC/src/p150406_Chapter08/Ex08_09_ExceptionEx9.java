package p150406_Chapter08;
// 예외처리를 생략해도 되는 MyException 만들기
// RuntimeException을 상속받으면 예외처리 생략 가능함.
public class Ex08_09_ExceptionEx9 {	
	public static void main(String[] args) throws MyException {
		method1();
	}
	private static void method1(){
		throw new MyException();
	}
			// RuntimeException을 상속받으면, try catch 문을 쓰지 않고도, 사용 가능.
	public static class MyException extends RuntimeException{
		// MyException(){ super();} // 생략되어 있음.
	}
}
