package p150331_Chapter06;
/**/
class Animal{
	String name;
	int age;
	Animal(int age){	this("사람",age);	}
	Animal(String name){	this(name,1);	}
	Animal(String name,int age){ this.name = name ; this.age = age; }
	void show(){
		System.out.println(name+"는(은) "+age+" 살 입니다.");
	}
}
public class Ex06_17_AnimalEx2 {
	public static void main(String[] args) {
		Animal ani1 = new Animal("원숭이",26);
		ani1.show();
		Animal ani2 = new Animal("사자");
		ani2.show();
		Animal ani3 = new Animal(100	);
		ani3.show();		
	}
}
//원숭이는(은) 26 살 입니다.
//사자는(은) 1 살 입니다.
//사람는(은) 100 살 입니다.
