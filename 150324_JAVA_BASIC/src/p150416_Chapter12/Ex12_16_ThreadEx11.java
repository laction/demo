package p150416_Chapter12;
/* wait(), notify(), notifyAll() 메서드
 * 1. 동기화 영역(동기화 블럭, 동기화메서드) 에서만 사용이 가능함.
 * 2. Object 클래스의 멤버메서드
 * 3. wait() : 현재 실행중인 쓰레드를 대기상태로 
 * 					lock도 해제함, notify(), notifyAll() 메서드로 대기상태에서 해제됨.
 * 		notify() : 대기상태의 쓰레드 중 한개를 실행가능 상태로
 * 		notifiyAll() : 대기상태의 쓰레드 전부를 실행가능상태로
 * */
public class Ex12_16_ThreadEx11 {
	static int num=0;
	public static void main(String[] args) throws InterruptedException {
		ATM atm = new ATM();
		new Thread(atm,"mother").start();
		new Thread(atm,"son").start();		
	}
	static class ATM implements Runnable{
		private long money = 10000;
		public void run(){			
				for(int i = 0; i<10; i++){
					synchronized (this) {		
						if(money <= 0) break;
						withDraw(1000);
						if(money == 2000 || money == 4000 || money == 6000 || money == 8000)
							try{wait();}
							catch(InterruptedException e){	e.printStackTrace();	}
						 else this.notify();
					}			
			}
		}
		public void withDraw(int m){
			money -= m;
			System.out.print(Thread.currentThread().getName() + ",");
			
			if(money > 0)	System.out.println("잔액 : "+money + "원");
					else			System.out.println("잔액이 부족합니다.");						
		}
	}
}
//mother,잔액 : 9000원
//mother,잔액 : 8000원
//son,잔액 : 7000원
//son,잔액 : 6000원
//mother,잔액 : 5000원
//mother,잔액 : 4000원
//son,잔액 : 3000원
//son,잔액 : 2000원
//mother,잔액 : 1000원
//mother,잔액이 부족합니다.
