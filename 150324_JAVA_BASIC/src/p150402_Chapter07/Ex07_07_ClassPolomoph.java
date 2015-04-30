package p150402_Chapter07;
/* ������ ����
 * �������� ���������� ����ȯ�̴�.
 * ���������� Ÿ�Ը�ŭ�� ����� ���� �����ϴ�
 * Object �� ���������� ������ ��ü�� Object�� ����� ���ٰ���
 * Mamal �� �������� : Object ��� + Mamal ���
 * Human �� �������� : Object ��� + Mamal ��� + Human ���
 * 
 * �ڽ�Ÿ���� ��ü�� �θ�Ÿ���� ���������� ��������
 * �θ�Ÿ���� ��ü�� �ڽ�Ÿ���� ���������� �����Ұ���
 * */
public class Ex07_07_ClassPolomoph {
	public static class Mamal{
		String spiecies;
		void iamMamal(){	System.out.println("I'm a Mamal");}		
	}
	public static class Human extends Mamal{		
		void ImHuman(){			System.out.println("I'm a Human");		}
	}
	public static void main(String[] args) {
		Mamal mamal = null;
		Human human = null;
		
		mamal = 					new Human();			//	1. �θ�Ŭ������ �ڽ�Ŭ������ ������ �� �ִ�. 
	//	human = 					new Mamal();			// ��������. �ڽ�Ŭ������ �θ� Ŭ������ �������� ���Ѵ�.
		
		mamal = 					new Human();
		human = (Human) mamal;						// 2. ����ȯ�� ����, �θ�Ŭ������ �̿��� �ڽ�Ŭ������ ������ �� �ִ�.
		human = (Human) ((Mamal) new Human());
		
		mamal = new Mamal();							// 3. ���� �� ���°� �θ�Ŭ������, �ڽ�Ŭ������ ������ �� ����.
	//	human = (Human)	mamal;						// ���࿡��. 
	//	human = (Human) ((Mamal) new Mamal());
		
		Object o = (Object)new Human();			// 4. ��� Ŭ������ Object Ŭ������ ����ȯ �����ϴ�.
					 o = (Object)new Mamal();
		
		mamal.iamMamal();
	//	mamal.IamHuman();		// ����.				// 5. �θ�Ŭ������ �ڽ� Ŭ������ �޼��带 ������� ���Ѵ�.

	//	((Human)(new Mamal())).ImHuman();	// ���࿡��. �� ����� Mamal�̱� ������, Human�� �޼ҵ带 ����� �� ����.
		
																				// 6. instanceof : ���� ���ɿ��θ� boolean������ ��ȯ.
		if ( mamal instanceof Human )
			System.out.println( "mamal instanceof Human" );
		if ( mamal instanceof Mamal )
			System.out.println( "mamal instanceof Mamal" );
		if ( mamal instanceof Object )
			System.out.println( "mamal instanceof Object" );
	}
}
//I'm a Mamal
//mamal instanceof Mamal
//mamal instanceof Object

