package p150420_Chapter14;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* FilterInputStream, FilterOutputStream 
 * : ������ ��Ʈ���� �����ϴ� ��Ʈ�� 
 * 
 * DataInputStream , DataOutputStream
 *  = > �����͸� �⺻������ �а� ���� �ִ� ��Ʈ�� 
 * */
public class Ex14_07_DataIOEx {
	public static void main(String[] args) throws FileNotFoundException,IOException{
		FileOutputStream fos = new FileOutputStream("sample.dat");
		DataOutputStream dos = new DataOutputStream(fos);
		dos.writeBoolean(true);
		dos.writeInt(1234);
		dos.writeChar('A');
		dos.writeDouble(123.45);
		System.out.println(dos.size() + "����Ʈ �ۼ�");
		dos.close(); fos.close();
		
		FileInputStream fis = new FileInputStream("sample.dat");
		DataInputStream dis = new DataInputStream(fis);
		
		System.out.println(dis.readBoolean());
		System.out.println(dis.readInt());
		System.out.println(dis.readChar());
		System.out.println(dis.readDouble());
		dis.close(); fis.close();
		
		byte [] b = new byte [200];
		fis = new FileInputStream("sample.dat");
		dis = new DataInputStream(fis);
		dis.read(b);
		System.out.println();
	}
}
//15����Ʈ �ۼ�
//true
//1234
//A
//123.45
//
