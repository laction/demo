package p150325_Chapter03;
//shift ������ : <<(�����̵�), >>(�����̵���ȣ����), >>>(�����̵�)
public class Ex03_04_OpEx4 {
	public static void main(String[] args) {
		
		System.out.println( Integer.toString( 0b1000	<<	2 , 2 ) ); // LSB�� 0���� ä����
		System.out.println( Integer.toString( 0b1000	>>	2 , 2 ) );	// MSB�� 0���� ä����
		System.out.println( Integer.toString( 0b1000	>>>	2 , 2 ) );	// MSB�� 0���� ä����
		
		System.out.println("-----------------");
		
		System.out.println( Integer.toString( -0b1000	<<	2 , 2 ) ); // LSB�� 1�� ä����
		System.out.println( Integer.toString( -0b1000	>>	2 , 2 ) );	// MSB�� 1�� ä����
		System.out.println( Integer.toString( -0b1000	>>>	2 , 2 ) );	// MSB�� 0���� ä���� -> ��ȣ �����ڰ� 0���� ä��������.
		
	}
}

//100000
//10
//10
//-----------------
//-100000
//-10
//111111111111111111111111111110
