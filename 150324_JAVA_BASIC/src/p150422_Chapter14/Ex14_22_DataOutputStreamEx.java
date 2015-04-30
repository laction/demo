package p150422_Chapter14;

import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* DataOutputStream : ������Ʈ��. ���ο� ����� �߰��� ��Ʈ��
 * 									�⺻�ڷ������� ����ϴ� ���.
 * DataInputStream : ���� ��Ʈ��. �⺻�ڷ����� ���� �� �ִ� ����� ���� ��Ʈ��.
 * 
 * DataOutputStream���� ��µ� ������ DataInputStream���� ����� ������� �о�� �Ѵ�
 * */
 
public class Ex14_22_DataOutputStreamEx {
	public static void main(String[] args) throws IOException{
		FileOutputStream fos = new FileOutputStream("num.dat");
		DataOutputStream dos = new DataOutputStream(fos);
		for(int i = 0 ; i <= 100 ; i ++)
			dos.writeInt(i);
			// size() : ���� ��µ� ũ�⸦ ����.
		System.out.println("ũ�� : "+dos.size());
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
