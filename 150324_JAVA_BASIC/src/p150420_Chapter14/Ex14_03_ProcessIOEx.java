package p150420_Chapter14;

import java.io.IOException;
/* 프로세스의 결과를 자바프로그램에 출력
 * InputStream
 * 		int data = read() : 1byte씩 읽기. 데이터를 리턴
 * 		int length = read(byte[] msg) : msg 크기만큼 읽는다. 길이를 리턴. 읽은내용은 msg 배열에 저장.
 * 													length에 읽은 바이트 수를 저장.
 * */
public class Ex14_03_ProcessIOEx {
	public static void main(String[] args) throws IOException{
		Process p = Runtime.getRuntime().exec
				("ping localhost");
		byte[] msg = new byte[128];
		int len ; 
		// new String(msg,0,len) : msg 0번 인덱스부터 len 만큼 문자열객체로 변경.
		while((len=p.getInputStream().read(msg))>0){
			System.out.println(new String(msg,0,len));
		}
	}
}
