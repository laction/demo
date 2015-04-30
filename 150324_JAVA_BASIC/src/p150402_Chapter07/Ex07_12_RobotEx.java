package p150402_Chapter07;
/* 
 * ������ ���� �������� �򵵷� �ڵ带 �ϼ��Ͻÿ�
 * �߻�Ŭ���� Ŭ���� Robot
 * 		�߻�޼��� : play();
 * Ŭ���� DanceRobot
 * 		�θ�Ŭ���� : Robot;
 * 		����޼��� : dance();
 * Ŭ���� SingRobot
 * 		�θ�Ŭ���� : Robot;
 * 		����޼��� : sing();
 * Ŭ���� DrawRobot
 * 		�θ�Ŭ���� : Robot;
 * 		����޼��� : draw();
 * 
 * ���� Ŭ���� RobotEx
 * �޼���� : action
 * 		��� : �־��� ��ü�� �޼��带 ȣ���Ѵ�.
 * 			DanceRobot�� ���, dance()�� ȣ���ϰ�,
 * 			SingRobot�� ���, sing()�� ȣ���ϰ�,
 * 			DrawRobot�� ���, draw()�� ȣ���Ѵ�.
 * 		��ȯŸ�� : ����
 * 		�Ű����� : Robot r - Robot�ν��Ͻ� �Ǵ�
 * 										Robot�� �ڼ� �ν��Ͻ�
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
		public void dance(){			System.out.println("�ȹ��� �纸�ƿ�.");		}		
	}
	public static class SingRobot extends Robot{
		@Override		public void play() {			sing();		}
		public void sing(){			System.out.println("�뷡�� �뷡�մϴ�.");		}		
	}
	public static class DrawRobot extends Robot{
		@Override		public void play() {			draw();		}		
		public void draw(){			System.out.println("�׸��� ��������.");		}		
	}	
	public static abstract class Robot{
		public abstract void play();
	}
}
//�ȹ��� �纸�ƿ�.
//�뷡�� �뷡�մϴ�.
//�׸��� ��������.
