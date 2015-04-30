package p150409_Chapter10;

public class Ex10_02_InnerEx2 {
	
	InstanceInner iv = new InstanceInner();	// �ν��Ͻ� Ŭ������ ��ٷ� ������ �����ϴ�.
	
	static void staticMethod(){										// static �޼��忡��
		StaticInner obj = new StaticInner();					// static Ŭ������ ��밡���ϴ�.
	//	InstanceInner obj2 = new InstanceInner();		// ������ ����. static �Լ������� static Ŭ������ ����ؾ� �Ѵ�.
		Ex10_02_InnerEx2 outer = new Ex10_02_InnerEx2();
		InstanceInner obj2 = outer.new InstanceInner();	// �ܺ�Ŭ������ ��üȭ ���� ��� ����.		
	}
	void instanceMethod(){									// �ν��Ͻ� �޼��忡��
		StaticInner obj = new StaticInner();			// static Ŭ����, �ν��Ͻ� Ŭ���� ��� ��� �����ϴ�.
		InstanceInner obj2 = new InstanceInner();
		System.out.println(StaticInner.class + "\n    staticŬ����. �ܺ�Ŭ�������� ���踦 �˼� �ִ�,");
		System.out.println(InstanceInner.class + "\n    �ν��Ͻ�Ŭ����.");
	//	LocalInner lv = new LocalInner();				// �ٸ� ������ �޼���� ��� �Ұ����ϴ�.
	}
	void myMethod(){
		class LocalInner{	}											
		LocalInner lv = new LocalInner();
		System.out.println(LocalInner.class + "\n    ����Ŭ����. �޼��庰�� �����̸��� ����Ŭ������ �������� ���� �̸��տ� ���ڰ� �ٴ´�.");
	}
	
	public static void main(String[] args) {
		new Ex10_02_InnerEx2().instanceMethod();
		new Ex10_02_InnerEx2().myMethod();
		
	}
	
	class InstanceInner{}
	static class StaticInner{}	
}
//class p150409_Chapter10.Ex10_02_InnerEx2$StaticInner
//staticŬ����. �ܺ�Ŭ�������� ���踦 �˼� �ִ�,
//class p150409_Chapter10.Ex10_02_InnerEx2$InstanceInner
//�ν��Ͻ�Ŭ����.
//class p150409_Chapter10.Ex10_02_InnerEx2$1LocalInner
//����Ŭ����. �޼��庰�� �����̸��� ����Ŭ������ �������� ���� �̸��տ� ���ڰ� �ٴ´�.
