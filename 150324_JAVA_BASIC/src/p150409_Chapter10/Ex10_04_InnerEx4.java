package p150409_Chapter10;
class Outer {
	int iv = 10;
	class InstanceInner {
		int iv = 100;
		void method1(){
			System.out.println("iv = "+iv);
			System.out.println("this.iv = "+this.iv);		// �ڽ��� ���� ���

			System.out.println("Outer.this.iv = " + Outer.this.iv);	// Outer.this.iv : �ܺ�Ŭ������ ����� ����
		}
	}
	static class StaticInner{
		int iv = 200; 
		static int cv = 300;
	}
	void myMethod(){
		class LocalInner {			int iv = 400;		}
		LocalInner linner = new LocalInner();
		System.out.println(linner.iv);
	}
}
public class Ex10_04_InnerEx4 {
	public static void main(String[] args) {
		Outer oc = new Outer();
		Outer.InstanceInner ii = oc.new InstanceInner();	// ����Ŭ������ Ÿ�� : �ܺ�Ŭ����.����Ŭ����
		System.out.println("ii.iv = " + ii.iv);		
		System.out.println("Outer.StaticInner.cv : " + Outer.StaticInner.cv);	// static ����Ŭ���� ���

		Outer.StaticInner ci = new Outer.StaticInner();		// static ����Ŭ���� �ν��Ͻ� ��� => ��äȸ �ʿ�
		System.out.println("ci.iv = " + ci.iv);
		oc.myMethod();
		ii.method1();		
	}
}
//ii.iv = 100
//Outer.StaticInner.cv : 300
//ci.iv = 200
//400
//iv = 100
//this.iv = 100
//Outer.this.iv = 10
