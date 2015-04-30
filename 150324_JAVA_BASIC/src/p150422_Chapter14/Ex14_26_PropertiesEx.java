package p150422_Chapter14;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/* Properties 클래스
 * Hashtable의 하위클래스
 * <String,String> 인 Properties 클래스
 * */
public class Ex14_26_PropertiesEx {
	public static void main(String[] args) throws IOException {
		Properties pr = new Properties();
		pr.put("1", "홍길동");
		pr.put("2", "김삿갓");
		pr.put("3", "이몽룡");
		pr.put("4", "임꺽정");
		FileWriter fw = new FileWriter("properties.txt");
		pr.store(fw, "properties example");
		
		Properties pr2 = new Properties();
		FileReader fr = new FileReader("properties.txt");
		// fr 파일로부터 데이터를 입력받아 Properties 객체의 요소로 등록함.
		pr2.load(fr);
		System.out.println(pr2);
	}
}