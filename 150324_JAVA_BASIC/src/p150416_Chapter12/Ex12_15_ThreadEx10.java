package p150416_Chapter12;

public class Ex12_15_ThreadEx10 {
	public static void main(String[] args) {
		Printer ptr = new Printer();	// 공유객체 : 모든 쓰레드가 공유하고 있는 객체. 동기화 메서드를 보유.
		new PrintThread(ptr,'A').start();
		new PrintThread(ptr,'B').start();
		new PrintThread(ptr,'C').start();
	}
	static class PrintThread extends Thread{
		Printer ptr = new Printer();
		char ch ;
		PrintThread(Printer ptr ,char ch){
			this.ptr = ptr;
			this.ch = ch ;
		}
		public void run() {
			for(int i = 1 ; i <= 10 ; i ++)
				//ptr.printChar(ch);
				printChar(ch);
		}
		static synchronized void printChar(char ch){	// 공유 메서드 : 모든 쓰레드가 공유하고있는 메서드.
			for(int i = 1 ; i < 40 ; i++)
				System.out.print(ch);
			System.out.println();
		}
	}
	static class Printer {
		synchronized void printChar(char ch){
			for(int i = 1 ; i < 40 ; i++)
				System.out.print(ch);
			System.out.println();
		}
	}
}
//AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
//CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC
//CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC
//CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC
//CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC
//CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC
//CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC
//CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC
//CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC
//CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC
//CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC
//BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB
//BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB
//BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB
//BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB
//BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB
//BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB
//BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB
//BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB
//BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB
//BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB
//AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
//AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
//AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
//AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
//AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
//AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
//AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
//AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
//AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
