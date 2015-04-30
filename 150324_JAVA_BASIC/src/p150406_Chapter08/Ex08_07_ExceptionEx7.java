package p150406_Chapter08;
//throw : 예외를 발생시킨다.
// throws : 예외를 호출자에게 던져준다.

public class Ex08_07_ExceptionEx7 {
	public static void main(String[] args) throws Exception{
		try{
			method1();
		}catch (Exception e){
			System.out.println("main에서 예외처리");
		}
	}
	private static void method1() throws Exception{
		// TODO Auto-generated method stub
		try{
			method2();
		}catch(Exception e){
			System.out.println("method1에서 예외처리");
			throw e;					// Exception을 던진다
		}
	}
	private static void method2() throws Exception{
		// TODO Auto-generated method stub
			try {
				throw new Exception("throws로 예외처리 해야 한다");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("method2에서 예외처리");
				throw e;				// Exception을 던진다
			}
	}
}
