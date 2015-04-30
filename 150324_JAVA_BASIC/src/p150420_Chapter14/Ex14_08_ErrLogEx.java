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
			throw new Exception("예외 강제로 또또 발생");
		}catch (Exception e){
			PrintStream s = null;
			try {
//				s = new PrintStream("err.log");// 마지막 에러만 남음.				
																// 기존의 내용에 새로운 내용을 추가.
				FileOutputStream fos = new FileOutputStream("err.log",true);		// true 일때, append 기능.
				s = new PrintStream(fos);		
				
			} catch (FileNotFoundException e1) {	}	
			e.printStackTrace(s);
		}
	}
}
