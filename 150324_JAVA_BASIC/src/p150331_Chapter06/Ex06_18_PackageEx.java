package p150331_Chapter06;
/* Package.
 * ��� Ŭ�����̸��� ��Ű������ �����Ѵ�.    ��Ű����.Ŭ������  ó�� ����Ѵ�.
 * package ������ �ݵ�� ���� ���� ù�ٿ� ����Ѵ�.
 * �ϳ��� ������ ��� Ŭ������ ������ ��Ű���̴�. * 
 * */
/* Package ���������� Ŭ����.
 * 1. ���� ��Ű���� Ŭ����
 * 2. java.lang ��Ű���� ���� Ŭ����
 * 3. import�� ����� �ٸ� ��Ű���� Ŭ����.
 * */
import p150330_Chapter06.Ex06_07_ShuffleEx;

public class Ex06_18_PackageEx {
	static void testPrint(){
		System.out.println("PackageEx�� testPrint()");
	}
	public static void main(String[] args) {
		System.out.println(   java.lang.Math.random()   );
		
		p150331_Chapter06.Ex06_18_PackageEx.testPrint();
		
		System.out.println("-----1-----");
		Ex06_07_ShuffleEx.main(null);
		System.out.println("-----2-----");
		p150330_Chapter06.Ex06_06_IsNumberEx.main(null);
		System.out.println("-----3-----");
	}
}
//0.6436876726169328
//PackageEx�� testPrint()
//-----1-----
//1	2	3	4	5	6	7	8	9	
//8	4	2	9	3	6	7	1	5	
//1	2	3	4	5	6	7	8	9	-----2-----
//5.0
//true
//false
//false
//-----3-----
