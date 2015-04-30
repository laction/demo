package p150421_Chapter14;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/* Serializable : ����� ����
 * */


public class Ex14_16_ObjectOutputStreamEx {
	public static void main(String[] args) throws IOException{
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("object.dat"));
		Customer sc1 = new Customer("���", 25, "11111111");
		Customer sc2 = new Customer("ȫ�浿", 30, "22222222");
		oos.writeObject(sc1);oos.writeObject(sc2);
		System.out.println("�� 1 : "+sc1);
		System.out.println("�� 2 : "+sc2);
		oos.close();		
	}
	
	static class Customer
	implements Serializable
	{
		// ��ü ������ ���. ������ ������ �񱳵Ǵ� ��. �������� ������, ������ ������ ������������.
//		private static final long serialVersionUID =3937153196664025558L  ;		
		private String name;
		private int age;
		private transient String jumin;		// ������ ��½�, null�� ó��. �����͸� ����. 
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
