package p150422_Chapter14;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Date;

/* PrintStream : autoFlush ��ɰ�, ����ó���� ���� �ʵ��� ������ ������ ��Ʈ��
 * 							OutputStream�� ���� Ŭ����.
 * */
public class Ex14_23_PrinttStreamEx {
	public static void main(String[] args) throws FileNotFoundException{
//		OutputStream fos = System.out;
		FileOutputStream fos = new FileOutputStream("printStream.txt");
		PrintStream ps = new PrintStream(fos);
		ps.println("�ȳ��ϼ���");
		ps.println("�ݰ����ϴ�");
		ps.println("�� ������ printStream.txt �Դϴ�.");
		ps.println();
		ps.println(123);
		ps.println(true);
		ps.println(new Date());
		ps.printf("%tF%n",  new Date());
		ps.printf("%tY-%tm-%td", new Date(), new Date(),new Date());
	}
}