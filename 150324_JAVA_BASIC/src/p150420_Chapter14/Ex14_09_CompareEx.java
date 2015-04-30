package p150420_Chapter14;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* 파일 두개의 이름을 콘솔에서 입력받아 파일의 내용이 같은지 비교하는 프로그램을 작성하기
 * available() 메서드 : 파일의 읽을 바이트 수를 리턴.
 * [실행결과]
 * a.txt 와 b.txt파일은 같은 내용의 파일입니다.
 * a.txt 파일의 크기 : 100byte
 * b.txt 파일의 크기 : 100byte
 * */
public class Ex14_09_CompareEx {
	public static void main(String[] args) throws FileNotFoundException,IOException{
		
		final String fileName1 = "src/p150420_Chapter14/Ex14_06_FileCopy.java";
		final String fileName2 = "src/p150420_Chapter14/Ex14_06_FileCopy.bak";
		
		File file1 = new File(fileName1);
		
		FileInputStream fis1 = new FileInputStream(file1);
		FileInputStream fis2 = new FileInputStream(fileName2);		
		byte[] buf1 = new byte[(int) file1.length()];
		byte[] buf2 = new byte[fis2.available()];
				
		if(buf1.length != buf2.length) {
			System.out.println("다릅니다");
			System.exit(0);
		}		
		for(int i = 0 ; i < buf1.length ; i++ )
			if(buf1[i]==buf2[i]);
			else{	
				System.out.println("다릅니다");
				System.exit(0);
			}				
		System.out.println(fileName1 + "파일의 크기 : " + buf1.length + "바이트");
		System.out.println(fileName2 + "파일의 크기 : " + buf2.length + "바이트");		
	}
}
//src/p150420_Chapter14/Ex14_06_FileCopy.java파일의 크기 : 884바이트
//src/p150420_Chapter14/Ex14_06_FileCopy.bak파일의 크기 : 884바이트