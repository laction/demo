package p150402_Chapter07;
/* 추상클래스.
 * 추상메서드를 가질 수 있는 클래스
 * 스스로 객체화 할 수 없다.		상속만을 통해 사용 가능.
 * */
/* 추상메서드.
 * 선언부만 존재하는 메서드. 구현부가 없다.
 * 상속자에서 반드시 오버라이딩 
 * 일반 멤버메서드에서도 호출 가능하다.
 * 
 *  추상클래스에서 추상클래스의 추상메서드를 오버라이딩 하지 않아도 된다.
 *  	하지만, 일반클래스는 존재하는 모든 추상메서드를 오버라이딩해야 한다.
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
												// 추상메서드 호출 가능. 상속자에게 추상메서드의 재정의를 강제하기 때문에 가능
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
											//  추상클래스를 상속받는 추상클래스는 추상메서드를 오버라이딩하지 않아도 된다.
	public static abstract class SmartPlayer extends Player	{	}
	
											//  일반클래스는 모든 추상메서드를 오버라이딩 해야한다.
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

