package p150423_Chapter15;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex15_03_TcpIpServerEx1 {
	public static void main(String[] args) throws IOException{
		ServerSocket server = new ServerSocket(1503);
		System.out.println(getTime() + "서버 준비 완료");
		while(true){
			System.out.println(getTime() + "연결 대기 중");
			Socket socket = server.accept();		// accept() : 클라이언트 연결 대기
			System.out.println(getTime() + "연결 요청 수신 : "+ socket.getInetAddress());
			OutputStream out  = socket.getOutputStream();		// socket.getInetAddress() : (클라이언트) ip 주소
			DataOutputStream dos = new DataOutputStream(out);
			dos.writeUTF("Test Message from Server");
			System.out.println(getTime() + "데이터 전송 완료");
			dos.close();
			socket.close();
		}		
	}
	static String getTime(){		
		return new SimpleDateFormat("[hh:mm:ss").format(new Date());
	}
}
