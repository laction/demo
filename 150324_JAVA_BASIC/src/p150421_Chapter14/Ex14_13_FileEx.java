package p150421_Chapter14;

import java.io.File;
import java.io.IOException;
import java.util.Date;

// File Ŭ���� ����
// ���Ͽ� ���� ������ �����ϴ� Ŭ����
// �� ������ ������ ��Ʈ������ �����;� �Ѵ�.
public class Ex14_13_FileEx {
	public static void main(String[] args) throws IOException{
		String filePath = "C:\\";
		File f1 = new File(filePath);
		String list [] = f1.list();
		for(int i = 0 ; i < list.length ; i ++){
			File f2 = new File(filePath,list[i]);
			if(f2.isDirectory())
				System.out.printf("%s : ���丮\n", list[i]);
			else
				System.out.printf("%s : ����(%dbyte)\n",list[i],f2.length());
		}
		File dir = new File("C:\\temp");
		File fileName = new  File("c:\\temp\\test.txt"); 
		System.out.println(dir.mkdir());
		System.out.println(fileName.createNewFile());
		
		File fileName2 = new File("test.txt");
		System.out.println(fileName2.getAbsolutePath());		// ������
		System.out.println(fileName2.getPath());					// ��� ���
		System.out.println(fileName2.getParent());		// ���� ���丮 �����
		
		File f5 = new File("C:\\temp\\test.txt");
		File f6 = new File("C:\\temp\\test1.txt");
		System.out.println(f5.renameTo(f6));
	}
}
