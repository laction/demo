package p150409_Chapter10;
// ������ ����
// enum : 5.0 ���ĺ��� �������.
public class Ex10_05_EnumEx {
	public enum Lesson{
		JAVA,XML,EJB,JSP,Spring
	}
	public static void main(String[] args) {
		Lesson le = Lesson.JAVA;
		System.out.println("Lesson : "+le);
		System.out.println("XML : " + Lesson.XML);
		System.out.println("JSP : " + Lesson.JSP);
		System.out.println("Spring : " + Lesson.Spring);		
		if(le instanceof Object){
			System.out.println("���� le ��ü��");
			System.out.println(le.toString());
			System.out.println(le.getClass());
			System.out.println("����� ���� �� : "+ le.ordinal());
		}
		Lesson [] lessons = Lesson.values();
		System.out.println("lessons.length : " + lessons.length);
		for(Lesson e : lessons) System.out.println(e+" : "+e.ordinal());
	}	
}
//Lesson : JAVA
//XML : XML
//JSP : JSP
//Spring : Spring
//���� le ��ü��
//JAVA
//class p150409_Chapter10.Ex10_05_EnumEx$Lesson
//����� ���� �� : 0
//lessons.length : 5
//JAVA : 0
//XML : 1
//EJB : 2
//JSP : 3
//Spring : 4
