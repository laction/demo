package p150408_Chapter09;
/* Math Ŭ���� ���� : ��ġ��� ���� �޼������ ����
 * final Ŭ�����̰�, ��ü���� �Ұ� �޼���(�����ڰ� private)
 * ��� ����� static �̹Ƿ� ��ü������ �ʿ����.
 * ������ �ΰ�
 * 	PI : ������
 * 	E	: �ڿ��α�
 * */
public class Ex09_10_MathEx1 {
	public static void main(String[] args) {
		double a = Math.sin(Math.PI/2);
		
		System.out.println(a);
		System.out.println(Math.toDegrees(Math.PI/2));
		System.out.println(Math.toRadians(60));
		System.out.println(Math.cos(Math.toRadians(60)));
		System.out.println(Math.log(Math.E));
		System.out.println(Math.sqrt(25));

		System.out.println(Math.ceil(3.4));
		System.out.println(Math.ceil(-3.4));
		System.out.println(Math.floor(3.4));
		System.out.println(Math.floor(-3.4));
		System.out.println(Math.rint(3.4));
		System.out.println(Math.rint(-3.4));
		
		System.out.println(Math.pow(2,3));
		System.out.println(Math.round(3.7));
		System.out.println(Math.round(-3.7));
		System.out.println(Math.abs(-3.4));
		System.out.println(Math.max(10,20));
		System.out.println(Math.min(10,20));
	}	
}
//1.0
//90.0
//1.0471975511965976
//0.5000000000000001
//1.0
//5.0
//4.0
//-3.0
//3.0
//-4.0
//3.0
//-3.0
//8.0
//4
//-4
//3.4
//20
//10

