package p150324_Chapter02;

// Ư�� ���� ���� : \ ǥ����
// \n : ���ο� Line
// \t : Tab ǥ��
// \" : ���� "
// \\ : ���� \
// .properties ������ �����, Unicode�� ���� �˾� �� �� �ִ�.

public class Ex02_03_SpecialCharEx {

	public static void main(String[] args) {
		System.out.println( "\"\n\t\\");
		System.out.println("----------------------");
		
		char single = '\'';
		String quote = "Hello \"ȫ�浿!\"";
		String root = "c:\\";
		System.out.println(single);
		System.out.println(quote);
		System.out.println(root);
		System.out.println("��\t��\t��");
		System.out.println("�ȳ��ϼ���\n�̺κ��� �����ٿ�");
		System.out.println("\ud64d\uae38\ub3d9");
	}
}
