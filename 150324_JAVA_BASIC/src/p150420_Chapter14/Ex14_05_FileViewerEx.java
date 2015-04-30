package p150420_Chapter14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// FileInputStream ����
public class Ex14_05_FileViewerEx {
	public static void main(String[] args) throws FileNotFoundException,IOException{
		final String path = "src/p150420_Chapter14/Ex14_05_FileViewerEx.java";
		FileInputStream fis = new FileInputStream(path);
		int data = 0;
		while( ( data = fis.read() ) != -1){		// fis.read : �ѹ���Ʈ�� �д´�.
			char c = (char)data;
			System.out.print(c);
		}
		System.out.println("---------����Ʈ�б�----------");
		fis = new FileInputStream(path);
		byte [] buf = new byte[100];
		while((data=fis.read(buf))!=-1){
			String msg = new String(buf,0,data);
			System.out.print(msg);
		}
		fis = new FileInputStream(path);
		System.out.println("---------���ڿ��б� 1----------");
		while((data =fis.read(buf,0,buf.length))!=-1)
			System.out.print(new String(buf,0,data));
		System.out.println("---------���ڿ��б� 2----------");
	}
}
//package p150420_Chapter14;
//
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//
//// FileInputStream ��?��?
//public class Ex14_05_FileViewerEx {
//	public static void main(String[] args) throws FileNotFoundException,IOException{
//		final String path = "src/p150420_Chapter14/Ex14_05_FileViewerEx.java";
//		FileInputStream fis = new FileInputStream(path);
//		int data = 0;
//		while( ( data = fis.read() ) != -1){		// fis.read : ??��???������� ?����?��?.
//			char c = (char)data;
//			System.out.print(c);
//		}
//		System.out.println("---------��???����?����?----------");
//		fis = new FileInputStream(path);
//		byte [] buf = new byte[100];
//		while((data=fis.read(buf))!=-1){
//			String msg = new String(buf,0,data);
//			System.out.print(msg);
//		}
//		fis = new FileInputStream(path);
//		System.out.println("---------����??����?����? 1----------");
//		while((data =fis.read(buf,0,buf.length))!=-1)
//			System.out.print(new String(buf,0,data));
//		System.out.println("---------����??����?����? 2----------");
//	}
//}
//---------����Ʈ�б�----------
//package p150420_Chapter14;
//
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//
//// FileInputStream ����
//public class Ex14_05_FileViewerEx {
//	public static void main(String[] args) throws FileNotFoundException,IOException{
//		final String path = "src/p150420_Chapter14/Ex14_05_FileViewerEx.java";
//		FileInputStream fis = new FileInputStream(path);
//		int data = 0;
//		while( ( data = fis.read() ) != -1){		// fis.read : �ѹ���Ʈ�� �д´�.
//			char c = (char)data;
//			System.out.print(c);
//		}
//		System.out.println("---------����Ʈ�б�----------");
//		fis = new FileInputStream(path);
//		byte [] buf = new byte[100];
//		while((data=fis.read(buf))!=-1){
//			String msg = new String(buf,0,data);
//			System.out.print(msg);
//		}
//		fis = new FileInputStream(path);
//		System.out.println("---------���ڿ��б� 1----------");
//		while((data =fis.read(buf,0,buf.length))!=-1)
//			System.out.print(new String(buf,0,data));
//		System.out.println("---------���ڿ��б� 2----------");
//	}
//}
//---------���ڿ��б� 1----------
//package p150420_Chapter14;
//
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//
//// FileInputStream ����
//public class Ex14_05_FileViewerEx {
//	public static void main(String[] args) throws FileNotFoundException,IOException{
//		final String path = "src/p150420_Chapter14/Ex14_05_FileViewerEx.java";
//		FileInputStream fis = new FileInputStream(path);
//		int data = 0;
//		while( ( data = fis.read() ) != -1){		// fis.read : �ѹ���Ʈ�� �д´�.
//			char c = (char)data;
//			System.out.print(c);
//		}
//		System.out.println("---------����Ʈ�б�----------");
//		fis = new FileInputStream(path);
//		byte [] buf = new byte[100];
//		while((data=fis.read(buf))!=-1){
//			String msg = new String(buf,0,data);
//			System.out.print(msg);
//		}
//		fis = new FileInputStream(path);
//		System.out.println("---------���ڿ��б� 1----------");
//		while((data =fis.read(buf,0,buf.length))!=-1)
//			System.out.print(new String(buf,0,data));
//		System.out.println("---------���ڿ��б� 2----------");
//	}
//}
//---------���ڿ��б� 2----------
