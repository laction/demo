package p150415_Chapter12;
// ���� ������.
/* 	�Ϲ� �������� �۾��� ���� �������� ���� ����.
 * 	�ٸ� ��������� ��� ����Ǹ� �ڽŵ� ����ȴ�.
 *   new ���¿����� ���� �����ϴ�.
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