package p150415_Chapter12;
/* yield() : ������ �ٸ� �����忡�� �纸�ϴ� ���
 *  */
public class Ex12_10_Thread7 {
	public static void main(String[] args) {
		new YieldThread('A').start();
		new YieldThread('B').start();
	}
	static class YieldThread extends Thread{
		char ch ;
		YieldThread(char ch){
			this.ch = ch;			
		}
		@Override
		public void run() {
			for(int i = 0 ; i < 20 ; i++){
				System.out.print(ch);
				yield();
			}			
		}
	}
}
//BAAAAAAAABAAAAAAAAAAAABBBBBBBBBBBBBBBBBB