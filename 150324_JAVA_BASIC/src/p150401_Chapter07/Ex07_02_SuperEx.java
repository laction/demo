package p150401_Chapter07;
// super 참조 객체.
// super 생성자. 인스턴스 멤버에서만 사용 가능.
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
