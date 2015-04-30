package p150325_Chapter03;

// 부호연산자 : +(현재부호유지) - (현재부호변경)
// ! : not. 논리연산자
public class Ex03_02_OpEx2 {
	public static void main(String[] args) {
		int x = -8;
		System.out.println(+x);	// 8
		System.out.println(-x);	// -8
		
		System.out.println(!true);
		boolean b = false;
		System.out.println(!b);	// true
		System.out.println(b);	// false
	}
}
//<CONSOL>
//-8
//8
//false
//true
//false
