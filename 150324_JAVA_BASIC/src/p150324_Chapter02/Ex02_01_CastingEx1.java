package p150324_Chapter02;
// ����ȯ ����
// ����ȯ ������ : (�ڷ���)
public class Ex02_01_CastingEx1 {
	public static void main(String[] args){
		/*
		 * byte (1), short(2), int(4), long(8), float(4), double(8)
		 *  <=  : ����ȯ ������ �ݵ�� ���
		 *   => : ����ȯ ������ ���� ����
		 * */
		byte b1 = 10;
		int i1 = b1 ; 			// ����ȯ ������ ��������
		byte b2 = (byte) i1;	// ����ȯ ������ �����Ұ�
		b1 = (byte) 300;
		System.out.println(b1);		
	}
}
