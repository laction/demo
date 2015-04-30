package p150408_Chapter09;

import java.util.ArrayList;

/* wrapper Ŭ���� : �⺻�� 8���� Ŭ����ȭ �� Ŭ����. => �⺻���� ��üȭ�� �� ���
 * ����
 * �⺻��			wrapperŬ����
 * boolean	Boolean
 * char			Character
 * byte			Byte
 * short			Short
 * int				Integer
 * long			Long
 * float			Float
 * double		Double
 * 
 * �⺻���� �������� ���� ����ȯ���� �ʴ´�.
 * ������, �⺻���� wrapper���������� ����Ȳ ���� ( JDK 5.0 ���� )
 * 	�⺻�� -> wrapper Ŭ���� : auto-Boxing
 * 	            <-                              : autu-UnBoxing 
 * */
public class Ex09_11_WrapperEx1 {
	public static void main(String[] args) {
		Integer i1 = new Integer(100);
		Integer i2 = 100;
		System.out.println("i1 == i2 ?"+(i1==i2));						// ���� �ٸ� ������ ����
		System.out.println("i1.equals(i2) : "+i1.equals(i2));		// �⺻������ ���� ��
		System.out.println("i1.toString()" + i1.toString());
		System.out.println("MAX_VALUE : " + Integer.MAX_VALUE);
		System.out.println("MIN_VALUE : " + Integer.MIN_VALUE);
		
		int pi = i1.intValue();		// JDK 5.0 ����
		pi = i1;								// JDK 5.0 ���� (auto-UnBoxing)
		
		pi = Integer.parseInt("123");
		System.out.println(pi);
		
		double pd = Double.parseDouble("12.3");
		float pf = Float.parseFloat("123.5");
		pi = Integer.parseInt("FF",16);
	}
}
//i1 == i2 ?false
//i1.equals(i2) : true
//i1.toString()100
//MAX_VALUE : 2147483647
//MIN_VALUE : -2147483648
//123
