package p150330_Chapter06;

/*
 ���ο� ������ ���̸� ������ �ִ� ���簢��(Rectangle)�� 
 Ŭ���� �����. ���� �ѷ��� ���ϴ� ����� ������.
 */
class Rectangle {
	private int x, y, w, h;
	Rectangle(int x, int y, int w, int h) {
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
	}
	public int area() {
		return w * h;
	}
	public int length() {
		return 2 * (w + h);
	}
}
/*����Ŭ����(Animal)
 * �̸��� ���� ����� �Դ�(eat) ����� �ִ�.
 * ��� : �̸� : ������
 * 			���� : 20
 * 			���ִ�!!!
 * */
class Animal{
	String name;
	int age;
	Animal(String name,int age){
		this.name = name ; this.age = age;
	}
	void status(){	System.out.println("�̸�(name) : "+name+"\n����(age) : "+age);	}
	void eat(){		System.out.println("���ִ�!");	}
}
// main�޼��尡 �����ϴ� Ŭ������ ���� Ŭ������ �Ѵ�.
// ���� Ŭ������ �̸��� ���� �̸��� ���ƾ� �Ѵ�.
// �ڹٿ����� public class�� �̸��� �����̸��� �ݵ�� ���ƾ� �Ѵ�.
// �ϳ��� ���Ͽ� public class�� �Ѱ��� �����ϴ�.
public class Ex06_02_RectangleEx {
	public static void main(String[] args) {
		Rectangle r = new Rectangle(10,20,50,60);
		
		System.out.println("area : "+r.area());
		System.out.println("length : "+r.length());
		
		System.out.println("-----����1------");
		
		Animal monkey = new Animal("������",20);
		monkey.status();
		monkey.eat();
		Animal dog = new Animal("������", 3);
		dog.status();
		dog.eat();
	}
}
//area : 3000
//length : 220
//-----����1------
//�̸�(name) : ������
//����(age) : 20
//���ִ�!
//�̸�(name) : ������
//����(age) : 3
//���ִ�!

