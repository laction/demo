package p150325_Chapter03;
/*�Ʒ��� ȭ��( Fahrenheit)�� ����(Celcius)�� ��ȯ�ϴ�
 * �ڵ��̴�. ��ȯ������ C=5/9 * (F-32) ��� �� ��,
 * (1)�� �˸´� �ڵ带 �����ÿ�.
 * ��, ��ȯ ������� �Ҽ���°�ڸ����� �ݿø��ؾ��Ѵ�.
 * */
public class Ex03_08_OpEx8 {
	public static void main(String[] args) {
		int f = 100;
		float c = (float) 5 / 9 * (f - 32); // (1)

		System.out.println("ȭ��:" + f);
		System.out.println("����:" + c);
		System.out.println("����:" + (((c * 1000 - (c * 1000) % 1) / 1000) // ����
				+ (((float) (c * 1000) % 1 >= 0.5f) ? (0.001f) : (0.0f)) // �ݿø�
				));
	}
}
