package p150325_Chapter03;
// ���Կ����� ���� : A=B (B�� A�� ����)
// A : lvalue �� �ݵ�� �������� �Ѵ�.
// B : rvalue �� ����, ����, ���(���ͷ�) ����
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
