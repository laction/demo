package p150422_Chapter14;

import java.io.FileReader;
import java.io.IOException;

public class Ex14_20_FileReaderEx {
	public static void main(String[] args) throws IOException{
		FileReader fr = new FileReader("data.txt");
		int data = 0 ;
		while((data = fr.read()) != -1)	// read() : 한문자(1char,2byte)씩 읽는 메서드.
			System.out.print((char)data);
		
		System.out.println();System.out.println();
		
		fr = new FileReader("data.txt");
		int len;
		char [] buf = new char[100];
		while((len = fr.read(buf)) !=  -1)
			System.out.print(new String(buf,0,len));
		
		System.out.println();System.out.println();
		
		fr = new FileReader("data.txt");
		while((len = fr.read(buf,1,99)) !=  -1)
			System.out.print(new String(buf,1,len));
	}
}
