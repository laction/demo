package p150406_Chapter08;
/* throw : ���� �߻�
 * try ������ ����ó��(����) ���, throw ���� �߻���Ű�� ����� ����.
 *  */
public class Ex08_04_ExceptionEx4 {
	public static void main(String[] args) {
		try {
			// ���ܰ�ü ����
			Exception e = new Exception ("���Ƿ� ���ܹ߻�");
			// throw e ��ü�� ���� �߻�, JVM ����.
			throw e;
		} catch (Exception e){
			System.out.println( "�����޽��� : " + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("���α׷� ���� ����");
	}
}
//�����޽��� : ���Ƿ� ���ܹ߻�
//���α׷� ���� ����
//java.lang.Exception: ���Ƿ� ���ܹ߻�
//	at p150406_Chapter08.Ex08_04_ExceptionEx4.main(Ex08_04_ExceptionEx4.java:7)
