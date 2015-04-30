package p150415_Chapter12;
/* �����带 �̿��� 
 * [���� 1]
 * Ŭ���� �̸� SumThread
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
public class Ex12_11_SumThreadEx2 {
	public static void main(String[] args) throws Exception {
		SumThread t[]=new SumThread[5];
		int sum = 0 ;
		
		for(int i = 1; i < 1000; i+=200)	t[i/200]=new SumThread(i, i+200);		
		for(int i = 0 ; i < t.length ; i++)	t[i].start();		
		for(int i = 0 ; i < t.length ; i++){
			t[i].join();	sum+=t[i].sum;
		}
		System.out.println("�� : "+sum);
	}
	static class SumThread extends Thread{
		int begin,end;
		int sum;
		public SumThread(int begin,int end) {
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
