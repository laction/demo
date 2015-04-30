package p150422_Chapter14;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Date;

/* PrintStream : autoFlush 기능과, 예외처리를 하지 않도록 성능을 개선한 스트림
 * 							OutputStream의 하위 클래스.
 * */
public class Ex14_23_PrinttStreamEx {
	public static void main(String[] args) throws FileNotFoundException{
//		OutputStream fos = System.out;
		FileOutputStream fos = new FileOutputStream("printStream.txt");
		PrintStream ps = new PrintStream(fos);
		ps.println("안녕하세요");
		ps.println("반갑습니다");
		ps.println("이 파일은 printStream.txt 입니다.");
		ps.println();
		ps.println(123);
		ps.println(true);
		ps.println(new Date());
		ps.printf("%tF%n",  new Date());
		ps.printf("%tY-%tm-%td", new Date(), new Date(),new Date());
	}
}