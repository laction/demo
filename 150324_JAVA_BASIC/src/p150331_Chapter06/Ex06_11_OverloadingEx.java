package p150331_Chapter06;
//	�����ε�.
//	������ Ŭ�������� ������ �̸��� �޼���.
//	�Ű������� Ÿ�԰� ������ �ٸ��� ���� ����.
//
// �����ε��� �޼����� ȣ�� �켱����.
//	1. ȣ��� �Էµ� �ڷ����� �Ű������� �ڷ��� ����
//	2. �ڵ�����ȯ ������ �Ű������� ���� �Լ��� ã��
//			����ȯ ������ �޼��尡 �������� �� ���, ������ ���� �߻�.	
class Math3 {
//	int add(int a, int b) {				System.out.print("1 : ");		return a + b;	}
//	long add(int a, long b) {		System.out.print("2 : ");		return a + b;	}	// int,long �� long,int�� �ּ�ó���Ǹ� ����
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
