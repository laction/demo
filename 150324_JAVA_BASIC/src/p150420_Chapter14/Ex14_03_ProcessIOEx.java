package p150420_Chapter14;

import java.io.IOException;
/* ���μ����� ����� �ڹ����α׷��� ���
 * InputStream
 * 		int data = read() : 1byte�� �б�. �����͸� ����
 * 		int length = read(byte[] msg) : msg ũ�⸸ŭ �д´�. ���̸� ����. ���������� msg �迭�� ����.
 * 													length�� ���� ����Ʈ ���� ����.
 * */
public class Ex14_03_ProcessIOEx {
	public static void main(String[] args) throws IOException{
		Process p = Runtime.getRuntime().exec
				("ping localhost");
		byte[] msg = new byte[128];
		int len ; 
		// new String(msg,0,len) : msg 0�� �ε������� len ��ŭ ���ڿ���ü�� ����.
		while((len=p.getInputStream().read(msg))>0){
			System.out.println(new String(msg,0,len));
		}
	}
}
