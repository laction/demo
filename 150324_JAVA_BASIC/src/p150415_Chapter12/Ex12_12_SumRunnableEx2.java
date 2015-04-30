package p150415_Chapter12;

import java.util.HashMap;
import java.util.Map;

/* 쓰레드를 이용해 
 * [문제 1]
 * 클래스 이름 SumRunnable
 * 1.Thread 클래스를 상속하여 한개의 ㅅ쓰레드를 클래스로 만든다.
 * 2. 생성자는 정수값을 2개를 받아서 멤버 변수를 초기화 한다.
 * 3. 두수 사이까지의 합을 구하는 run 메소드를 구현한다.
 * 4. 5개의 스레드를 생성하고
 * 	첫번째 생성한 쓰레드는 1에서 200까지의 합을 구하고,
 * 	두번째 생성한 쓰레드는 201에서 400까지의 합을 구하고,
 * 		...
 * 	다섯번째 쓰레드는 801에서 1000까지의 합을 구하도록 만든다.
 * 5. main은 모든 쓰레드가 종료하기를 기다리다가 종료후 합을 계산하여 출력한다.
 * */
public class Ex12_12_SumRunnableEx2 {
	public static void main(String[] args) throws Exception {
		Map<Thread,SumRunnable> map = new HashMap<Thread,SumRunnable>();
		Thread t[]=new Thread[5];
		SumRunnable r[] = new SumRunnable[5];
		int sum = 0 ;
		
		for(int i = 1; i < 1000; i+=200)	t[i/200]=new Thread((r[i/200]=new SumRunnable(i, i+200)));		
		for(int i = 0 ; i < t.length ; i++)	t[i].start();		
		for(int i = 0 ; i < t.length ; i++){
			t[i].join();	sum+=r[i].sum;
		}
		System.out.println("값 : "+sum);
	}
	static class SumRunnable implements Runnable{
		int begin,end;
		int sum;
		public SumRunnable(int begin,int end) {
			this.begin = begin; this.end = end;
		}
		@Override
		public void run() {
			for(int i = begin ; i <= end ; i ++)
				sum+=i;
		}
	}
}
//값 : 503505
