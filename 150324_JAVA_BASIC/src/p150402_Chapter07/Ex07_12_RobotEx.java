package p150402_Chapter07;
/* 
 * 다음과 같은 실행결과를 얻도록 코드를 완성하시오
 * 추상클래스 클래스 Robot
 * 		추상메서드 : play();
 * 클래스 DanceRobot
 * 		부모클래스 : Robot;
 * 		멤버메서드 : dance();
 * 클래스 SingRobot
 * 		부모클래스 : Robot;
 * 		멤버메서드 : sing();
 * 클래스 DrawRobot
 * 		부모클래스 : Robot;
 * 		멤버메서드 : draw();
 * 
 * 구동 클래스 RobotEx
 * 메서드명 : action
 * 		기능 : 주어진 객체의 메서드를 호출한다.
 * 			DanceRobot인 경우, dance()를 호출하고,
 * 			SingRobot인 경우, sing()를 호출하고,
 * 			DrawRobot인 경우, draw()를 호출한다.
 * 		반환타입 : 없음
 * 		매개변수 : Robot r - Robot인스턴스 또는
 * 										Robot의 자손 인스턴스
 * */
public class Ex07_12_RobotEx {
	
	public static void action(Robot r){		r.play();	}
	
	public static void main(String[] args) {
		Robot[] arr = new Robot[]
				{new DanceRobot(),new SingRobot(),new DrawRobot()};
		for(Robot r : arr)
			action(r);
	}	
	
	public static class DanceRobot extends Robot {
		@Override		public void play() {			dance();		}	
		public void dance(){			System.out.println("안무를 춰보아요.");		}		
	}
	public static class SingRobot extends Robot{
		@Override		public void play() {			sing();		}
		public void sing(){			System.out.println("노래를 노래합니다.");		}		
	}
	public static class DrawRobot extends Robot{
		@Override		public void play() {			draw();		}		
		public void draw(){			System.out.println("그림을 샤샤샤샥.");		}		
	}	
	public static abstract class Robot{
		public abstract void play();
	}
}
//안무를 춰보아요.
//노래를 노래합니다.
//그림을 샤샤샤샥.
