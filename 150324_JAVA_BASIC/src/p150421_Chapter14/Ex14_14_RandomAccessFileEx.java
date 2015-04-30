package p150421_Chapter14;

import java.io.IOException;
import java.io.RandomAccessFile;

/* RandomAccessFile 연습
 *  : 파일에 내용을 읽고 쓸수 있는 기능을 가진 클래스
 * */
public class Ex14_14_RandomAccessFileEx {
	public static void main(String[] args) throws IOException{
		RandomAccessFile ra = new RandomAccessFile("random.txt","rw");
		String receive = "hello";
		ra.seek(ra.length());		// 커서를 맨끝으로 
		ra.write(receive.getBytes());
		byte buf[] = new byte[(int)ra.length()];
		ra.seek(0);			// 파일의 처음으로 커서를 이동
		ra.read(buf);			//  buf 크기만큼 읽기
		System.out.println("처음 읽은 내용 : "+new String(buf));
		ra.seek(0); ra.read(buf);
		System.out.println("다시 읽은 내용 : "+new String(buf));
		if(ra != null) ra.close();
	}
}
