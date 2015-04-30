package p150422_Chapter14;

import java.io.FileWriter;
import java.io.IOException;

public class Ex14_21_FileWriterEx {
	public static void main(String[] args) throws IOException{
		FileWriter fw = new FileWriter("writer.txt");
		// write(int ) : 2바이트 출력
		fw.write('A');		fw.write('B');		fw.write('C');		fw.write(10);
		fw.write('1');		fw.write('2');		fw.write('3');		fw.write(10);
		fw.write('가');	fw.write('나');	fw.write('다');	fw.write(10);
		fw.flush();
		// write(char[]) 
		fw.write('\n');	fw.write('\n');
		String src = "ABC123가나다";
		char[] buf = src.toCharArray();
		fw.write(buf);
		fw.write('\n');
		fw.write(buf,0,buf.length-1);
		fw.flush();
		fw.close();
	}
}
