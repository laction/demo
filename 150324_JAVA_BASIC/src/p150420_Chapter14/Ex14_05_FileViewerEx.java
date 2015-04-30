package p150420_Chapter14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// FileInputStream 연습
public class Ex14_05_FileViewerEx {
	public static void main(String[] args) throws FileNotFoundException,IOException{
		final String path = "src/p150420_Chapter14/Ex14_05_FileViewerEx.java";
		FileInputStream fis = new FileInputStream(path);
		int data = 0;
		while( ( data = fis.read() ) != -1){		// fis.read : 한바이트씩 읽는다.
			char c = (char)data;
			System.out.print(c);
		}
		System.out.println("---------바이트읽기----------");
		fis = new FileInputStream(path);
		byte [] buf = new byte[100];
		while((data=fis.read(buf))!=-1){
			String msg = new String(buf,0,data);
			System.out.print(msg);
		}
		fis = new FileInputStream(path);
		System.out.println("---------문자열읽기 1----------");
		while((data =fis.read(buf,0,buf.length))!=-1)
			System.out.print(new String(buf,0,data));
		System.out.println("---------문자열읽기 2----------");
	}
}
//package p150420_Chapter14;
//
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//
//// FileInputStream ¿?½?
//public class Ex14_05_FileViewerEx {
//	public static void main(String[] args) throws FileNotFoundException,IOException{
//		final String path = "src/p150420_Chapter14/Ex14_05_FileViewerEx.java";
//		FileInputStream fis = new FileInputStream(path);
//		int data = 0;
//		while( ( data = fis.read() ) != -1){		// fis.read : ??¹???Æ®¾¿ ?Ð´?´?.
//			char c = (char)data;
//			System.out.print(c);
//		}
//		System.out.println("---------¹???Æ®?Ð±?----------");
//		fis = new FileInputStream(path);
//		byte [] buf = new byte[100];
//		while((data=fis.read(buf))!=-1){
//			String msg = new String(buf,0,data);
//			System.out.print(msg);
//		}
//		fis = new FileInputStream(path);
//		System.out.println("---------¹®??¿­?Ð±? 1----------");
//		while((data =fis.read(buf,0,buf.length))!=-1)
//			System.out.print(new String(buf,0,data));
//		System.out.println("---------¹®??¿­?Ð±? 2----------");
//	}
//}
//---------바이트읽기----------
//package p150420_Chapter14;
//
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//
//// FileInputStream 연습
//public class Ex14_05_FileViewerEx {
//	public static void main(String[] args) throws FileNotFoundException,IOException{
//		final String path = "src/p150420_Chapter14/Ex14_05_FileViewerEx.java";
//		FileInputStream fis = new FileInputStream(path);
//		int data = 0;
//		while( ( data = fis.read() ) != -1){		// fis.read : 한바이트씩 읽는다.
//			char c = (char)data;
//			System.out.print(c);
//		}
//		System.out.println("---------바이트읽기----------");
//		fis = new FileInputStream(path);
//		byte [] buf = new byte[100];
//		while((data=fis.read(buf))!=-1){
//			String msg = new String(buf,0,data);
//			System.out.print(msg);
//		}
//		fis = new FileInputStream(path);
//		System.out.println("---------문자열읽기 1----------");
//		while((data =fis.read(buf,0,buf.length))!=-1)
//			System.out.print(new String(buf,0,data));
//		System.out.println("---------문자열읽기 2----------");
//	}
//}
//---------문자열읽기 1----------
//package p150420_Chapter14;
//
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//
//// FileInputStream 연습
//public class Ex14_05_FileViewerEx {
//	public static void main(String[] args) throws FileNotFoundException,IOException{
//		final String path = "src/p150420_Chapter14/Ex14_05_FileViewerEx.java";
//		FileInputStream fis = new FileInputStream(path);
//		int data = 0;
//		while( ( data = fis.read() ) != -1){		// fis.read : 한바이트씩 읽는다.
//			char c = (char)data;
//			System.out.print(c);
//		}
//		System.out.println("---------바이트읽기----------");
//		fis = new FileInputStream(path);
//		byte [] buf = new byte[100];
//		while((data=fis.read(buf))!=-1){
//			String msg = new String(buf,0,data);
//			System.out.print(msg);
//		}
//		fis = new FileInputStream(path);
//		System.out.println("---------문자열읽기 1----------");
//		while((data =fis.read(buf,0,buf.length))!=-1)
//			System.out.print(new String(buf,0,data));
//		System.out.println("---------문자열읽기 2----------");
//	}
//}
//---------문자열읽기 2----------
