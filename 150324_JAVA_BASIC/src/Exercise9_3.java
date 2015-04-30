import java.util.StringTokenizer;

public class Exercise9_3 {
	public static void main(String[] args) {
		String fullPath = "c:\\jdk1.5\\work\\PathSeparateTest.java";
		String path = "";
		String fileName = "";
		
		/*
		(1) 알맞은 코드를 넣어 완성하시오.
		*/
//		StringTokenizer st = new StringTokenizer(fullPath,"\\");
//		while(st.hasMoreElements())
//			fileName=st.nextToken();
//		path = fullPath.substring(0,fullPath.indexOf("\\"+fileName));
		int i = fullPath.lastIndexOf("\\");
		path = fullPath.substring(0,i);
		fileName = fullPath.substring(i+1);
		
		System.out.println("fullPath:" + fullPath);
		System.out.println("path:" + path);
		System.out.println("fileName:" + fileName);
	}
}
