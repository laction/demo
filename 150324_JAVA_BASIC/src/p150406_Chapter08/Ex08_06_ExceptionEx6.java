package p150406_Chapter08;
// throws : ����ó���� ȣ���ڿ��� �����ش�.
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
			throw new Exception("throws�� ����ó�� �ؾ� �Ѵ�");
	}
}
