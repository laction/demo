package p150403_Chapter07;

/* �������̽��� ����, �������̽��� ��ӹ��� Ŭ������ �޼��带 �������̽� ���������� ȣ���� �� �ִ�.
 * */

public class Ex07_17_InterfaceEx {
	public static void main(String[] args) {
		A a = new A();
		a.autoPlay(new B());
		a.autoPlay(new C());
	}	
	public static interface I{
		void play();
	}
	public static class A {
		public void autoPlay(I i){		i.play();	}	
	}
	public static class B implements I {
		@Override public void play() {		System.out.println("play B Ŭ����");	}
	}
	public static class C implements I {
		@Override public void play() {		System.out.println("play C Ŭ����");	}
	}
}
//play B Ŭ����
//play C Ŭ����
