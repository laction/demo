package p150421_Chapter14;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

// BuffedReader 예제
public class Ex14_12_BufferedReader {
	public static void main(String[] args) throws FileNotFoundException,IOException{
		FileReader fr = new FileReader("printStream.txt");
		BufferedReader br = new BufferedReader(fr);
		String msg ; 
		int line = 0 ;
		while((msg = br.readLine()) != null){	// readLine () : 한줄씩 read. Buffered Reader에만 있다.
			System.out.println(++line + ":"+msg);
		}
		br.close(); fr.close();
			// 키보드로 부터 한줄씩 입력받고 화면에 출력.
		BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
		while((msg = br2.readLine())!=null){
			System.out.println(msg);
		}
	}
}
