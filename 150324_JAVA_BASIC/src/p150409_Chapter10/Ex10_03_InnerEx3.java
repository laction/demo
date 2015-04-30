package p150409_Chapter10;

public class Ex10_03_InnerEx3 {
	private int outerIv = 0;
	static int outerCv = 0 ;
	class instanceInner{
		int ilv = outerIv;
		int ilv2 = outerCv;
	}
	static class StaticInner {
	//	int siv = outerIv;	// 컴파일 에러. 인스턴스 멤버이기 때문에 객체화가 필요.
		int siv = new Ex10_03_InnerEx3().outerIv;
		static int scv = outerCv;
	}
	void myMethod(){
		int lv = 0;
		final int LV = 0 ;
		class LocalInner extends StaticInner{			
			int liv = outerIv;
			int liv2 = outerCv;
			int liv3 = lv;				// JDK 8.0 이후 부터 사용가능. 자동으로 상수화.
												// JDK 7.0 이전에서 지역내부클래스에서 상위 메서드의 지역변수를 호출하지 못했다. 오직 상수만 가능.
			int liv4 = LV;			
		}		
	}
}
//300
//100
//100
//0
