package p150421_Chapter14;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/* Serializable : 멤버가 없다
 * */


public class Ex14_16_ObjectOutputStreamEx {
	public static void main(String[] args) throws IOException{
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("object.dat"));
		Customer sc1 = new Customer("김삿갓", 25, "11111111");
		Customer sc2 = new Customer("홍길동", 30, "22222222");
		oos.writeObject(sc1);oos.writeObject(sc2);
		System.out.println("고객 1 : "+sc1);
		System.out.println("고객 2 : "+sc2);
		oos.close();		
	}
	
	static class Customer
	implements Serializable
	{
		// 객체 검증시 사용. 데이터 복원시 비교되는 값. 정해주지 않으면, 임의의 값으로 정해져버린다.
//		private static final long serialVersionUID =3937153196664025558L  ;		
		private String name;
		private int age;
		private transient String jumin;		// 데이터 출력시, null로 처리. 데이터를 감춤. 
		Customer(String name , int age, String jumin){
			this.name = name;
			this.age = age;
			this.jumin = jumin;
		}
		public String getName() {			return name;		}
		public void setName(String name) {			this.name = name;		}
		public int getAge() {			return age;		}
		public void setAge(int age) {			this.age = age;		}
		public String getJumin() {			return jumin;		}
		public void setJumin(String jumin) {			this.jumin = jumin;		}
		@Override	public String toString() {
			return "Customer [name=" + name + ", age=" + age + ", jumin="+ jumin + "]";}
	}	
}
