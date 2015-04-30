package p150408_Chapter10;
/* 내부클래스.
 *    1. 클래스 내부에 존재하는 클래스
 *    2. 참조자료형, 객체화 가능
 *    3. 멤버(변수,메서드,생성자,Object를 상속)도 소유 가능
 *    4. 상속도 가능
 *    5. 외부클래스의 멤버, 외부클래스의 private 멤버에 접근 가능.
 * */
public class Ex10_01_InnerEx1 {	
	public static void main(String[] args) {
		
		Ex10_01_InnerEx1 in = new Ex10_01_InnerEx1();
		in.myMethod();
		System.out.println(InstanceInner.MAX);
		System.out.println(StaticInner.cv);
	}
	
	// 인스턴스 내부 클래스 : 상수(final static) 이외의 static 멤버를 가질 수 없다.
	class InstanceInner{
		int iv = 100;
		final static int MAX = 100;
	}
	// static 내부 클래스 
	static class StaticInner{
		int iv = 200;
		static int cv;
	}

	void myMethod(){
		// 지역내부클래스 : 메서드 내에서 선언된 클래스. static 멤버를 가질 수 없다.
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
