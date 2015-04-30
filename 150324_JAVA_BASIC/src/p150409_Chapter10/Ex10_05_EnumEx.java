package p150409_Chapter10;
// 열거형 예제
// enum : 5.0 이후부터 예약어임.
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
			System.out.println("나는 le 객체다");
			System.out.println(le.toString());
			System.out.println(le.getClass());
			System.out.println("저장된 변수 값 : "+ le.ordinal());
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
//나는 le 객체다
//JAVA
//class p150409_Chapter10.Ex10_05_EnumEx$Lesson
//저장된 변수 값 : 0
//lessons.length : 5
//JAVA : 0
//XML : 1
//EJB : 2
//JSP : 3
//Spring : 4
