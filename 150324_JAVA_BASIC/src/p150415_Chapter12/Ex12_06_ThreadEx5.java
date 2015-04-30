package p150415_Chapter12;
// 데몬 쓰레드.
/* 	일반 쓰레드의 작업을 돕는 보조적인 역할 수행.
 * 	다른 쓰레드들이 모두 종료되면 자신도 종료된다.
 *   new 상태에서만 설정 가능하다.
 * */
public class Ex12_06_ThreadEx5 {
	public static void main(String[] args) {
		Thread t1 = new DaemonThread();
		Thread t2 = new DaemonThread();
		t1.setDaemon(true); 
		t2.setDaemon(true);
		t1.start();
		t2.start();
		try{
			Thread.sleep(1000);
			Thread.sleep(10);
		}catch(InterruptedException e){}
	}
	static class DaemonThread extends Thread{
		public void run(){
			while(true){
				System.out.println(getName());
				try{
					sleep(100);					
				}catch(InterruptedException e){}
			}
		}
		
	}	
}
//Thread-1
//Thread-0
//Thread-1
//Thread-0
//Thread-1
//Thread-0
//Thread-0
//Thread-1
//Thread-0
//Thread-1
//Thread-0
//Thread-1
//Thread-0
//Thread-1
//Thread-1
//Thread-0
//Thread-0
//Thread-1
//Thread-0
//Thread-1
//Thread-0
//Thread-1