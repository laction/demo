package p150325_Chapter03;
// ������ = ������ op ������
// �Ǽ��� = �Ǽ��� op ������

// ������ ������ : %
// ������ ���� ����� ��ȣ�� �������� ��ȣ�� ������. 
public class Ex03_03_OpEx3 {

	public static void main(String[] args) {
		System.out.println("10 / 8 =" + (10 / 8));
		System.out.println("10 % 8 =" + (10 % 8));
		System.out.println("-10 % 8 =" + (-10 % 8));
		System.out.println("10 % -8 =" + (10 % -8));
		System.out.println("-10 % -8 =" + (-10 % -8));
		
		System.out.println("--------1-------");
		
		/* ���� num�� �� �߿��� ���� �ڸ� ���ϸ� ������ �ڵ��̴�. 
		 * ���� num�� ���� '456'�̶�� '400'�� �ǰ�, '111'�̶�� '100'�� �ȴ�. 
		 * ������� ���Ͻÿ�.
		 * */		
		int num = 456;
		int result = num - num%100;
		System.out.println(result);
	}
}
//10 / 8 =1
//10 % 8 =2
//-10 % 8 =-2
//10 % -8 =2
//-10 % -8 =-2
//--------1-------
//400
