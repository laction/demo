package p150422_Chapter14;

import java.io.FileWriter;
import java.io.IOException;

public class Ex14_21_FileWriterEx {
	public static void main(String[] args) throws IOException{
		FileWriter fw = new FileWriter("writer.txt");
		// write(int ) : 2����Ʈ ���
		fw.write('A');		fw.write('B');		fw.write('C');		fw.write(10);
		fw.write('1');		fw.write('2');		fw.write('3');		fw.write(10);
		fw.write('��');	fw.write('��');	fw.write('��');	fw.write(10);
		fw.flush();
		// write(char[]) 
		fw.write('\n');	fw.write('\n');
		String src = "ABC123������";
		char[] buf = src.toCharArray();
		fw.write(buf);
		fw.write('\n');
		fw.write(buf,0,buf.length-1);
		fw.flush();
		fw.close();
	}
}
