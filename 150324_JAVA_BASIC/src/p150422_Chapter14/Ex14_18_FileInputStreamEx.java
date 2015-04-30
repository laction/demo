package p150422_Chapter14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex14_18_FileInputStreamEx {
	public static void main(String[] args) throws IOException{
		FileInputStream fis = new FileInputStream("data.txt");
		int data = 0;
		while((data=fis.read()) != -1)		// read() : 1����Ʈ �б�
			System.out.print((char)data);
		
		System.out.println();System.out.println();
		
			fis = new FileInputStream("data.txt");
		int len  = 0;
		byte[] buf = new byte[fis.available()];	// available() : �б� ������ ����
		while((len=fis.read(buf))!=-1)				// read(byte[]  buf) : buf�� ���������� ����, ���̸� ����. 
			System.out.print(new String(buf,0,len));
		
		System.out.println();System.out.println();
		
				fis = new FileInputStream("data.txt");
				len = 0;
				buf = new byte[120];
		while((len = fis.read(buf,1,119))!=-1)
				System.out.print(new String(buf,1,len));
	}
}
