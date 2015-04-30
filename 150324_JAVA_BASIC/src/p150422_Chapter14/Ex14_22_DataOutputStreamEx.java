package p150422_Chapter14;

import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* DataOutputStream : 보조스트림. 새로운 기능을 추가한 스트림
 * 									기본자료형으로 출력하는 기능.
 * DataInputStream : 보조 스트림. 기본자료형을 읽을 수 있는 기능을 가진 스트림.
 * 
 * DataOutputStream으로 출력된 내용을 DataInputStream으로 출력한 순서대로 읽어야 한다
 * */
 
public class Ex14_22_DataOutputStreamEx {
	public static void main(String[] args) throws IOException{
		FileOutputStream fos = new FileOutputStream("num.dat");
		DataOutputStream dos = new DataOutputStream(fos);
		for(int i = 0 ; i <= 100 ; i ++)
			dos.writeInt(i);
			// size() : 실제 출력된 크기를 리턴.
		System.out.println("크기 : "+dos.size());
		dos.flush(); dos.close(); fos.close();
		
		FileInputStream fis = new FileInputStream("num.dat");
		DataInputStream dis = new DataInputStream(fis);
		int sum = 0 ;
		int i = 0 ;
		try{
			while((i = dis.readInt())!=-1)
				sum += i;			
		}catch(EOFException e){
			System.out.println("sum="+sum);
		}
		fis.close(); dis.close();
	}
}
