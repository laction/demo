package p150325_Chapter03;

// 증감연산자 예제 : ++(1씩 증가)
// 전위형 : ++x;
// 후위형 : x++; // 연산자 우선순위가 가장 낮다.

public class Ex03_05_OpEx5 {

	public static void main(String[] args) {
		
			int x = 0;
			
			x++;			System.out.println("x="+x);
			x--;				System.out.println("x="+x);	
			
			++x;			System.out.println("x="+x);
			--x;				System.out.println("x="+x);
			
			System.out.println("x="+ x++);
			System.out.println("x="+ x--);
			System.out.println("x="+ ++x);
			System.out.println("x="+ --x);
	}
}
//<CONSOL>
//10 / 8 =1
//10 % 8 =2

 