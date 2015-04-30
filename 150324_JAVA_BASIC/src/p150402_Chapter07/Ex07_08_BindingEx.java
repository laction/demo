package p150402_Chapter07;
/* �������� = new ��ü();
 * ���������ڷ��� != ��ü�ڷ���
 * 	���������		������� �ڷ����� ������.
 * 	����޼ҵ��	�����޼ҵ带 ȣ���Ѵ�.
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
