package p150413_Chapter11;

import java.util.Calendar;
/* Calendar Ŭ���� : �߻�Ŭ������. ��ü�����Ұ�
 * 									getInstance() �޼���� ��ü�� ����.
 * */
public class Ex11_00_03_CalendarEx {
	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		System.out.println(today.get(Calendar.YEAR )+ "��");
		System.out.println(today.get(Calendar.MONTH )+ "��");
		System.out.println(today.get(Calendar.WEEK_OF_YEAR )+ "° ��(������)");
		System.out.println(today.get(Calendar.WEEK_OF_MONTH)+"° ��(�̹�����)");
		System.out.println(today.get(Calendar.DATE)+"����");
		System.out.println(today.get(Calendar.DAY_OF_YEAR)+"��°(���ط�)");
		System.out.println(today.get(Calendar.DAY_OF_MONTH)+"��°(�̹��޷�)");		// DATE�� ����.
		System.out.println(today.get(Calendar.DAY_OF_WEEK)+"��°(���Ϸ�)");
		System.out.println(today.get(Calendar.AM_PM)+" (0:����,1:����)");
		System.out.println(today.get(Calendar.HOUR)+"��(12��)");
		System.out.println(today.get(Calendar.HOUR_OF_DAY)+"��(24��)");
		System.out.println(today.get(Calendar.MINUTE)+"(��)");
		System.out.println(today.get(Calendar.SECOND)+"��");
		System.out.println(today.get(Calendar.MILLISECOND)+"�и���");
		System.out.println(today.get(Calendar.ZONE_OFFSET)/(60*60*1000)+"(today.get(Calendar.ZONE_OFFSET)/(60*60*1000))");
		System.out.println(today.getActualMaximum(Calendar.DATE)+"(�̹����� ��������)");
	}
}
//2015��
//3��
//16° ��(������)
//3° ��(�̹�����)
//13����
//103��°(���ط�)
//13��°(�̹��޷�)
//2��°(���Ϸ�)
//1 (0:����,1:����)
//0��(12��)
//12��(24��)
//42(��)
//45��
//316�и���
//9(today.get(Calendar.ZONE_OFFSET)/(60*60*1000))
//30(�̹����� ��������)
