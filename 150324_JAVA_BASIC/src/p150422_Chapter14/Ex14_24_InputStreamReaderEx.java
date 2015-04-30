package p150422_Chapter14;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/* InputStreamReader : ����Ʈ���Է½�Ʈ�� => ������ �Է½�Ʈ������ ��ȯ
 * */
public class Ex14_24_InputStreamReaderEx {
	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("data.txt");
		int data = 0;
		while((data = fis.read())!= -1)
			System.out.print((char)data);
		
		System.out.println();System.out.println();
		// InputStreamReader Ŭ������ �̿��Ͽ� �ѱ� �߳������� ����
		Reader r = new InputStreamReader(new FileInputStream("data.txt"));
		data = 0;
		while((data = r.read())!= -1)
			System.out.print((char)data);
		
		System.out.println();System.out.println();
		
		r = new InputStreamReader(System.in);
		data = 0;
		while((data = r.read())!= -1)
			System.out.print((char)data);
		
		System.out.println();System.out.println();
		
		// ipconfig ���μ������� �������� ������ ȭ�� ����ϱ�
		Process p = Runtime.getRuntime().exec("ipconfig");
		r = new InputStreamReader( p.getInputStream());
		while( (data = r.read()) !=-1 )
			System.out.print((char)data);
		
	}

}
