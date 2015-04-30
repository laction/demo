package p150423_Chapter15;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class Ex15_03_TcpIpClientEx1 {
	public static void main(String[] args) throws IOException {
		String server_ip = "localhost";
		System.out.println("서버에 연결 중 서버 IP : " + server_ip);
		Socket socket = new Socket(server_ip,1503);
		InputStream in = socket.getInputStream();
		DataInputStream dis = new DataInputStream (in);
		
		System.out.println("서버 수신 메시지 : "+dis.readUTF());
		System.out.println("연결 종료");
		dis.close();
		socket.close();
	}
}
