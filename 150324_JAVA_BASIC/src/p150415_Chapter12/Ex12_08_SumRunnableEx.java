package p150415_Chapter12;
/* 문제 : 1부터 100까지의 합을 구하는 Thread를 생성하기
 * SumRunnable 클래스
 * 멤버변수 : startNum = 1, endNum = 100, sum = 0;
 * 멤버메서드 : run()
 * 		기능 : startNum 부터 endNum 까지 합을 구함;
 */
public class Ex12_08_SumRunnableEx {
	public static void main(String[] args) throws InterruptedException {
		SumRunnable sr = new SumRunnable(1, 100);
		new Thread(sr).start();
//		Thread.sleep(100);
		System.out.println(sr.sum);
	}
	static class SumRunnable implements Runnable{
		int startNum;
		int endNum;
		int sum = 0 ;
		SumRunnable(int startNum, int endNum){
			this.startNum = startNum;
			this.endNum = endNum;
		}
		@Override
		public void run() {
			for(int i = startNum; i <= endNum ; i++ )
				sum+=i;
		}
	}
}
//0
