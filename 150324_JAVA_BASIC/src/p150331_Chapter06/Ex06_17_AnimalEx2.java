package p150331_Chapter06;
/**/
class Animal{
	String name;
	int age;
	Animal(int age){	this("���",age);	}
	Animal(String name){	this(name,1);	}
	Animal(String name,int age){ this.name = name ; this.age = age; }
	void show(){
		System.out.println(name+"��(��) "+age+" �� �Դϴ�.");
	}
}
public class Ex06_17_AnimalEx2 {
	public static void main(String[] args) {
		Animal ani1 = new Animal("������",26);
		ani1.show();
		Animal ani2 = new Animal("����");
		ani2.show();
		Animal ani3 = new Animal(100	);
		ani3.show();		
	}
}
//�����̴�(��) 26 �� �Դϴ�.
//���ڴ�(��) 1 �� �Դϴ�.
//�����(��) 100 �� �Դϴ�.
