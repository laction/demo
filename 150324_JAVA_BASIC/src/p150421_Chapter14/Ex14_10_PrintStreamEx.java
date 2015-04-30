package p150421_Chapter14;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

// PrintStream예제
/* PrintStream -> BuffedOutputStream -> FileOutputStream
 * 		문자형 출력		버퍼 제공							파일 쓰기 
 * */
public class Ex14_10_PrintStreamEx {
	public static void main(String[] args) throws FileNotFoundException,IOException{
		FileOutputStream fos = new FileOutputStream("printStream.txt",true);
		BufferedOutputStream bos  = new BufferedOutputStream(fos);
		PrintStream ps = new PrintStream(bos,true);	// true : auto flush(강제로 목적지에 전송). 
		ps.println("홍길동"); ps.println("1234");
		ps.println(true);	ps.println('a');			// DataOutputStream과 다르게, 모두 문자형태로 출력 
	}
}
