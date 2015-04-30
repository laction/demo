package p150415_Chapter12;
/* 문제 : 1부터 100까지의 합을 구하는 Thread를 생성하기
 * SumThread 클래스
 * 멤버변수 : startNum = 1, endNum = 100, sum = 0;
 * 멤버메서드 : run()
 * 		기능 : startNum 부터 endNum 까지 합을 구함;
 */
public class Ex12_07_SumThreadEx extends Thread{
	public static void main(String[] args) throws InterruptedException {		
		SumThread t1 = new SumThread(1,100);
		t1.start();		
		t1.join();		// t1쓰레드가 종료할때 까지, 호출자가 대기함.
		System.out.println(t1.startNum + "부터 " + t1.endNum + "까지의 합 : "+t1.sum);
	}
	static class SumThread extends Thread{
		int startNum;
		int endNum;
		int sum = 0;
		
		public SumThread(int startNum,int endNum) {
			this.startNum = startNum ; this.endNum = endNum;			
		}
		@Override
		public void run() {
			for(int i = startNum ; i<=endNum ; i++)
				sum+=i;
		}
	}	
}
//1부터 100까지의 합 : 5050
