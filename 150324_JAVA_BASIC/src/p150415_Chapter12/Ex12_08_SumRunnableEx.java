package p150415_Chapter12;
/* ���� : 1���� 100������ ���� ���ϴ� Thread�� �����ϱ�
 * SumRunnable Ŭ����
 * ������� : startNum = 1, endNum = 100, sum = 0;
 * ����޼��� : run()
 * 		��� : startNum ���� endNum ���� ���� ����;
 */
public class Ex12_08_SumRunnableEx {
	public static void main(String[] args) throws InterruptedException {
		SumRunnable sr = new SumRunnable(1, 100);
		new Thread(sr).start();
//		Thread.sleep(100);
		System.out.println(sr.sum);
	}
	static class SumRunnable implements Runnable{
		int startNum;
		int endNum;
		int sum = 0 ;
		SumRunnable(int startNum, int endNum){
			this.startNum = startNum;
			this.endNum = endNum;
		}
		@Override
		public void run() {
			for(int i = startNum; i <= endNum ; i++ )
				sum+=i;
		}
	}
}
//0
