package p150415_Chapter12;
// Thread 클래스를 상속 받아 쓰레드 생성 예제
/* 1. new 상태 : start가 실행되기 전 메모리 할당만 된 상태.
 * 2. Runnable 상태 : 쓰레드로서 실행을 시작했지만, 다른 쓰레드의 실행을 양보함으로서 일시중지된 상태.
 * 							( 쓰레드들의 실행여부는 스케쥴러에 의해 관리된다.)
 * 3. Running 상태 : start 후 쓰레드로서 실행되는 상태. 병렬쓰레드 중의 하나로서 대체로 최선의 상태로 실행되지 않는다.
 * 4. Wait 상태 : sleep()함수로 Running 중 일정시간 동안 강제로 대기되는 상태.
 * 5. Dead 상태 : 쓰레드가 종료.
 */
/* 프로세스 스택을 병렬화 함.
 * 각 run() 메서드를 호출.
 * 
 * */		
public class Ex12_02_ThreadEx1 {
	final static int THREAD_CNT = 3;	
	public static void main(String[] args) {		
		for(int i =0; i < THREAD_CNT ; i++)
			new MyThread(i+1).start();		
		System.out.println("main 메서드 종료");
		System.out.flush();
	}
	static class MyThread extends Thread {
		final int num;
		MyThread(int num){this.num = num;}
		@Override
		public void run(){
			try {
				sleep(num*100);
				for( int i  = 0 ; i < 3; i ++){
					System.out.print(getName()+"("+num+")");
					if(num==THREAD_CNT) System.out.println();
					sleep(1000);					
				}				
				System.out.flush();
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}			
		}
	}
}
//main 메서드 종료
//Thread-0(1)Thread-1(2)Thread-2(3)
//Thread-0(1)Thread-1(2)Thread-2(3)
//Thread-0(1)Thread-1(2)Thread-2(3)