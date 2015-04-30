package p150402_Chapter07;
/* 다형성 예제
 * 다형성은 참조변수의 형변환이다.
 * 참조변수의 타입만큼의 멤버만 접근 가능하다
 * Object 형 참조변수로 참조한 객체는 Object의 멤버만 접근가능
 * Mamal 형 참조변수 : Object 멤버 + Mamal 멤버
 * Human 형 참조변수 : Object 멤버 + Mamal 멤버 + Human 멤버
 * 
 * 자식타입의 객체는 부모타입의 참조변수로 참조가능
 * 부모타입의 객체는 자식타입의 참조변수로 참조불가능
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
		
		mamal = 					new Human();			//	1. 부모클래스는 자식클래스를 참조할 수 있다. 
	//	human = 					new Mamal();			// 구문에러. 자식클래스는 부모 클래스를 참조하지 못한다.
		
		mamal = 					new Human();
		human = (Human) mamal;						// 2. 형변환을 통해, 부모클래스를 이용해 자식클래스로 전달할 수 있다.
		human = (Human) ((Mamal) new Human());
		
		mamal = new Mamal();							// 3. 본래 의 형태가 부모클래스면, 자식클래스가 참조할 수 없다.
	//	human = (Human)	mamal;						// 실행에러. 
	//	human = (Human) ((Mamal) new Mamal());
		
		Object o = (Object)new Human();			// 4. 모든 클래스는 Object 클래스로 형변환 가능하다.
					 o = (Object)new Mamal();
		
		mamal.iamMamal();
	//	mamal.IamHuman();		// 에러.				// 5. 부모클래스는 자식 클래스의 메서드를 사용하지 못한다.

	//	((Human)(new Mamal())).ImHuman();	// 실행에러. 본 모습이 Mamal이기 때문에, Human의 메소드를 사용할 수 없다.
		
																				// 6. instanceof : 참조 가능여부를 boolean값으로 반환.
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

