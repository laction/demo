// ���� ����
// �ĺ��� ��� : 
// 1. Ŭ���� : �빮�ڷ� ����. �ṉ̀����� �� ������ ù�ܾ�� �빮��
//			ex : JavaTest
// 2. ������ �޼��� : �ҹ��� ����
//				�δܾ��� �ռ��� ��� �ι�° �ܾ��� ù�� �빮��
//			ex : setNumber
// 3. ��� : ��� ���ڸ� �빮�ڷ�
//		�ռ��ܾ��� ��� _�� ��������
//			ex : MAX_NUMBER
// �ĺ��� ����
// �����ڿ� ���� Ư��������($,_)�� ��밡��
// ���ڷδ� ������ �� ����.
// ex : top10 ( o ) , _id ( o )
//       7up ( x )
// 2. ��ҹ��ڸ� �����Ѵ�.
// ex : if ( x ) : �������
//        If ( o ) : ���� �ƴ�.

package p150324_Chapter02;

public class Ex02_04_VarEx1 {

	public static void main(String[] args) {
		// ������ ���� : �޸� �Ҵ�
		// �ڷ��� ������ ; 
		// �ڷ����̶� : ������ ������ �����ϴ� ����
				
		boolean b = true;
		b = false ; 
		int i =100;
		i = 'A' ; 
		System.out.println(i);  // 65
		System.out.println(b); // false
		
		byte b2 = 10;
		// b2 = 300; // �����÷ο� ����
		
		// float f = 1.1 ; // !!! ���� :  �Ϲ����� �Ǽ����� double�� �ν�. 1.1f�� ���� �Ǽ��� f�� ������ float������ ǥ�� ����
		float 	f = 1.1f;
					f = (float)1.1; // �Ǽ��� ���ͷ��� �ڷ����� double
				
					/* ���̻� : ��ҹ��� ���� ����
					 * l L : long�� ���ͷ�
					 * f F : float�� ���ͷ�
					 * d D : double�� ���ͷ� (�⺻��)
					 * */
			String Lee = "SuperMario" ;
			
			System.out.println(Lee);
	}
}
