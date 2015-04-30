package p150325_Chapter03;
// 대입연산자 예제 : A=B (B를 A에 대입)
// A : lvalue 는 반드시 변수여야 한다.
// B : rvalue 는 변수, 수식, 상수(리터럴) 가능
public class Ex03_07_OpEx7 {
	public static void main(String[] args) {
		int a=10, b=20;
		int num = 100;	System.out.println(num);
		num += 10;		System.out.println(num);
		num -= 20;		System.out.println(num);	
		num *= 2;			System.out.println(num);	
		num += a+b;	System.out.println(num);
	}
}
//100
//110
//90
//180
//210
