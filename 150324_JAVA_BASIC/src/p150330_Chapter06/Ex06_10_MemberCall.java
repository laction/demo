package p150330_Chapter06;
//	Ŭ���� ����� �ν��Ͻ� ���.
// Ŭ���� ����� Ŭ���� �����, �ν��Ͻ� ����� �ν��Ͻ� ����� ȣ���� �� �ִ�.
// Ŭ���� ����� -(��üȭ)-> �ν��Ͻ� �����  => �Ұ�
//  Ŭ���� ����� <-(ȣ��)--  �ν��Ͻ� ����� => ����
// Ŭ��������� Ŭ���� ���� �ε�� �޸𸮸� �Ҵ� ����
// �ν��Ͻ������ ��üȭ�� �޸𸮸� �Ҵ� ����.

class Math2{
	long a,b;		// �ν��Ͻ� ����
	long add(){return a+b;}		// �ν��Ͻ� �޼���
	static long add(long a,long b){			// Ŭ���� �ż���
			// a,b : �Ű����� a,b �ǹ�
		return a+b;	
	}	
}
public class Ex06_10_MemberCall {
	public static void call(){}
	public static void main(String[] args) {
		//	this.call()		//	����. Ŭ�����޼���� Ŭ�������� �Ἥ ȣ���ؾ� �Ѵ�.		
		System.out.println(Math2.add(1000L, 200L));		
		Math2 math = new Math2();		// ��üȭ
		math.a = 10;
		math.b = 20;
		System.out.println(math.add());		
	}
	int iv = 10;
	static int cv = 20;
	int iv2 = iv;
		// Ŭ���������� cv2�� iv���� ȣ�� ����.
		// static int cv2 = iv; // error
	static int cv2 = new Ex06_10_MemberCall().iv;
	static void  staticMethod1(){
		System.out.println(cv);
			//staticMethod1 �޼��尡 �ν��Ͻ� ����� iv ȣ�� �Ұ�
		System.out.println(new Ex06_10_MemberCall().iv);		// �ν��Ͻ� 
	}	
	void instanceMethod1(){
		System.out.println(cv);
		System.out.println(iv);
	}	
}
//1200
//30

