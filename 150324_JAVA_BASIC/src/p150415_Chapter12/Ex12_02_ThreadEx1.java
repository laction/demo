package p150415_Chapter12;
// Thread Ŭ������ ��� �޾� ������ ���� ����
/* 1. new ���� : start�� ����Ǳ� �� �޸� �Ҵ縸 �� ����.
 * 2. Runnable ���� : ������μ� ������ ����������, �ٸ� �������� ������ �纸�����μ� �Ͻ������� ����.
 * 							( ��������� ���࿩�δ� �����췯�� ���� �����ȴ�.)
 * 3. Running ���� : start �� ������μ� ����Ǵ� ����. ���ľ����� ���� �ϳ��μ� ��ü�� �ּ��� ���·� ������� �ʴ´�.
 * 4. Wait ���� : sleep()�Լ��� Running �� �����ð� ���� ������ ���Ǵ� ����.
 * 5. Dead ���� : �����尡 ����.
 */
/* ���μ��� ������ ����ȭ ��.
 * �� run() �޼��带 ȣ��.
 * 
 * */		
public class Ex12_02_ThreadEx1 {
	final static int THREAD_CNT = 3;	
	public static void main(String[] args) {		
		for(int i =0; i < THREAD_CNT ; i++)
			new MyThread(i+1).start();		
		System.out.println("main �޼��� ����");
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
//main �޼��� ����
//Thread-0(1)Thread-1(2)Thread-2(3)
//Thread-0(1)Thread-1(2)Thread-2(3)
//Thread-0(1)Thread-1(2)Thread-2(3)