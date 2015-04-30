package p150406_Chapter08;
// throws : 예외처리를 호출자에게 던져준다.
public class Ex08_06_ExceptionEx6 {
	public static void main(String[] args) throws Exception{
		method1();
	}
	private static void method1() throws Exception{
		// TODO Auto-generated method stub
		method2();
	}
	private static void method2() throws Exception{
		// TODO Auto-generated method stub
			throw new Exception("throws로 예외처리 해야 한다");
	}
}
