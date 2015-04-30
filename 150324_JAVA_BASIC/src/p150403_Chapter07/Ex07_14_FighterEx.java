package p150403_Chapter07;
/* 인터페이스.
 * 1. 멤버는 추상메서드와 상수만 가능.	멤버가 존재하지 않아도 가능.
 * 2. interface Inter {
 * 		public static final int MAX = 100;	// public,static,final은 생략 가능. public이외의 접근제어지 사용 불가.
 * 		public abstract void method();	// public, abstract 생략 가능. public이외의 접근제어지 사용 불가.
 * 	}
 * 3. 객체화 불가 => 구현클래스로 상속 후 객체화
 * 4. 클래스와 인터페이스간의 구현은 다중구현이 가능.
 * 5. 인터페이스간의 상속이 가능. 인터페이스간의 상속은 다중상속 가능.
 * */
public class Ex07_14_FighterEx {
	public static void main(String[] args) {
		
		Fighter f= new Fighter();
		f.move(20, 30);
		f.attack(f);
		if(f instanceof Fighter){
			System.out.println("f는 Fighter\t\t객체 : " + Fighter.class);
			Fighter F = f;
			F.HP = 10;
			F.x = 20;
			F.y = 20;
			F.move(30, 40);
			F.attack(f);
		}
		if(f instanceof Unit){
			System.out.println("f는 Unit\t\t\t객체 : " + Unit.class);
			Unit U = f;
			U.HP = 10;
			U.x = 20;
			U.y = 20;
		//	U.move(30, 40);
		//	U.attack(f);
		}
		if(f instanceof Fightable){
			Fightable Fa = f;
		//	Fa.HP = 10;
		//	Fa.x = 20;
		//	Fa.y = 20;
			Fa.move(30, 40);
			Fa.attack(f);
			System.out.println("f는 Fightable\t\t객체 : " + Fightable.class);
		}
		if(f instanceof Attackable){
			System.out.println("f는 Attackable\t객체 : " + Attackable.class);
			Attackable Aa = f;
		//	Aa.HP = 10;
		//	Aa.x = 20;
		//	Aa.y = 20;
		//	Aa.move(30, 40);
			Aa.attack(f);
		}
		if(f instanceof Movable){
			System.out.println("f는 Movable\t\t객체 : " + Movable.class);
			Movable Ma = f;
		//	Ma.HP = 10;
		//	Ma.x = 20;
		//	Ma.y = 20;
			Ma.move(30, 40);
		//	Ma.attack(f);
		}		
	}
	
	interface Movable{			void move(int x, int y);	}
	interface Attackable{		void attack(Unit u);	}
	interface Fightable extends Movable,Attackable{			}	
	
	public static class Unit {		public int HP,x,y;	}
	
	public static class Fighter extends Unit implements Fightable{
		@Override		public void move(int x, int y) {		System.out.println("이동중");	}
		@Override		public void attack(Unit u) {	System.out.println("공격");	}
	}	
}
//이동중
//공격
//f는 Fighter		객체 : class p150402_Chapter07.Ex07_14_FighterEx$Fighter
//이동중
//공격
//f는 Unit			객체 : class p150402_Chapter07.Ex07_14_FighterEx$Unit
//이동중
//공격
//f는 Fightable		객체 : interface p150402_Chapter07.Ex07_14_FighterEx$Fightable
//f는 Attackable	객체 : interface p150402_Chapter07.Ex07_14_FighterEx$Attackable
//공격
//f는 Movable		객체 : interface p150402_Chapter07.Ex07_14_FighterEx$Movable
//이동중

