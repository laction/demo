package p150415_Chapter12;
/* ���� : 1���� 100������ ���� ���ϴ� Thread�� �����ϱ�
 * SumThread Ŭ����
 * ������� : startNum = 1, endNum = 100, sum = 0;
 * ����޼��� : run()
 * 		��� : startNum ���� endNum ���� ���� ����;
 */
public class Ex12_07_SumThreadEx extends Thread{
	public static void main(String[] args) throws InterruptedException {		
		SumThread t1 = new SumThread(1,100);
		t1.start();		
		t1.join();		// t1�����尡 �����Ҷ� ����, ȣ���ڰ� �����.
		System.out.println(t1.startNum + "���� " + t1.endNum + "������ �� : "+t1.sum);
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
//1���� 100������ �� : 5050
