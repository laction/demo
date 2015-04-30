package p150421_Chapter14;

public class Ex14_11_PrintStreamEx2 {
	public static void main(String[] args) {
		System.out.printf("%c%n",'A');		// A ���
		System.out.printf("%5c%n",'A');		// 5�ڸ� Ȯ�� �� A ���
		System.out.printf("%-5c%n%n",'A');	// 5�ڸ� Ȯ�� �� �������ķ� A ���
		
		System.out.printf("%d%n",12345);		// 10���� ���
		System.out.printf("%o%n",12345);		// 8���� ���
		System.out.printf("%x%n",12345);		// 16���� ���		
		System.out.printf("%10d%n",12345);		// 10�ڸ� Ȯ��
		System.out.printf("%010d%n%n",12345);	// ���ڸ� 0 ä��
		
		System.out.printf("%f%n",12.12745);		// �Ǽ�
		System.out.printf("%g%n",12.12745);		// �ٻ� �Ǽ�
		System.out.printf("%e%n",12.12745);		// ������� �Ǽ�
		System.out.printf("%10.2f%n%n",12.12745);	// 10�ڸ� Ȯ��(�Ҽ����� �Ǽ��α��� ����), �Ҽ��� 2°���� �ݿø�
		
		System.out.printf("%s%n","ȫ�浿");		// ������ ���
		System.out.printf("%s%n%s%n","ȫ�浿","���");
		
		System.out.printf("%b%n",true);		// boolean ���
		
		// ��������� ��밡���� �Լ�. String String.format()
		System.out.println(String.format("%8.3f%n", 12.12745));
		
		System.out.printf("%x%n",255);
		System.out.printf("%X%n",255);		// �빮�ڷ� hexa�� ���
	}
}
