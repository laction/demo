package p150401_Chapter07;
// super ���� ��ü.
// super ������. �ν��Ͻ� ��������� ��� ����.
class Parent{
	int x =10; 
}
class Child extends Parent {
	int x = 20;
	void method(){
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(super.x);
	}
}

public class Ex07_02_SuperEx {
	public static void main(String[] args) {
		Child c= new Child();
		c.method();
	}
}
//20
//20
//10
