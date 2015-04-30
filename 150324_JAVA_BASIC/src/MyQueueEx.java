
/* Queue �������̽��� �ۼ��϶�
	 *    boolean isEmpty();		// ť�� ������ ������ ���θ� ����
	 *    void add(int x);			// ť�� �������� ������ �߰�
	 *    int del();							// ť�� �������� ������ ����
	 * */
interface Queue{
		boolean isEmpty();		// ť�� ������ ������ ���θ� ����
		void add(int x);			// ť�� �������� ������ �߰�
		int del();						// ť�� �������� ������ ����
}


/* First-In-First-Out�� Ư���� ������ �ڷ� ���� ť�� �����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * ��� ���α׷��� ������ ���� ���� ������ ������.
 * 	�� ť�� �� �� �ִ� �ڷ�� ������ �����Ѵ�.
 *		�� ť�� 50���� ��Ҹ� ���� �迭�� �����Ѵ�.
 * 		ť���� 50�� �̻��� ��Ұ� ����� �� ���ٰ� �����Ѵ�.
 * 		50���� ������ ť�� �� �ִٴ� �޽����� ����ϰ� ���α׷� ����
 * 	�� �Ʒ��� ���ǵ� �������̽��� ����Ѵ�.
 *  		ť�� ����� �����͸� �Է��ϰ�, �Էµ� �����͸� ����ϴ� ����� �ִ�. 
 * 	�� ť�� ���� ����ִ����� �˻��ϴ� ����� �ִ�.
 * 		�����͸� ����� �� ť�� �����Ͱ� ������ �����Ͱ� ���ٴ� �޽����� ����ϰ� ���α׷� ����
 * 	�� �����Ͱ� �Էµǰų� ��µ� �� �޽����� ����Ѵ�.
 * */

public class MyQueueEx implements Queue {

	public static void main(String[] args) {
		MyQueueEx q = new MyQueueEx();
		
		for(int i = 0 ; i < 10 ; i ++)
			q.add((int)(100.0*Math.random()));
		
		q.add(120,9);
		q.view();
//		for(int i = 0 ; i < 51; i++)
//			q.del();
//		q.view();
	}
	
	
	final static int length = 50;
	int [] e = new int [length];
	int cnt = 0 ;	
	int tail = 0 ;
	
	@Override
	public void add(int x) {
			add(x,cnt);
	}
	public void add(int x, int idx){
		if(cnt>=50) { 
			System.out.println("ť�� ����");
			System.exit(0);
		}else{
			System.out.println(x+ " �Է�.");
		
			if (idx >= cnt)	e[cnt] = x;
			else {					
				for(int i = idx ; i < cnt; i++)
					e[i+1] = e[i];
				e[idx] = x;
			}
		}
		cnt++;
	}
	@Override
	public int del() {
		int output = e[0];
		if(cnt<=0){
			System.out.println("ť�� �������");
			System.exit(0);
		}
		for(int i = 0 ; i < cnt-1 ; i++){
			e[i] = e[i+1];
		}
		cnt--;
		System.out.println(output + " ���.");
		return output;
	}
	@Override	public boolean isEmpty() {				return cnt<=0;		}
	void view () {	
		for(int i = 0 ; i < cnt ; i ++)
			System.out.print(String.format("%4.0f"+((i%10==9)?"\n":""),(double)e[i]));
	}
	
	
}