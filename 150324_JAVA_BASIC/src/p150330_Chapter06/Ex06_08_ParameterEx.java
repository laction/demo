package p150330_Chapter06;
// �⺻�� �Ű������� ������ �Ű����� ����
// �⺻�� �Ű����� : ���� ����Ǿ ȣ���ϴ� �޼�����
//									�������� ������ �Ұ�.	��ȸ�� ����.
// ������ �Ű����� : �������� ����ǹǷ� ȣ���ϴ� �޼����� 
//									���������� ���� ������ ����. ��ȸ�� ���� ����.
class Data {	int x;	}

public class Ex06_08_ParameterEx {
	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("main : x = " + d.x);
		System.out.println();
		change(d.x);					//  ���� ���� �����ϹǷ�, ���� �ٲ��� �ʴ´�.
		System.out.println("after change (d.x) : " + d.x);
		System.out.println();
		change2(d);						// ���� ������ �����ϹǷ�, ���� �ٲ�� �ȴ�.
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
