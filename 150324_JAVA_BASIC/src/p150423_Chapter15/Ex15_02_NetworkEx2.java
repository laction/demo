package p150423_Chapter15;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* URLConnection : 추상클래스
 * URL 객체로 부터 객체 생성됨.
 * */
public class Ex15_02_NetworkEx2 {
	public static void main(String[] args) throws IOException {
		URL url = new URL("http://www.google.com");
		URLConnection urlCon = url.openConnection();
		urlCon.connect();
		
		Map<String,List<String>> map = urlCon.getHeaderFields();
		
		Set<String> s = map.keySet();
		Iterator<String> it = s.iterator();
		while(it.hasNext()){
			String name = it.next();
			System.out.print(name + ":");
			List<String> value = map.get(name);
			for(String t : value)
				System.out.println(t);
		}
		System.out.println("문서의 길이 : "+  urlCon.getContentLength() + "바이트");
		InputStream input = urlCon.getInputStream();
		System.out.println("=== 문서의 내용 ===");
		int readByte;
		byte[] buf = new byte[100];
		while(( readByte = input.read(buf))!=-1){
//			System.out.print((char)readByte);
			System.out.println(new String(new String(buf,0,buf.length).getBytes()));
		}
		input.close();
	}
}
