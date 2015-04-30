package p150415_Chapter12;
// Runnable �������̽��� �����ϴ� ������� Thread ����
/* 1. ����Ŭ������ ���ؼ�  Runnable ��ü�� ����.
 * 2.  Thread ��ü�� ������ ���� ����Ŭ���� ��ü�� �����ڸ� ���ؼ� Thread ��ü�� ����.
 * 		=> ����Ŭ������ run() �޼��带 Thread�� run() �޼���� ������.
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
