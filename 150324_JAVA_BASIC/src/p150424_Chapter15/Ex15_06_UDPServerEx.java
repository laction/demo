package p150424_Chapter15;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex15_06_UDPServerEx {
	public static void main(String[] args) throws IOException{
						// 생성자로 1506포트에 바인딩.
		DatagramSocket socket = new DatagramSocket(1506);
		DatagramPacket inPacket, outPacket ; 	// 데이터 수신할 클래스
		byte[] inMsg = new byte[10];
		byte[] outMsg ;
		while(true){
			inPacket = new DatagramPacket(inMsg, inMsg.length);
			socket.receive(inPacket);
			InetAddress address = inPacket.getAddress();	// 클라이언트 IP 주소 저장
			int port = inPacket.getPort();							// 클라이언트 포트번호 저장
			SimpleDateFormat sdf = new SimpleDateFormat("[hh:mm:ss");
			String time = sdf.format(new Date());
			outMsg = time.getBytes();
			outPacket = new DatagramPacket(outMsg, outMsg.length, address,port);
			socket.send(outPacket);
			
		}
	}
}
