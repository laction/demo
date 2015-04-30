package p150423_Chapter15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.Socket;
/* echo 클라이언트 구현하기
 * 1. 소켓을 생성
 * 2. 키보드로부터 문자를 입력
 * 3. 입력받은 내용을 서버로 전송하기
 * 4. 서버로부터 받은 내용을 화면에 출력하기.
 * 5. 2번~4번까지는 "bye"문자 전송 전까지 반복.
 * 6. 종료
 * */
public class Ex15_05_TcpIpClientEx2 {
	public static void main(String[] args) throws IOException {
		String server_ip = "localhost";
		System.out.println("서버에 연결 중 서버 IP : " + server_ip);
		Socket socket = new Socket(server_ip,1505);
		
		BufferedReader sysin = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader sin = 
				new BufferedReader(new InputStreamReader(socket.getInputStream()));		
		Writer sout = new OutputStreamWriter(socket.getOutputStream());
		
		while(true){
			//2. 
			String keyboardData = sysin.readLine();
			sout.write(keyboardData + "\n");
			sout.flush();
			String data = sin.readLine();
			System.out.println(data);
			if(keyboardData.equals("bye"))break;
		}
	}
}
