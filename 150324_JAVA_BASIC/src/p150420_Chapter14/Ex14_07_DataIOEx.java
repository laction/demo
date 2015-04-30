package p150420_Chapter14;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* FilterInputStream, FilterOutputStream 
 * : 기존의 스트림을 변형하는 스트림 
 * 
 * DataInputStream , DataOutputStream
 *  = > 데이터를 기본형으로 읽고 쓸수 있는 스트림 
 * */
public class Ex14_07_DataIOEx {
	public static void main(String[] args) throws FileNotFoundException,IOException{
		FileOutputStream fos = new FileOutputStream("sample.dat");
		DataOutputStream dos = new DataOutputStream(fos);
		dos.writeBoolean(true);
		dos.writeInt(1234);
		dos.writeChar('A');
		dos.writeDouble(123.45);
		System.out.println(dos.size() + "바이트 작성");
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
//15바이트 작성
//true
//1234
//A
//123.45
//
