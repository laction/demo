package p150421_Chapter14;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

// PrintStream����
/* PrintStream -> BuffedOutputStream -> FileOutputStream
 * 		������ ���		���� ����							���� ���� 
 * */
public class Ex14_10_PrintStreamEx {
	public static void main(String[] args) throws FileNotFoundException,IOException{
		FileOutputStream fos = new FileOutputStream("printStream.txt",true);
		BufferedOutputStream bos  = new BufferedOutputStream(fos);
		PrintStream ps = new PrintStream(bos,true);	// true : auto flush(������ �������� ����). 
		ps.println("ȫ�浿"); ps.println("1234");
		ps.println(true);	ps.println('a');			// DataOutputStream�� �ٸ���, ��� �������·� ��� 
	}
}
