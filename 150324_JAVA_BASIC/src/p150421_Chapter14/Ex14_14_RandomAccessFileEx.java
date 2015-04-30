package p150421_Chapter14;

import java.io.IOException;
import java.io.RandomAccessFile;

/* RandomAccessFile ����
 *  : ���Ͽ� ������ �а� ���� �ִ� ����� ���� Ŭ����
 * */
public class Ex14_14_RandomAccessFileEx {
	public static void main(String[] args) throws IOException{
		RandomAccessFile ra = new RandomAccessFile("random.txt","rw");
		String receive = "hello";
		ra.seek(ra.length());		// Ŀ���� �ǳ����� 
		ra.write(receive.getBytes());
		byte buf[] = new byte[(int)ra.length()];
		ra.seek(0);			// ������ ó������ Ŀ���� �̵�
		ra.read(buf);			//  buf ũ�⸸ŭ �б�
		System.out.println("ó�� ���� ���� : "+new String(buf));
		ra.seek(0); ra.read(buf);
		System.out.println("�ٽ� ���� ���� : "+new String(buf));
		if(ra != null) ra.close();
	}
}
