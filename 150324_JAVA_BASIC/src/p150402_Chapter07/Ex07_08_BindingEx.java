package p150402_Chapter07;
/* 참조변수 = new 객체();
 * 참조변수자료형 != 객체자료형
 * 	멤버변수는		멤버변수 자료형을 따른다.
 * 	멤버메소드는	참조메소드를 호출한다.
 * */

public class Ex07_08_BindingEx {
	public static class Parent {
		int x=10;
		void method(){
			System.out.println("Parent Method");
		}
	}
	public static class Child extends Parent{
		int x= 20;
		@Override
		void method(){
			System.out.println("Child Method");
			System.out.println("this.x :     " + this.x);
			System.out.println("super.x : " + super.x);
		}
	}
	public static void main(String[] args) {
		Parent p = new Child();
		Child c = new Child();
		
		System.out.println("p.x = " + p.x);		 
		p.method();
		
		System.out.println();
		
		System.out.println("c.x = " + c.x);
		c.method();			
	}
}
//p.x = 10
//Child Method
//this.x :     20
//super.x : 10
//
//c.x = 20
//Child Method
//this.x :     20
//super.x : 10
