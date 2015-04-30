package p150416_Chapter12;

import java.util.Date;

public class Ex12_18_Account {
	static Date tTime = new Date(new Date().getTime() + 1000*30);
	
	public static void main(String[] args) throws InterruptedException {
		Account account = new Account();
		new Mother(account).start();
		new Son(account).start();
		while(tTime.getTime()>new Date().getTime()){
			Thread.sleep(60);
		}
	}
	
	static class Account{
		int money ;
		static int inCnt = 0;
		static int outCnt = 0;
		synchronized void output(){
			while (money == 0)
			try {	wait();	}	catch (InterruptedException e) {	e.printStackTrace();	}
			money = 0;
			System.out.println(++outCnt+": 출금");
			notifyAll();				
		}
		synchronized void input(){
			
			while(money == 10000)
				try {	wait();	}	catch (InterruptedException e) {	e.printStackTrace();	}
			money = 10000;
			System.out.println(++inCnt+": 입금");
			notifyAll();			
		}
		
	}
	static class Mother extends Thread{
		private Account account;
		Mother(Account account){
			this.account = account;
		}
		@Override
		public void run() {
			for(int i = 0 ; i < 10 ; i ++){	
				account.input();	
				try {		sleep((int)(3000*Math.random()));	}
				catch (InterruptedException e) {	e.printStackTrace();		}							
			}
		}
	}
	static class Son extends Thread{
		private Account account;
		Son(Account account){
			this.account = account;
		}
		@Override	
		public void run() {
			for(int i = 0 ; i < 10 ; i++){			
				try {	sleep(100+(int)(400*Math.random())); } 
				catch (InterruptedException e) {	e.printStackTrace();	}
				account.output();				
			}
		}
	}
}
//1: 입금
//1: 출금
//2: 입금
//2: 출금
//3: 입금
//3: 출금
//4: 입금
//4: 출금
//5: 입금
//5: 출금
//6: 입금
//6: 출금
//7: 입금
//7: 출금
//8: 입금
//8: 출금
//9: 입금
//9: 출금
//10: 입금
//10: 출금

