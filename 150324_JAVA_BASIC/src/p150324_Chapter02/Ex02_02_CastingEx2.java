package p150324_Chapter02;

//  ����ȯ ���� 2
// String Ŭ����
// 1. �����ϰ� = �����ڷ� ��ü ���� ���� Ŭ����
// 2. + ������ ��밡��
// 3. String = String + �⺻��

public class Ex02_02_CastingEx2 {

	
	public static void main(String[] args) {
		System.out.println("��ȣ : " + 1 + 2 + 3);
		System.out.println(1 + 2 + 3 + "��" );
		
		byte b1 = 10;
		byte b2 = 10;
		byte b3 = (byte)(b1 + b2);
		System.out.println(b3);
		Character ch = 'J';
		
		System.out.println(ch.toString() + "ava");
		
		char a = ' ';
		
		System.out.println(b1+b2);		
	}

}
