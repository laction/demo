package p150420_Chapter14;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

import org.omg.CORBA.portable.InputStream;

/* ��Ʈ�� : ������ �̵����, ����(����)�� ����.
 * 				����Ʈ���� 1����Ʈ, �������� 2����Ʈ�� ������ ����.
 *  ����   ���  
 * �Է�  ����Ʈ	InputStream		; FileInputStream
 * 			������	Reader				: FileReader
 * 					����Ʈ->������ : 	InputStreamReader(InputStream�� ��ӹ��� Reader) 
 * ���	����Ʈ	OutputStream	: FileOutputStream
 * 			������	Writer				: FileWriter
 * 								OutputStreamReader
 *  				����Ʈ->������ : 	OutputStreamWriter(OutputStream�� ��ӹ��� Writer)
 *  	PrintStream : OutputStream�� ��� ����. System.out�� ���.
 *  
 *  // JspWriter : Jsp���� ����ϴ� ��Ʈ��.
 * */
public class Ex14_01_InputStream {
	public static void main(String[] args) throws IOException{
//		InputStream in = (InputStream) System.in;		// ����Ʈ ������ �������� ������ �ѱ��� ��µ��� ����.
		Reader in = new InputStreamReader(System.in);
		int data;
		while ( (data = in.read()) != -1){		// -1 : Ctrl + Z
			System.out.print((char)data);
		} 
	}	
}
//�Է��� ���
//�Է��� ���
//Ctrl+Z�� ������ �����Ѵٳ׿�
//Ctrl+Z�� ������ �����Ѵٳ׿�
