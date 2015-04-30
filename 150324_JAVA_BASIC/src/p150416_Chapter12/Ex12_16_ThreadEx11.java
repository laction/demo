package p150416_Chapter12;
/* wait(), notify(), notifyAll() �޼���
 * 1. ����ȭ ����(����ȭ ��, ����ȭ�޼���) ������ ����� ������.
 * 2. Object Ŭ������ ����޼���
 * 3. wait() : ���� �������� �����带 �����·� 
 * 					lock�� ������, notify(), notifyAll() �޼���� �����¿��� ������.
 * 		notify() : �������� ������ �� �Ѱ��� ���డ�� ���·�
 * 		notifiyAll() : �������� ������ ���θ� ���డ�ɻ��·�
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
			
			if(money > 0)	System.out.println("�ܾ� : "+money + "��");
					else			System.out.println("�ܾ��� �����մϴ�.");						
		}
	}
}
//mother,�ܾ� : 9000��
//mother,�ܾ� : 8000��
//son,�ܾ� : 7000��
//son,�ܾ� : 6000��
//mother,�ܾ� : 5000��
//mother,�ܾ� : 4000��
//son,�ܾ� : 3000��
//son,�ܾ� : 2000��
//mother,�ܾ� : 1000��
//mother,�ܾ��� �����մϴ�.
