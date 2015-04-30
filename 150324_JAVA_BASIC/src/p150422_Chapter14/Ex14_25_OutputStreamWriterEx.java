package p150422_Chapter14;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
/* OutputStreamWriter : 바이트형 출력스트림 => 문자형 출력 스트림으로 전환
 * */
public class Ex14_25_OutputStreamWriterEx {
	public static void main(String[] args) throws IOException{
//		OutputStream sysout = System.out;
		Writer sysout = new OutputStreamWriter(System.out);
		sysout.write('가');		sysout.write('나');		sysout.write('다');
		sysout.flush();
	}
}
