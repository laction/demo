package p150330_Chapter06;
// �޼��� ȣ�� ����
/* �޼��� ����
 * ����������   ����Ÿ��   �޼����̸�  (�Ű��������) 		: �����
 *  {	����	}																				: ������
 *  ����Ÿ�� : �޼��� ���� �� �Ѱ����� ���� �ڷ��� ����
 *  				void�� ���� ���ϰ��� ����.
 *  �Ű����� : �ż��� ȣ��� �ʱ�ȭ�Ǵ� ��.
 *  					����δ�� ȣ��� �����ؾ� ��.
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

