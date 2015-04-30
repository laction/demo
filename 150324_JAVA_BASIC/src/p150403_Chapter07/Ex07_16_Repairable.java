package p150403_Chapter07;
// 인터페이스 예제 : 허용의미로 사용됨
public class Ex07_16_Repairable {
	public static void main(String[] args) {
		SCV s = new SCV();
		s.repair(new Tank());
		s.repair(new DropShip());
		s.repair(new Marine());
		s.repair(new SCV());
		
		Repairable r = new Tank();
//				r = new Marine();	// 컴파일 에러. 인터페이스를 상속받아야만 인터페이스 참조변수로 대입할 수 있다.
		
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
				System.out.println(u+"의 수리 완료");
			}else {
				System.out.println(u + "는 기계가 아닙니다.");
			}
		}
		@Override		public String toString() {	return "SCV";		}
	}
}
//Tank의 수리 완료
//DropShip의 수리 완료
//Marine는 기계가 아닙니다.
//SCV의 수리 완료
