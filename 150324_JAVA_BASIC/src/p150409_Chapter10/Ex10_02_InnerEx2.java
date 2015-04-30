package p150409_Chapter10;

public class Ex10_02_InnerEx2 {
	
	InstanceInner iv = new InstanceInner();	// 인스턴스 클래스는 곧바로 대입이 가능하다.
	
	static void staticMethod(){										// static 메서드에서
		StaticInner obj = new StaticInner();					// static 클래스는 사용가능하다.
	//	InstanceInner obj2 = new InstanceInner();		// 컴파일 에러. static 함수에서는 static 클래스를 사용해야 한다.
		Ex10_02_InnerEx2 outer = new Ex10_02_InnerEx2();
		InstanceInner obj2 = outer.new InstanceInner();	// 외부클래스를 객체화 시켜 사용 가능.		
	}
	void instanceMethod(){									// 인스턴스 메서드에서
		StaticInner obj = new StaticInner();			// static 클래스, 인스턴스 클래스 모두 사용 가능하다.
		InstanceInner obj2 = new InstanceInner();
		System.out.println(StaticInner.class + "\n    static클래스. 외부클래스와의 관계를 알수 있다,");
		System.out.println(InstanceInner.class + "\n    인스턴스클래스.");
	//	LocalInner lv = new LocalInner();				// 다른 지역의 메서드는 사용 불가능하다.
	}
	void myMethod(){
		class LocalInner{	}											
		LocalInner lv = new LocalInner();
		System.out.println(LocalInner.class + "\n    내부클래스. 메서드별로 동일이름의 로컬클래스를 구분짓기 위해 이름앞에 숫자가 붙는다.");
	}
	
	public static void main(String[] args) {
		new Ex10_02_InnerEx2().instanceMethod();
		new Ex10_02_InnerEx2().myMethod();
		
	}
	
	class InstanceInner{}
	static class StaticInner{}	
}
//class p150409_Chapter10.Ex10_02_InnerEx2$StaticInner
//static클래스. 외부클래스와의 관계를 알수 있다,
//class p150409_Chapter10.Ex10_02_InnerEx2$InstanceInner
//인스턴스클래스.
//class p150409_Chapter10.Ex10_02_InnerEx2$1LocalInner
//내부클래스. 메서드별로 동일이름의 로컬클래스를 구분짓기 위해 이름앞에 숫자가 붙는다.
