package p150413_Chapter11;

import java.util.Calendar;
// Calendar Ŭ���� ���� 2
public class Ex11_00_04_CalendarEx2 {
	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		Calendar cal = Calendar.getInstance();
			// 2015. 4. 15, 12:30:30 ����
		cal.set(2015, Calendar.APRIL ,15,12,30,30);		// ���� 
	
			// ���ð� cal ��¥���� ���ϱ�
		int tday = today.get(Calendar.DAY_OF_YEAR);
		int cday = cal.get(Calendar.DAY_OF_YEAR);
		System.out.println("��¥ ���̴� : " + (cday - tday));
		String weekday[] = {"��","��","ȭ","��","��","��","��"};
		System.out.println(weekday[cal.get(Calendar.DAY_OF_WEEK)-1]+"���� �Դϴ�.");
	}
}
//��¥ ���̴� : 2
//������ �Դϴ�.
