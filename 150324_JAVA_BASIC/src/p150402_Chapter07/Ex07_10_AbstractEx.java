package p150402_Chapter07;
/* �߻�Ŭ����.
 * �߻�޼��带 ���� �� �ִ� Ŭ����
 * ������ ��üȭ �� �� ����.		��Ӹ��� ���� ��� ����.
 * */
/* �߻�޼���.
 * ����θ� �����ϴ� �޼���. �����ΰ� ����.
 * ����ڿ��� �ݵ�� �������̵� 
 * �Ϲ� ����޼��忡���� ȣ�� �����ϴ�.
 * 
 *  �߻�Ŭ�������� �߻�Ŭ������ �߻�޼��带 �������̵� ���� �ʾƵ� �ȴ�.
 *  	������, �Ϲ�Ŭ������ �����ϴ� ��� �߻�޼��带 �������̵��ؾ� �Ѵ�.
 * */

public class Ex07_10_AbstractEx {
	
	public static void main(String[] args) {
		
		Player [] player = new Player[2];
		player[0] = new CDPlayer();
		player[1] = new MP3Player();
		for (Player p : player){
			p.play(10);
			p.pause();
			p.stop();
		}		
	}
	
	public static abstract class Player{
		public boolean pause;
		public int currentPosition;
		
		public Player(){			pause = false;			currentPosition = 0;		}
		
		public abstract void play(int pos);
		public abstract void stop();
		
		public void play(){		play(currentPosition);		}
		public void pause(){			
												// �߻�޼��� ȣ�� ����. ����ڿ��� �߻�޼����� �����Ǹ� �����ϱ� ������ ����
			if ( pause ){	pause = false;		play(currentPosition);				} 
			else{				pause = true;		stop();			}
		}
	}
	
	public static class CDPlayer extends Player{
		@Override		public void play(int pos){	System.out.println("CDPlayer play ~~ ");		}
		@Override		public void stop(){				System.out.println("CDPlayer stop!");		}
	}	
	
	public static class MP3Player extends Player{
		@Override		public void play(int pos){	System.out.println("MP3Player play ~~ ");		}
		@Override		public void stop(){				System.out.println("MP3Player stop!");		}
	}	
											//  �߻�Ŭ������ ��ӹ޴� �߻�Ŭ������ �߻�޼��带 �������̵����� �ʾƵ� �ȴ�.
	public static abstract class SmartPlayer extends Player	{	}
	
											//  �Ϲ�Ŭ������ ��� �߻�޼��带 �������̵� �ؾ��Ѵ�.
	public static class AndroidPlayer extends SmartPlayer	{
		@Override		public void play(int pos) {		}
		@Override		public void stop() {			}	
	}	
}
//CDPlayer play ~~ 
//CDPlayer stop!
//CDPlayer stop!
//MP3Player play ~~ 
//MP3Player stop!
//MP3Player stop!

