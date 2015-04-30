package p150408_Chapter10;
/* ����Ŭ����.
 *    1. Ŭ���� ���ο� �����ϴ� Ŭ����
 *    2. �����ڷ���, ��üȭ ����
 *    3. ���(����,�޼���,������,Object�� ���)�� ���� ����
 *    4. ��ӵ� ����
 *    5. �ܺ�Ŭ������ ���, �ܺ�Ŭ������ private ����� ���� ����.
 * */
public class Ex10_01_InnerEx1 {	
	public static void main(String[] args) {
		
		Ex10_01_InnerEx1 in = new Ex10_01_InnerEx1();
		in.myMethod();
		System.out.println(InstanceInner.MAX);
		System.out.println(StaticInner.cv);
	}
	
	// �ν��Ͻ� ���� Ŭ���� : ���(final static) �̿��� static ����� ���� �� ����.
	class InstanceInner{
		int iv = 100;
		final static int MAX = 100;
	}
	// static ���� Ŭ���� 
	static class StaticInner{
		int iv = 200;
		static int cv;
	}

	void myMethod(){
		// ��������Ŭ���� : �޼��� ������ ����� Ŭ����. static ����� ���� �� ����.
		class LocalInner{
			int iv = 300;
			final static int MAX = 100;
		}
		LocalInner li = new LocalInner();
		System.out.println(li.iv);
		System.out.println(LocalInner.MAX);
	}	
}
//300
//100
//100
//0
