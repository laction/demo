package p150331_Chapter06;
//	오버로딩.
//	동일한 클래스내에 동일한 이름의 메서드.
//	매개변수의 타입과 개수가 다르면 선언 가능.
//
// 오버로딩된 메서드의 호출 우선순위.
//	1. 호출시 입력된 자료형과 매개변수의 자료형 동일
//	2. 자동형변환 가능한 매개변수를 가진 함수를 찾음
//			형변환 가능한 메서드가 여러가지 일 경우, 컴파일 에러 발생.	
class Math3 {
//	int add(int a, int b) {				System.out.print("1 : ");		return a + b;	}
//	long add(int a, long b) {		System.out.print("2 : ");		return a + b;	}	// int,long 과 long,int가 주석처리되면 에러
	long add(long a, int b) {		System.out.print("3 : ");		return a + b;	}
	long add(long a, long b) {	System.out.print("4 : ");		return a + b;	}
	int add(int[] a) {		System.out.print("5 : ");
		int result = 0;
		for (int i = 0; i < a.length; i++)			result += a[i];
		return result;
	}
}
public class Ex06_11_OverloadingEx {
	public static void main(String[] args) {
		Math3 m3 = new Math3();
		System.out.println(m3.add(3,3));
		System.out.println(m3.add(3,3L));
		System.out.println(m3.add(3L,3));
		System.out.println(m3.add(3L,3L));
		System.out.println(m3.add(new int [] {10,20,30}));
		String a = null;		
	}
}
//3 : 6
//4 : 6
//3 : 6
//4 : 6
//5 : 60
