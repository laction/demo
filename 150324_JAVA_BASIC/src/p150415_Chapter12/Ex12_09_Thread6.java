package p150415_Chapter12;

public class Ex12_09_Thread6 {
	public static void main(String[] args) {
		InterruptThread it = new InterruptThread();
		it.start();
		try{
			Thread.sleep(2000);
			it.interrupt();
		}catch(InterruptedException e){}		
	}

	static class InterruptThread extends Thread {
		public void run() {
			try {
				System.out.println("���� �ڴ� ���Դϴ�. ������ ������");
				sleep(((long)-1)>>>1);
			} catch (InterruptedException e) {	
				System.out.println("���� ���쳪��?");
			}
		}
	}
}
//���� �ڴ� ���Դϴ�. ������ ������
//���� ���쳪��?
