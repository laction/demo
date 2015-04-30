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
			System.out.println(++outCnt+": ���");
			notifyAll();				
		}
		synchronized void input(){
			
			while(money == 10000)
				try {	wait();	}	catch (InterruptedException e) {	e.printStackTrace();	}
			money = 10000;
			System.out.println(++inCnt+": �Ա�");
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
//1: �Ա�
//1: ���
//2: �Ա�
//2: ���
//3: �Ա�
//3: ���
//4: �Ա�
//4: ���
//5: �Ա�
//5: ���
//6: �Ա�
//6: ���
//7: �Ա�
//7: ���
//8: �Ա�
//8: ���
//9: �Ա�
//9: ���
//10: �Ա�
//10: ���

