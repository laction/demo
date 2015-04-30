package p150403_Chapter07;
/* final ����.
 * final : ������, ����Ұ��� �ǹ�
 * 
 * final class			(����Ŭ����) 
 * 		��ӺҰ� Ŭ����.
 * 		�ٸ� Ŭ������ �θ�Ŭ������ �� �� ����.
 * 		String Ŭ����
 * 		Math Ŭ����
 * 
 * final method	(���ܸ޼���)	: (������)�������̵� �Ұ�.
 * 
 * final value 		(���)				: ������ �ʱ�ȭ�� ����. 
 * */
public class Ex07_18_FinalEx {
	public static final 	class FinalClass{	}
	public static 				class FinalMethodClass{
		final void finalMethod(){			System.out.println("�������̵� �Ұ�");		}
	}
	public static class SubClass
		//	extends FinalClass							// ������ ����. final Ŭ������ ��ӹ����� ����.
			extends FinalMethodClass
	{
		//@Override		void finalMethod(){}		// ������ ����. final �޼���� �������̵� �� �� ����.
		
		final int finalVal1 = 100;
		final int finalVal2;	{	finalVal2 = 200;		}	// final ������ ���� �ʱ�ȭ�� ����.
	}	
}
