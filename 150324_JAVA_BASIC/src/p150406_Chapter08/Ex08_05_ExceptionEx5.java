package p150406_Chapter08;
/* �ڹٿ��� ����ó���� �ʼ��̴�. ����, ���� �� �� �ִ� �κе� �ִ�.
 * */
public class Ex08_05_ExceptionEx5 {
	public static void main(String[] args) {
		//throw new Exception("���� ���� �߻�");					// try catch���� ������ �ʿ��ϴ�.
		throw new RuntimeException("���� ���� �߻�");	// try catch���� ������ �� �ִ�.
	}
}
// Exception in thread "main" java.lang.RuntimeException: ���� ���� �߻�
// at p150406_Chapter08.Ex08_05_ExceptionEx5.main(Ex08_05_ExceptionEx5.java:7)