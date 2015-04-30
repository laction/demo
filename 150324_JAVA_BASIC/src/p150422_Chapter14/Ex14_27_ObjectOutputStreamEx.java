package p150422_Chapter14;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/* 학생클래스 - 직렬화될 클래스
 * 		멤버변수 : 이름,국어점수,영어점수,수학점수
 * 		생성자	: 모든 멤버를 초기화
 * 		멤버메서드 : toString()
 * */
public class Ex14_27_ObjectOutputStreamEx {
	public static void main(String[] args) throws  IOException,ClassNotFoundException {
		Student [] student = {	
				new Student("Ani", 20, 80, 40),
				new Student("Barus", 95, 60, 60),
				new Student("Cion", 65, 70, 80),
				new Student("Draven", 99, 30, 60),
				new Student("Elice", 50, 75, 80)				
		};
		ArrayList<Student> arr ;		
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.ser",true));
//		for(Object obj : student)	oos.writeObject(obj);
		oos.writeObject(student);
				
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.ser"));
		int []sum = {0,0,0} ;
		try{
			while(true){			
				Student s = (Student) ois.readObject();
				System.out.println((Student)s);
				sum[0] += s.kor;
				sum[1] += s.eng;
				sum[2] += s.mat;
			}			
		}catch(EOFException e){}
		catch(Exception e){}
		
		System.out.println("total Kor : " + sum[0]+"\t\t"+"total Eng : " + sum[1]+"\t\t"+"total Mat : " + sum[2]);
		System.out.println("avg Kor : " + sum[0]/5+"\t\t"+"avg Eng : " + sum[1]/5+"\t\t"+"avg Mat : " + sum[2]/5);
		
	}	
	static class Student implements Serializable{
		private static final long serialVersionUID = -3150023260194086010L;
		String name;
		int kor,eng,mat;
		public Student(String name, int kor, int eng, int mat) {
			super();
			this.name = name;
			this.kor = kor;
			this.eng = eng;
			this.mat = mat;
		}
		@Override
		public String toString() {
			return "Student [name=" + name + ", kor=" + kor + ", eng=" + eng
					+ ", mat=" + mat + "]";
		}		
	}
}
