package p150420_Chapter14;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Ex14_08_ErrLogEx {
	public static void main(String[] args) {
		method1();
	}
	private static void method1(){
		method2();
	}
	private static void method2(){
		try{
			throw new Exception("���� ������ �Ƕ� �߻�");
		}catch (Exception e){
			PrintStream s = null;
			try {
//				s = new PrintStream("err.log");// ������ ������ ����.				
																// ������ ���뿡 ���ο� ������ �߰�.
				FileOutputStream fos = new FileOutputStream("err.log",true);		// true �϶�, append ���.
				s = new PrintStream(fos);		
				
			} catch (FileNotFoundException e1) {	}	
			e.printStackTrace(s);
		}
	}
}
