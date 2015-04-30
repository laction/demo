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
		System.out.println(getTime() + "���� �غ� �Ϸ�");
		while(true){
			System.out.println(getTime() + "���� ��� ��");
			Socket socket = server.accept();		// accept() : Ŭ���̾�Ʈ ���� ���
			System.out.println(getTime() + "���� ��û ���� : "+ socket.getInetAddress());
			OutputStream out  = socket.getOutputStream();		// socket.getInetAddress() : (Ŭ���̾�Ʈ) ip �ּ�
			DataOutputStream dos = new DataOutputStream(out);
			dos.writeUTF("Test Message from Server");
			System.out.println(getTime() + "������ ���� �Ϸ�");
			dos.close();
			socket.close();
		}		
	}
	static String getTime(){		
		return new SimpleDateFormat("[hh:mm:ss").format(new Date());
	}
}
