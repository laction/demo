package p150406_Chapter08;
//throw : ���ܸ� �߻���Ų��.
// throws : ���ܸ� ȣ���ڿ��� �����ش�.

public class Ex08_07_ExceptionEx7 {
	public static void main(String[] args) throws Exception{
		try{
			method1();
		}catch (Exception e){
			System.out.println("main���� ����ó��");
		}
	}
	private static void method1() throws Exception{
		// TODO Auto-generated method stub
		try{
			method2();
		}catch(Exception e){
			System.out.println("method1���� ����ó��");
			throw e;					// Exception�� ������
		}
	}
	private static void method2() throws Exception{
		// TODO Auto-generated method stub
			try {
				throw new Exception("throws�� ����ó�� �ؾ� �Ѵ�");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("method2���� ����ó��");
				throw e;				// Exception�� ������
			}
	}
}
