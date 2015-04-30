package p150420_Chapter14;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

import org.omg.CORBA.portable.InputStream;

/* 스트림 : 데이터 이동통로, 지연(버퍼)을 가짐.
 * 				바이트형은 1바이트, 문자형은 2바이트를 단위로 전송.
 *  종류   방식  
 * 입력  바이트	InputStream		; FileInputStream
 * 			문자형	Reader				: FileReader
 * 					바이트->문자형 : 	InputStreamReader(InputStream을 상속받은 Reader) 
 * 출력	바이트	OutputStream	: FileOutputStream
 * 			문자형	Writer				: FileWriter
 * 								OutputStreamReader
 *  				바이트->문자형 : 	OutputStreamWriter(OutputStream을 상속받은 Writer)
 *  	PrintStream : OutputStream을 상속 받음. System.out이 사용.
 *  
 *  // JspWriter : Jsp에서 사용하는 스트림.
 * */
public class Ex14_01_InputStream {
	public static void main(String[] args) throws IOException{
//		InputStream in = (InputStream) System.in;		// 바이트 단위로 내보내기 때문에 한글이 출력되지 않음.
		Reader in = new InputStreamReader(System.in);
		int data;
		while ( (data = in.read()) != -1){		// -1 : Ctrl + Z
			System.out.print((char)data);
		} 
	}	
}
//입력한 대로
//입력한 대로
//Ctrl+Z를 누르면 종료한다네요
//Ctrl+Z를 누르면 종료한다네요
