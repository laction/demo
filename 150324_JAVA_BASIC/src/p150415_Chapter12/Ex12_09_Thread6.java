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
				System.out.println("지금 자는 중입니다. 깨우지 마세요");
				sleep(((long)-1)>>>1);
			} catch (InterruptedException e) {	
				System.out.println("누가 깨우나요?");
			}
		}
	}
}
//지금 자는 중입니다. 깨우지 마세요
//누가 깨우나요?
