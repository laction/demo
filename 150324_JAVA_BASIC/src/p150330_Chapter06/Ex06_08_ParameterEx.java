package p150330_Chapter06;
// 기본형 매개변수와 참조형 매개변수 예제
// 기본형 매개변수 : 값이 복사되어서 호출하는 메서드의
//									변수값의 변경은 불가.	조회만 가능.
// 참조형 매개변수 : 참조값이 복사되므로 호출하는 메서드의 
//									참조영역에 대한 접근이 가능. 조회및 변경 가능.
class Data {	int x;	}

public class Ex06_08_ParameterEx {
	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("main : x = " + d.x);
		System.out.println();
		change(d.x);					//  값을 직접 전달하므로, 값이 바뀌지 않는다.
		System.out.println("after change (d.x) : " + d.x);
		System.out.println();
		change2(d);						// 참조 변수를 전달하므로, 값이 바뀌게 된다.
		System.out.println("after change2 (d.x) : " + d.x);
	}

	public static void change(int x) {		// call by value
		x = 1000;
		System.out.println("change() x : "+x);
	}

	public static void change2(Data d) {	// call by reference
		d.x = 1000;
		System.out.println("change2() x : " + d.x);
	}
}
//main : x = 10
//
//change() x : 1000
//after change (d.x) : 10
//
//change2() x : 1000
//after change2 (d.x) : 1000
