package p150403_Chapter07;

/* 인터페이스를 통해, 인터페이스를 상속받은 클래스의 메서드를 인터페이스 참조변수로 호출할 수 있다.
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
		@Override public void play() {		System.out.println("play B 클래스");	}
	}
	public static class C implements I {
		@Override public void play() {		System.out.println("play C 클래스");	}
	}
}
//play B 클래스
//play C 클래스
