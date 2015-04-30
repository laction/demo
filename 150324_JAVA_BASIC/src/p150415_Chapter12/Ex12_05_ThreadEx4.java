package p150415_Chapter12;
/*
 * ThreadGroup 예제 : 관련 있는 Thread를 그룹화 함
 */

public class Ex12_05_ThreadEx4 {
   public static void main(String[] args) {
      ThreadGroup tg = new ThreadGroup("Group1");
      ThreadGroup tg2 = new ThreadGroup("Group2");
      Thread t1 = new MyThread(tg, "First");
      Thread t2 = new MyThread(tg, "Second");
      Thread t3 = new MyThread(tg, "Third");
//      Thread t4 = new MyThread(Thread.currentThread().getThreadGroup(),"Fourth");
      Thread t4 = new MyThread(tg2,"Fourth");
      t1.start();   t2.start();   t3.start(); t4.start();
      tg.list();
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      tg.stop();
      try {
          Thread.sleep(2000);
       } catch (InterruptedException e) {
          e.printStackTrace();
       }
      tg2.stop();
   }
   static class MyThread extends Thread{
	   MyThread(ThreadGroup tg, String name) {
	      super(tg,name);
	   }
	   public void run(){
	      while(true){
	         try {
	            sleep(400);
	         } catch (InterruptedException e) {
	            e.printStackTrace();
	         }
	         System.out.println(getName());
	      }
	   }
	}
}
//java.lang.ThreadGroup[name=Group1,maxpri=10]
//	    Thread[First,5,Group1]
//	    Thread[Second,5,Group1]
//	    Thread[Third,5,Group1]
//	Third
//	Second
//	Fourth
//	First
//	Third
//	Second
//	Fourth
//	First
//	Fourth
//	Fourth
//	Fourth
//	Fourth
//	Fourth
