package p150406_Chapter08;
// ����ó���� �����ص� �Ǵ� MyException �����
// RuntimeException�� ��ӹ����� ����ó�� ���� ������.
public class Ex08_09_ExceptionEx9 {	
	public static void main(String[] args) throws MyException {
		method1();
	}
	private static void method1(){
		throw new MyException();
	}
			// RuntimeException�� ��ӹ�����, try catch ���� ���� �ʰ�, ��� ����.
	public static class MyException extends RuntimeException{
		// MyException(){ super();} // �����Ǿ� ����.
	}
}
