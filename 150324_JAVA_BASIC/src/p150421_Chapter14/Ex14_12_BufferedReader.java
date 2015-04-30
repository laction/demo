package p150421_Chapter14;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

// BuffedReader ����
public class Ex14_12_BufferedReader {
	public static void main(String[] args) throws FileNotFoundException,IOException{
		FileReader fr = new FileReader("printStream.txt");
		BufferedReader br = new BufferedReader(fr);
		String msg ; 
		int line = 0 ;
		while((msg = br.readLine()) != null){	// readLine () : ���پ� read. Buffered Reader���� �ִ�.
			System.out.println(++line + ":"+msg);
		}
		br.close(); fr.close();
			// Ű����� ���� ���پ� �Է¹ް� ȭ�鿡 ���.
		BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
		while((msg = br2.readLine())!=null){
			System.out.println(msg);
		}
	}
}
