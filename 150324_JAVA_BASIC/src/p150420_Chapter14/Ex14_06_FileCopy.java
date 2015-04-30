package p150420_Chapter14;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
/* FileOutputStream : 파일에 내용을 쓰는 기능
 * 		파일명에 해당하는 파일이 없으면 파일을 생성.
 * 		파일이 있으면 덮어쓰기
 * FileNotFoundException : 파일을 만들수 있는 권한이 없을 때, 발생.
 * */
public class Ex14_06_FileCopy {
	final static String src = "src\\p150420_Chapter14\\Ex14_06_FileCopy.java";
	final static String dst = "src\\p150420_Chapter14\\Ex14_06_FileCopy.bak";
	public static void main(String[] args) throws FileNotFoundException,IOException{
		FileInputStream fis = new FileInputStream(src);
		FileOutputStream fos = new FileOutputStream(dst);
		int data = 0;
		while( (data = fis.read()) != -1 ) fos.write(data);		
		fos.close();
		fis.close();
	}
}
