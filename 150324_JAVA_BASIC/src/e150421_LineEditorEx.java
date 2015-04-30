import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;


/* 커맨드로부터 입력받은 파일명의 파일에 args에 값이 없으면noname.txt파일에 저장하기.
 * 키보드로부터 입력받은 내용을 저장하는 프로그램 작성하기.
 * Scanner 사용하지 말기.
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
		}catch(Exception e){ System.out.println("프로그램 종료");}
		
		fo.close();
		dos.close();
		r.close();
	}
}
