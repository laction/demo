package p150331_Chapter06;
/* �ʱ�ȭ�� 
 * static �ʱ�ȭ �� : Ŭ���������� �ʱ�ȭ ���
 * �ν��Ͻ� �ʱ�ȭ�� : �ν��Ͻ������� �ʱ�ȭ���
 * 											������ ȣ������ �ʱ�ȭ �ʿ�� ���.
 * */
public class Ex06_14_BlockEx {
	static int cv;
	static {					// Ŭ���� ������ �ʱ�ȭ �Ҷ� static �ʱ�ȭ ���� ���.
		cv = (int)(Math.random()*100);
		System.out.println("static �ʱ�ȭ�� ");
		System.out.println("cv = "+cv);		
	}
	{
		System.out.println("�ν��Ͻ� �ʱ�ȭ ��");
		System.out.println("������ ���� ���� ȣ���");
	}	
	public Ex06_14_BlockEx() {
		System.out.println("������");
	}
	public void testF(){}
	public static void main(String[] args) {
		System.out.println("main �޼��� ����");
		Ex06_14_BlockEx b = new Ex06_14_BlockEx();
		System.out.println("b ��ü���� �Ϸ�");
		Ex06_14_BlockEx b2 = new Ex06_14_BlockEx();
		System.out.println("b2 ��ü���� �Ϸ�");
		System.out.println("main �޼��� ����");		
	}
}
//static �ʱ�ȭ�� 
//cv = 15
//main �޼��� ����
//�ν��Ͻ� �ʱ�ȭ ��
//������ ���� ���� ȣ���
//������
//b ��ü���� �Ϸ�
//�ν��Ͻ� �ʱ�ȭ ��
//������ ���� ���� ȣ���
//������
//b2 ��ü���� �Ϸ�
//main �޼��� ����
