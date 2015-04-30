package p150414_Chapter11;

import java.util.StringTokenizer;

/* StringTokenizer 예제
 * Token : 의미를 가진 최소단위의 단어
 * */
public class Ex11_00_06_StringTokenizerEx {
	public static void main(String[] args) {
		String source = "100,200,300,400";
		StringTokenizer st = new StringTokenizer(source,",");
		while(st.hasMoreElements())
			System.out.print(st.nextElement());
		System.out.println();
		String [] tokens = source.split(",");
		for(String s : tokens)
			System.out.println(s);
	}
}
//100200300400
//100
//200
//300
//400
