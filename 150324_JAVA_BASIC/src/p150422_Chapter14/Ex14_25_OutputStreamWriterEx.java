package p150422_Chapter14;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
/* OutputStreamWriter : ����Ʈ�� ��½�Ʈ�� => ������ ��� ��Ʈ������ ��ȯ
 * */
public class Ex14_25_OutputStreamWriterEx {
	public static void main(String[] args) throws IOException{
//		OutputStream sysout = System.out;
		Writer sysout = new OutputStreamWriter(System.out);
		sysout.write('��');		sysout.write('��');		sysout.write('��');
		sysout.flush();
	}
}
