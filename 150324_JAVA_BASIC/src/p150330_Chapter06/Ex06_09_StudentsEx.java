package p150330_Chapter06;

/* 다음과 같은 멤버변수를 갖는 Student 클래스를 정의하시오
 * 타입     변수명     설명
 * String name      학생이름
 * int       ban          반
 * int       no            번호
 * int       kor           국어점수
 * int       eng          영어점수
 * int       math       수학점수
 * 
 * 1. 메서드 명 : getTotal
 * 	기능 : 국어(kor) ,  영어(eng), 수학(math)의 점수를 모두 더해서 반환한다.
 * 	반환타입 : int
 * 	매개변수 : 없음
 * 2. 메서드명 : getAverage
 * 	기능 : 총점(국어점수 + 영어점수 + 수학점수)를 과목수로 나눈 평균을 구한다. 
 * 		소수 둘째자리에서 반올림할 것
 * 	반환타임 : int
 * 	매개변수 : 없음
 * */

class Student {
	String name;
	int ban;	int no;
	int kor;	int eng;	int math;
	
	Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;		this.ban = ban;		this.no = no;
		this.kor = kor;				this.eng = eng;		this.math = math;
	}
	int getTotal() {		return kor + eng + math;	}
	float getAverage() {		return Math.round(((double) getTotal() / 3.0) * 100) / 100.0f;	}
	void view(){
		System.out.println(ban+"반 "+no+"번 "+name);
		System.out.println("총점 : " + getTotal());
		System.out.println("평균 : " + getAverage());
	}
}
public class Ex06_09_StudentsEx {
	public static void main(String[] args) {
		Student st = new Student("Lee H. J.", 4, 1, 40, 50, 59);
		st.view();
	}
}
//4반 1번 Lee H. J.
//총점 : 149
//평균 : 49.67

