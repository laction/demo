package p150409_Chapter10;

public class Ex10_03_InnerEx3 {
	private int outerIv = 0;
	static int outerCv = 0 ;
	class instanceInner{
		int ilv = outerIv;
		int ilv2 = outerCv;
	}
	static class StaticInner {
	//	int siv = outerIv;	// ������ ����. �ν��Ͻ� ����̱� ������ ��üȭ�� �ʿ�.
		int siv = new Ex10_03_InnerEx3().outerIv;
		static int scv = outerCv;
	}
	void myMethod(){
		int lv = 0;
		final int LV = 0 ;
		class LocalInner extends StaticInner{			
			int liv = outerIv;
			int liv2 = outerCv;
			int liv3 = lv;				// JDK 8.0 ���� ���� ��밡��. �ڵ����� ���ȭ.
												// JDK 7.0 �������� ��������Ŭ�������� ���� �޼����� ���������� ȣ������ ���ߴ�. ���� ����� ����.
			int liv4 = LV;			
		}		
	}
}
//300
//100
//100
//0
