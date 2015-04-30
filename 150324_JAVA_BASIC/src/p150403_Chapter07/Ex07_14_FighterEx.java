package p150403_Chapter07;
/* �������̽�.
 * 1. ����� �߻�޼���� ����� ����.	����� �������� �ʾƵ� ����.
 * 2. interface Inter {
 * 		public static final int MAX = 100;	// public,static,final�� ���� ����. public�̿��� ���������� ��� �Ұ�.
 * 		public abstract void method();	// public, abstract ���� ����. public�̿��� ���������� ��� �Ұ�.
 * 	}
 * 3. ��üȭ �Ұ� => ����Ŭ������ ��� �� ��üȭ
 * 4. Ŭ������ �������̽����� ������ ���߱����� ����.
 * 5. �������̽����� ����� ����. �������̽����� ����� ���߻�� ����.
 * */
public class Ex07_14_FighterEx {
	public static void main(String[] args) {
		
		Fighter f= new Fighter();
		f.move(20, 30);
		f.attack(f);
		if(f instanceof Fighter){
			System.out.println("f�� Fighter\t\t��ü : " + Fighter.class);
			Fighter F = f;
			F.HP = 10;
			F.x = 20;
			F.y = 20;
			F.move(30, 40);
			F.attack(f);
		}
		if(f instanceof Unit){
			System.out.println("f�� Unit\t\t\t��ü : " + Unit.class);
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
			System.out.println("f�� Fightable\t\t��ü : " + Fightable.class);
		}
		if(f instanceof Attackable){
			System.out.println("f�� Attackable\t��ü : " + Attackable.class);
			Attackable Aa = f;
		//	Aa.HP = 10;
		//	Aa.x = 20;
		//	Aa.y = 20;
		//	Aa.move(30, 40);
			Aa.attack(f);
		}
		if(f instanceof Movable){
			System.out.println("f�� Movable\t\t��ü : " + Movable.class);
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
		@Override		public void move(int x, int y) {		System.out.println("�̵���");	}
		@Override		public void attack(Unit u) {	System.out.println("����");	}
	}	
}
//�̵���
//����
//f�� Fighter		��ü : class p150402_Chapter07.Ex07_14_FighterEx$Fighter
//�̵���
//����
//f�� Unit			��ü : class p150402_Chapter07.Ex07_14_FighterEx$Unit
//�̵���
//����
//f�� Fightable		��ü : interface p150402_Chapter07.Ex07_14_FighterEx$Fightable
//f�� Attackable	��ü : interface p150402_Chapter07.Ex07_14_FighterEx$Attackable
//����
//f�� Movable		��ü : interface p150402_Chapter07.Ex07_14_FighterEx$Movable
//�̵���

