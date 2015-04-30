package p150406_Chapter08;
/* Exception : ������ �ֻ�� Ŭ����. ��� ����Ŭ������ Exception�� ��ӹ��� ����.
 * 						��� ���� Ŭ������ Exception �������������� ����ȯ�� �����ϴ�.
 * 					 catch ������ ���ϴܿ� �����ؾ� �Ѵ�. (�˼� ���� ���ܸ� ó���ϱ� ����)
 * catch ������ ������ (�ڼ� -> �θ�) ������ ��ġ�ؾ� �Ѵ�.  
 * */

public class Ex08_02_ExceptionEx2 {
	public static void main(String[] args) {		
		for (int Case = 0 ; Case < 3; Case++)
		try {
			if ( Case == 0 ) System.out.println(args[0]);	//  java.lang.ArrayIndexOutOfBoundsException: 0
			if ( Case == 1 ) System.out.println(3/0);			// java.lang.ArithmeticException : / by zero
			if ( Case == 2 ) System.out.println(Integer.parseInt("abc")); // NumberFormatException
		} catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Command ���ο� ���� �ʿ��մϴ�.");
		} catch(ArithmeticException e){
			System.out.println("0���� ������ ������.");
		} catch (NumberFormatException e){
			System.out.println("���ڸ� �Է��ϼ���.");
		} catch(Exception e){
			System.out.println("�˼� ���� �����Դϴ�.");			
		}
	}
}
//Command ���ο� ���� �ʿ��մϴ�.
//0���� ������ ������.
//���ڸ� �Է��ϼ���.
