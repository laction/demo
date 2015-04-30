package p150420_Chapter14;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* ���� �ΰ��� �̸��� �ֿܼ��� �Է¹޾� ������ ������ ������ ���ϴ� ���α׷��� �ۼ��ϱ�
 * available() �޼��� : ������ ���� ����Ʈ ���� ����.
 * [������]
 * a.txt �� b.txt������ ���� ������ �����Դϴ�.
 * a.txt ������ ũ�� : 100byte
 * b.txt ������ ũ�� : 100byte
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
			System.out.println("�ٸ��ϴ�");
			System.exit(0);
		}		
		for(int i = 0 ; i < buf1.length ; i++ )
			if(buf1[i]==buf2[i]);
			else{	
				System.out.println("�ٸ��ϴ�");
				System.exit(0);
			}				
		System.out.println(fileName1 + "������ ũ�� : " + buf1.length + "����Ʈ");
		System.out.println(fileName2 + "������ ũ�� : " + buf2.length + "����Ʈ");		
	}
}
//src/p150420_Chapter14/Ex14_06_FileCopy.java������ ũ�� : 884����Ʈ
//src/p150420_Chapter14/Ex14_06_FileCopy.bak������ ũ�� : 884����Ʈ