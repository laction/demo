package p150406_Chapter08;
/* ����ó�� : try���� �����.
 * ����ó�� : ���� �߻��� "��"("���� �߻� �Լ�" �� "�ش� �Լ��� �����ϴ� �Լ� ���") ���������� ����.
 * 				�ش� ������ �ش��ϴ� ��Ϲ� ����.
 * 				����, finally�� ���� ����. 			
 * 
 * �ڹٴ� ����ó���� �ʼ�.
 * 	��, RuntimeException�� ���� ����ó���� ������ �� �ִ�.
 * 		RuntimeException�� ��ӹ��� ��� ��ü�� ���� �����ϴ�. 	
 * try�� ������ Exception Ŭ������ �̸��� ��� �޶�� �Ѵ�.	
 * ����ó������ ��� ������ �ѷ��׿��� �Ѵ�.
 * */
public class Ex08_01_ExceptionEx1 {
	public static void main(String[] args) {
		System.out.println("1.Non-Error Block Before Error Block");
		try{
			System.out.println("2.Before Error");
			System.out.println("3.Error Occure" + 2/0);	// java.lang.ArithmeticException: / by zero													
			System.out.println("4.After Error At Same");
		}catch(ArithmeticException e){
			System.out.println("5.Catch Error And Throw This");
		}finally {
			System.out.println("6.Finally Block");
		}
		System.out.println("7.Non-Error Block After Error Block");
	}
}
//Non-Error Block Before Error Block
//Before Error
//Catch Error And Throw This
//Finally Block
//Non-Error Block After Error Block
