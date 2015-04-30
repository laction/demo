package p150330_Chapter06;
//	클래스 멤버와 인스턴스 멤버.
// 클래스 멤버는 클래스 멤버를, 인스턴스 멤버는 인스턴스 멤버를 호출할 수 있다.
// 클래스 멤버를 -(객체화)-> 인스턴스 멤버가  => 불가
//  클래스 멤버가 <-(호출)--  인스턴스 멤버를 => 가능
// 클래스멤버는 클래스 정보 로드시 메모리를 할당 받음
// 인스턴스멤버는 객체화시 메모리를 할당 받음.

class Math2{
	long a,b;		// 인스턴스 변수
	long add(){return a+b;}		// 인스턴스 메서드
	static long add(long a,long b){			// 클래스 매서드
			// a,b : 매개변수 a,b 의미
		return a+b;	
	}	
}
public class Ex06_10_MemberCall {
	public static void call(){}
	public static void main(String[] args) {
		//	this.call()		//	에러. 클래스메서드는 클래스명을 써서 호출해야 한다.		
		System.out.println(Math2.add(1000L, 200L));		
		Math2 math = new Math2();		// 객체화
		math.a = 10;
		math.b = 20;
		System.out.println(math.add());		
	}
	int iv = 10;
	static int cv = 20;
	int iv2 = iv;
		// 클래스변수인 cv2가 iv변수 호출 없다.
		// static int cv2 = iv; // error
	static int cv2 = new Ex06_10_MemberCall().iv;
	static void  staticMethod1(){
		System.out.println(cv);
			//staticMethod1 메서드가 인스턴스 멤버인 iv 호출 불가
		System.out.println(new Ex06_10_MemberCall().iv);		// 인스턴스 
	}	
	void instanceMethod1(){
		System.out.println(cv);
		System.out.println(iv);
	}	
}
//1200
//30

