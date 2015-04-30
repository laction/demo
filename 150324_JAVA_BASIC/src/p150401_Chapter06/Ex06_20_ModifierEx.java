package p150401_Chapter06;
/* 접근제어자. * 
 * private				o						x					x					x
 * (default)			o						o					x					x
 * protected			o						o					o					x
 * public				o						o					o					o
 * 
 * 변수와 메서드 : (접근제어자) 모두 사용 가능 
 * 클래스				: (default) 와 public
 * */
//package _packageTest;
//public class TestClass {
//	public 		void publicMethod(){			System.out.println("public 메소드 호출"); 	}
//						void defaultMethod(){			System.out.println("public 메소드 호출"); 	}
//	protected	void protectedMethod(){		System.out.println("public 메소드 호출"); 	}
//	private 		void privateMethod(){			System.out.println("public 메소드 호출"); 	}
//}
class Data{
	private	int a = 100;
					int b = 200;		// default 접근제어자. 같은 패키지에서만 접근가능.
	 protected int c = 300;
	public int d = 400;
	void showData(){
		System.out.println(
				a + "," + b + "," + c + "," + d);
	}
	static void showA(){
		//		System.out.println(a);	// 에러. 인스턴스 멤버는 메모리 할당후 사용 가능.
		Data d3 = new Data();			
		System.out.println(d3.a);		//	동일 클래스는 새로운 인스턴스 클래스의 private 멤버라도 접근 가능.		
	}
}
public class Ex06_20_ModifierEx {
	public static void main(String[] args) {
		Data D = new Data();
//		System.out.println(D.a);	// private이므로 접근 불가
		System.out.println(D.b);
		System.out.println(D.c);
		System.out.println(D.d);
		
		new _packageTest.TestClass().publicMethod();				// 외부 패키지에서 public 클래스의 public 멤버만 사용 가능.
		//		new _packageTest.TestClass().defaultMethod();			
		//		new _packageTest.TestClass().protectedMethod();		
		//		new _packageTest.TestClass().privateMethod();
	}	
}
//200
//300
//400
//public 메소드 호출

