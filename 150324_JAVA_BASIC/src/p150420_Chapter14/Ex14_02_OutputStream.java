package p150420_Chapter14;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class Ex14_02_OutputStream {
	public static void main(String[] args) throws IOException{
//		OutputStream out = System.out;			// 바이트 단위로 출력하기 때문에, 유니코드 문자가 깨진다.
		Writer out = new OutputStreamWriter(System.out);
		out.write('a');		out.write('b');		out.write('c');		out.write(10);
		out.write('1');		out.write('2');		out.write('3');		out.write(10);
		out.write('가');		out.write('나');		out.write('다');		out.write(10);
		out.flush();		// 버퍼의 데이터를 목적지에 바로 출력.
	}
}
//abc
//123
//가나다
