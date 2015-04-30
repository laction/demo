package p150401_Chapter06;
// �̱��� ������ Ŭ���� : ���� �ϳ����� Ŭ����
class Single {		
	private Single() {}		// new�� ������ ���ϴ� Ŭ������ ��
	public int x = 100;
	private static Single single = new Single();	
	public static Single getInstance(){
		return single;
	}
}
public class Ex06_22_SingleEx {
	public static void main(String[] args) {
		//new Single().x		// ����
		Single s1 = Single.getInstance();	// "Ŭ�����̸�@�ؽ��ڵ�"�� ���.
		System.out.println(s1);
		Single s2 = Single.getInstance();	// ���� �ϳ����� ��ü �����Ѵ�.
		System.out.println(s2);
		System.out.println(s1.x);
		System.out.println(s2.x);
		s1.x = 200;		
		System.out.println(s1.x);	// Ŭ���� ������ ���� �����Ƿ�, ����Ŭ������ ���� ���� �ٲ�.
		System.out.println(s2.x);
	}
}
//p150401_Chapter06.Single@1db9742
//p150401_Chapter06.Single@1db9742
//100
//100
//200
//200