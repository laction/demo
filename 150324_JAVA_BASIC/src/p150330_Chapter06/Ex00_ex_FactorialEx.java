package p150330_Chapter06;
// Factorial ���� : ����Լ� ����
// ����Լ��� XML �Ľ̿��� ���� ���δ�.
public class Ex00_ex_FactorialEx {
	static int factorial(int num){
		return (num<=0) ? (1) : (num*factorial( num-1 ));
	}
	public static void main(String[] args) {
		System.out.println(factorial(4));		
	}
}
//24
