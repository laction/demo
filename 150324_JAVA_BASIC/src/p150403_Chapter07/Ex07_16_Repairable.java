package p150403_Chapter07;
// �������̽� ���� : ����ǹ̷� ����
public class Ex07_16_Repairable {
	public static void main(String[] args) {
		SCV s = new SCV();
		s.repair(new Tank());
		s.repair(new DropShip());
		s.repair(new Marine());
		s.repair(new SCV());
		
		Repairable r = new Tank();
//				r = new Marine();	// ������ ����. �������̽��� ��ӹ޾ƾ߸� �������̽� ���������� ������ �� �ִ�.
		
	}
	public static interface Repairable{	}
	public static class Unit {
		public final int MAX_HP;
		public int HP;
		public Unit(int hp) {
			MAX_HP = hp;
		}
	}
	public static class GroundUnit extends Unit{
		public GroundUnit(int hp) {super(hp);}
	}
	public static class AirUnit extends Unit{
		public AirUnit(int hp) {super(hp);}
	}
	public static class Tank extends GroundUnit implements Repairable{
		Tank(){
			super(150);
			HP = MAX_HP;
		}
		@Override		public String toString() {	return "Tank";		}
	}
	public static class DropShip extends GroundUnit implements Repairable{
		DropShip(){
			super(125);
			HP = MAX_HP;
		}
		@Override		public String toString() {	return "DropShip";		}
	}
	public static class Marine extends GroundUnit {
		Marine(){
			super(125);
			HP = MAX_HP;
		}
		@Override		public String toString() {	return "Marine";		}
	}
	public static class SCV extends GroundUnit implements Repairable{
		SCV(){
			super(125);
			HP = MAX_HP;
		}
		void repair (Unit u){
			if( u instanceof Repairable){
				u.HP = u.MAX_HP;
				System.out.println(u+"�� ���� �Ϸ�");
			}else {
				System.out.println(u + "�� ��谡 �ƴմϴ�.");
			}
		}
		@Override		public String toString() {	return "SCV";		}
	}
}
//Tank�� ���� �Ϸ�
//DropShip�� ���� �Ϸ�
//Marine�� ��谡 �ƴմϴ�.
//SCV�� ���� �Ϸ�
