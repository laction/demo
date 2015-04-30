package p150422_Chapter14;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/* InputStreamReader : 바이트형입력스트림 => 문자형 입력스트림으로 전환
 * */
public class Ex14_24_InputStreamReaderEx {
	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("data.txt");
		int data = 0;
		while((data = fis.read())!= -1)
			System.out.print((char)data);
		
		System.out.println();System.out.println();
		// InputStreamReader 클래스를 이용하여 한글 잘나오도록 수정
		Reader r = new InputStreamReader(new FileInputStream("data.txt"));
		data = 0;
		while((data = r.read())!= -1)
			System.out.print((char)data);
		
		System.out.println();System.out.println();
		
		r = new InputStreamReader(System.in);
		data = 0;
		while((data = r.read())!= -1)
			System.out.print((char)data);
		
		System.out.println();System.out.println();
		
		// ipconfig 프로세스에서 전달해준 내용을 화면 출력하기
		Process p = Runtime.getRuntime().exec("ipconfig");
		r = new InputStreamReader( p.getInputStream());
		while( (data = r.read()) !=-1 )
			System.out.print((char)data);
		
	}

}
