import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;


/* Ŀ�ǵ�κ��� �Է¹��� ���ϸ��� ���Ͽ� args�� ���� ������noname.txt���Ͽ� �����ϱ�.
 * Ű����κ��� �Է¹��� ������ �����ϴ� ���α׷� �ۼ��ϱ�.
 * Scanner ������� ����.
 * */
public class e150421_LineEditorEx {
	public static void main(String[] args) throws IOException {
		File f;		
		try{			f = new File(args[0]);		}
		catch(ArrayIndexOutOfBoundsException e ){	f = new File("noname.txt");	}
		
		FileOutputStream fo = new FileOutputStream(f,true);		
		DataOutputStream dos = new DataOutputStream(fo);
		
		InputStream r = System.in;		
		try{
			byte[] buf = new byte[100];
			int data=0;
			while((data= r.read(buf)) !=-1)	{				
				dos.write(buf, 0, data);
			}
		}catch(Exception e){ System.out.println("���α׷� ����");}
		
		fo.close();
		dos.close();
		r.close();
	}
}
