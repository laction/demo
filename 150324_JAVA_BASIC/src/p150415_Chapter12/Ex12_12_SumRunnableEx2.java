package p150415_Chapter12;

import java.util.HashMap;
import java.util.Map;

/* �����带 �̿��� 
 * [���� 1]
 * Ŭ���� �̸� SumRunnable
 * 1.Thread Ŭ������ ����Ͽ� �Ѱ��� �������带 Ŭ������ �����.
 * 2. �����ڴ� �������� 2���� �޾Ƽ� ��� ������ �ʱ�ȭ �Ѵ�.
 * 3. �μ� ���̱����� ���� ���ϴ� run �޼ҵ带 �����Ѵ�.
 * 4. 5���� �����带 �����ϰ�
 * 	ù��° ������ ������� 1���� 200������ ���� ���ϰ�,
 * 	�ι�° ������ ������� 201���� 400������ ���� ���ϰ�,
 * 		...
 * 	�ټ���° ������� 801���� 1000������ ���� ���ϵ��� �����.
 * 5. main�� ��� �����尡 �����ϱ⸦ ��ٸ��ٰ� ������ ���� ����Ͽ� ����Ѵ�.
 * */
public class Ex12_12_SumRunnableEx2 {
	public static void main(String[] args) throws Exception {
		Map<Thread,SumRunnable> map = new HashMap<Thread,SumRunnable>();
		Thread t[]=new Thread[5];
		SumRunnable r[] = new SumRunnable[5];
		int sum = 0 ;
		
		for(int i = 1; i < 1000; i+=200)	t[i/200]=new Thread((r[i/200]=new SumRunnable(i, i+200)));		
		for(int i = 0 ; i < t.length ; i++)	t[i].start();		
		for(int i = 0 ; i < t.length ; i++){
			t[i].join();	sum+=r[i].sum;
		}
		System.out.println("�� : "+sum);
	}
	static class SumRunnable implements Runnable{
		int begin,end;
		int sum;
		public SumRunnable(int begin,int end) {
			this.begin = begin; this.end = end;
		}
		@Override
		public void run() {
			for(int i = begin ; i <= end ; i ++)
				sum+=i;
		}
	}
}
//�� : 503505
