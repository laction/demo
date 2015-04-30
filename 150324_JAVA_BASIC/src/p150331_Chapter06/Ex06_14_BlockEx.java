package p150331_Chapter06;
/* 초기화블럭 
 * static 초기화 블럭 : 클래스변수의 초기화 담당
 * 인스턴스 초기화블럭 : 인스턴스변수의 초기화담당
 * 											생성자 호출전에 초기화 필요시 사용.
 * */
public class Ex06_14_BlockEx {
	static int cv;
	static {					// 클래스 변수를 초기화 할때 static 초기화 블럭을 사용.
		cv = (int)(Math.random()*100);
		System.out.println("static 초기화블럭 ");
		System.out.println("cv = "+cv);		
	}
	{
		System.out.println("인스턴스 초기화 블럭");
		System.out.println("생성자 보다 먼저 호출됨");
	}	
	public Ex06_14_BlockEx() {
		System.out.println("생성자");
	}
	public void testF(){}
	public static void main(String[] args) {
		System.out.println("main 메서드 시작");
		Ex06_14_BlockEx b = new Ex06_14_BlockEx();
		System.out.println("b 객체생성 완료");
		Ex06_14_BlockEx b2 = new Ex06_14_BlockEx();
		System.out.println("b2 객체생성 완료");
		System.out.println("main 메서드 종료");		
	}
}
//static 초기화블럭 
//cv = 15
//main 메서드 시작
//인스턴스 초기화 블럭
//생성자 보다 먼저 호출됨
//생성자
//b 객체생성 완료
//인스턴스 초기화 블럭
//생성자 보다 먼저 호출됨
//생성자
//b2 객체생성 완료
//main 메서드 종료
