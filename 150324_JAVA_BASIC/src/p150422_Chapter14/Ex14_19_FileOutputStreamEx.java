package p150422_Chapter14;

import java.io.FileOutputStream;
import java.io.IOException;

public class Ex14_19_FileOutputStreamEx {
	public static void main(String[] args) throws IOException{
		FileOutputStream fos = new FileOutputStream("output.txt");
		fos.write('A');fos.write('B');fos.write('C');fos.write(10);
		fos.write('1');fos.write('2');fos.write('3');fos.write(10);
		fos.write('��');fos.write('��');fos.write('��');fos.write(10);
		
		fos.write('\n');					// ���� ��ü�� ���.
		String src = "ABC123������";
		byte [] buf = src.getBytes();		// ���ڿ��� byte[]�� ��ȯ
		fos.write(buf);fos.write('\n');
		fos.write(buf,0,buf.length);
	}
}
