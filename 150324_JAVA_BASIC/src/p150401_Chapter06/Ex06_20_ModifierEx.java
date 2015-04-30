package p150401_Chapter06;
/* ����������. * 
 * private				o						x					x					x
 * (default)			o						o					x					x
 * protected			o						o					o					x
 * public				o						o					o					o
 * 
 * ������ �޼��� : (����������) ��� ��� ���� 
 * Ŭ����				: (default) �� public
 * */
//package _packageTest;
//public class TestClass {
//	public 		void publicMethod(){			System.out.println("public �޼ҵ� ȣ��"); 	}
//						void defaultMethod(){			System.out.println("public �޼ҵ� ȣ��"); 	}
//	protected	void protectedMethod(){		System.out.println("public �޼ҵ� ȣ��"); 	}
//	private 		void privateMethod(){			System.out.println("public �޼ҵ� ȣ��"); 	}
//}
class Data{
	private	int a = 100;
					int b = 200;		// default ����������. ���� ��Ű�������� ���ٰ���.
	 protected int c = 300;
	public int d = 400;
	void showData(){
		System.out.println(
				a + "," + b + "," + c + "," + d);
	}
	static void showA(){
		//		System.out.println(a);	// ����. �ν��Ͻ� ����� �޸� �Ҵ��� ��� ����.
		Data d3 = new Data();			
		System.out.println(d3.a);		//	���� Ŭ������ ���ο� �ν��Ͻ� Ŭ������ private ����� ���� ����.		
	}
}
public class Ex06_20_ModifierEx {
	public static void main(String[] args) {
		Data D = new Data();
//		System.out.println(D.a);	// private�̹Ƿ� ���� �Ұ�
		System.out.println(D.b);
		System.out.println(D.c);
		System.out.println(D.d);
		
		new _packageTest.TestClass().publicMethod();				// �ܺ� ��Ű������ public Ŭ������ public ����� ��� ����.
		//		new _packageTest.TestClass().defaultMethod();			
		//		new _packageTest.TestClass().protectedMethod();		
		//		new _packageTest.TestClass().privateMethod();
	}	
}
//200
//300
//400
//public �޼ҵ� ȣ��

