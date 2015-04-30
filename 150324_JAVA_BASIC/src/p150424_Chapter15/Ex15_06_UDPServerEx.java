package p150424_Chapter15;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex15_06_UDPServerEx {
	public static void main(String[] args) throws IOException{
						// �����ڷ� 1506��Ʈ�� ���ε�.
		DatagramSocket socket = new DatagramSocket(1506);
		DatagramPacket inPacket, outPacket ; 	// ������ ������ Ŭ����
		byte[] inMsg = new byte[10];
		byte[] outMsg ;
		while(true){
			inPacket = new DatagramPacket(inMsg, inMsg.length);
			socket.receive(inPacket);
			InetAddress address = inPacket.getAddress();	// Ŭ���̾�Ʈ IP �ּ� ����
			int port = inPacket.getPort();							// Ŭ���̾�Ʈ ��Ʈ��ȣ ����
			SimpleDateFormat sdf = new SimpleDateFormat("[hh:mm:ss");
			String time = sdf.format(new Date());
			outMsg = time.getBytes();
			outPacket = new DatagramPacket(outMsg, outMsg.length, address,port);
			socket.send(outPacket);
			
		}
	}
}
