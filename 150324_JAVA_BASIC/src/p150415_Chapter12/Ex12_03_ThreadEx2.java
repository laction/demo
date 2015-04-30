package p150415_Chapter12;
// Runnable 인터페이스를 구현하는 방식으로 Thread 생성
/* 1. 구현클래스를 통해서  Runnable 객체를 생성.
 * 2.  Thread 객체를 생성시 위의 구현클래스 객체를 생성자를 통해서 Thread 객체에 전달.
 * 		=> 구현클래스의 run() 메서드를 Thread의 run() 메서드로 결정함.
 * */
public class Ex12_03_ThreadEx2 {
	public static void main(String[] args) {
		new Thread(new MyRunnable()).start();
		new Thread(new MyRunnable()).start();		
	}
	static class MyRunnable implements Runnable {
		@Override
		public void run() {
			try {				
				for (int i = 0; i < 5; i++) {
					System.out.println(i + "="
							+ Thread.currentThread().getName());
					Thread.sleep(1000);
				}
			} catch (InterruptedException e) {		}
		}
	}
}
//0=Thread-1
//0=Thread-0
//1=Thread-1
//1=Thread-0
//2=Thread-1
//2=Thread-0
//3=Thread-0
//3=Thread-1
//4=Thread-1
//4=Thread-0
