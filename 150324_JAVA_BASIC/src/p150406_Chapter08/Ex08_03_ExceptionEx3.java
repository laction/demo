package p150406_Chapter08;
/* finally : �������̰ų�, ���ܹ߻��� ��� ����Ǵ� ��
 * ���ܹ߻��� return ������ ����Ǿ finally ���� ����ȴ�.
 * */
public class Ex08_03_ExceptionEx3 {
	public static void main(String[] args) {
		try {
			System.out.println("1.Before Error");
			System.out.println("2.Error Occure"+1/0);
		} catch (Exception e) {
			System.out.println("3.Error Occure");
			return;			
		}finally {
			System.out.println("4.Finally Block");
		}
		System.out.println("5.After Try-Block");
	}
}
//1.Before Error
//3.Error Occure
//4.Finally Block
