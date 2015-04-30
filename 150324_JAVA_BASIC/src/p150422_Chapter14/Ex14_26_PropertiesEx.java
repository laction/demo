package p150422_Chapter14;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/* Properties Ŭ����
 * Hashtable�� ����Ŭ����
 * <String,String> �� Properties Ŭ����
 * */
public class Ex14_26_PropertiesEx {
	public static void main(String[] args) throws IOException {
		Properties pr = new Properties();
		pr.put("1", "ȫ�浿");
		pr.put("2", "���");
		pr.put("3", "�̸���");
		pr.put("4", "�Ӳ���");
		FileWriter fw = new FileWriter("properties.txt");
		pr.store(fw, "properties example");
		
		Properties pr2 = new Properties();
		FileReader fr = new FileReader("properties.txt");
		// fr ���Ϸκ��� �����͸� �Է¹޾� Properties ��ü�� ��ҷ� �����.
		pr2.load(fr);
		System.out.println(pr2);
	}
}