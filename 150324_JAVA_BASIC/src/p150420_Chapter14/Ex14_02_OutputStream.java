package p150420_Chapter14;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class Ex14_02_OutputStream {
	public static void main(String[] args) throws IOException{
//		OutputStream out = System.out;			// ����Ʈ ������ ����ϱ� ������, �����ڵ� ���ڰ� ������.
		Writer out = new OutputStreamWriter(System.out);
		out.write('a');		out.write('b');		out.write('c');		out.write(10);
		out.write('1');		out.write('2');		out.write('3');		out.write(10);
		out.write('��');		out.write('��');		out.write('��');		out.write(10);
		out.flush();		// ������ �����͸� �������� �ٷ� ���.
	}
}
//abc
//123
//������
