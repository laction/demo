package p150403_Chapter07;
/* final 예제.
 * final : 마지막, 변경불가의 의미
 * 
 * final class			(종단클래스) 
 * 		상속불가 클래스.
 * 		다른 클래스의 부모클래스가 될 수 없다.
 * 		String 클래스
 * 		Math 클래스
 * 
 * final method	(종단메서드)	: (재정의)오버라이딩 불가.
 * 
 * final value 		(상수)				: 최초의 초기화만 가능. 
 * */
public class Ex07_18_FinalEx {
	public static final 	class FinalClass{	}
	public static 				class FinalMethodClass{
		final void finalMethod(){			System.out.println("오버라이딩 불가");		}
	}
	public static class SubClass
		//	extends FinalClass							// 컴파일 에러. final 클래스는 상속받을수 없다.
			extends FinalMethodClass
	{
		//@Override		void finalMethod(){}		// 컴파일 에러. final 메서드는 오버라이드 할 수 없다.
		
		final int finalVal1 = 100;
		final int finalVal2;	{	finalVal2 = 200;		}	// final 변수는 최초 초기화만 가능.
	}	
}
