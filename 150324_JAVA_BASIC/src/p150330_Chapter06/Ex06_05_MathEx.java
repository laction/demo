package p150330_Chapter06;
// 메서드 호출 예제
/* 메서드 구성
 * 접근제어자   리턴타입   메서드이름  (매개변수목록) 		: 선언부
 *  {	문장	}																				: 구현부
 *  리턴타입 : 메서드 종료 후 넘겨지는 값의 자료형 지정
 *  				void인 경우는 리턴값이 없다.
 *  매개변수 : 매서드 호출시 초기화되는 값.
 *  					선언부대로 호출시 설정해야 함.
 */ 
class Math1 {
	int x,y;
	int add(){return x+y;}
	int sub(){return x-y;}
	int mul(){return x*y;}
	int div(){return x/y;}
	
	int add(int a,int b)	{		return a+b;	}
	int sub(int a,int b)	{		return a-b;	}
	int mul(int a,int b)	{		return a*b;	}
	int div(int a,int b)	{		return a/b;	}
}
public class Ex06_05_MathEx {
	public static void main(String[] args) {
		Math1 m1 = new Math1();
		m1.x = 100;
		m1.y = 10;
		System.out.println(m1.add());
		System.out.println(m1.sub());
		System.out.println(m1.mul());
		System.out.println(m1.div());	
		
		System.out.println(m1.add(8,2));
		System.out.println(m1.sub(8,2));
		System.out.println(m1.mul(8,2));
		System.out.println(m1.div(8,2));
	}	
}
//110
//90
//1000
//10
//10
//6
//16
//4

