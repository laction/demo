package p150415_Chapter12;

import java.util.ArrayList;

// 쓰레드 우선순위 예제
public class Ex12_04_ThreadEx3 {
	
	static int record [][] = new int [32][3];
	static int cnt = 0;
	static int sum[] = new int []{0,0,0};
	
	public static void main(String[] args) {
		System.out.println("최소 = "+Thread.MIN_PRIORITY);
		System.out.println("중간 = "+Thread.NORM_PRIORITY);
		System.out.println("최대 = "+Thread.MAX_PRIORITY);
		System.out.println();	 
		
		
		for(int idx = 0 ; idx< 10; idx++){
			try{
				for (int i = 0 ; i < 32 ; i++){
					Thread t2 = new ThreadPriority(2,i);
					Thread t5 = new ThreadPriority(i);
					Thread t10 = new ThreadPriority(10,i);
					t2.start();
					t5.start();
					t10.start();
					Thread.sleep(10);
				}
			}catch(InterruptedException e){}
					
			
			for(int i = 0 ; i < 32; i++){
				//System.out.println(record[i][0]+"  "+record[i][1]+"  "+record[i][2]);
				sum[0]+=record[i][0];	sum[1]+=record[i][1];	sum[2]+=record[i][2];
			}
		}
		 for(int i = 0 ; i < 3; i ++)
		 System.out.println(sum[i]+ "           ");
	}
	static class ThreadPriority extends Thread{
		final int FINAL_ROUND = 0xff;
		volatile int calc = 0;
		final int order;
		public ThreadPriority(int order) {this.order = order;}
		ThreadPriority(int priority,int order){	
			setPriority(priority);
			this.order = order;
		}
		@Override
		public void run(){
			try{
				for(int i = 0 ; i < FINAL_ROUND ; i++)
					for( int j = 0 ; j < FINAL_ROUND ; j++)
						calc++;
				
				//System.out.println(this);
				//System.out.flush();
				record[order][cnt++] = this.getPriority();
				cnt %=3;
			}	catch(Exception e){}
		}
	}
}

//최소 = 1
//중간 = 5
//최대 = 10

