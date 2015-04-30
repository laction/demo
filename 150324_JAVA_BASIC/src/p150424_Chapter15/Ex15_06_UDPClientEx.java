package p150424_Chapter15;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Ex15_06_UDPClientEx {
	public static void main(String[] args) throws IOException{
		DatagramSocket datagramSocket = new DatagramSocket();
		InetAddress serverIP = InetAddress.getByName("127.16.1.36");
		byte[] msg = new byte[100];
		DatagramPacket outPacket = new DatagramPacket(msg, 1,serverIP, 1506);
		DatagramPacket inPacket = new DatagramPacket(msg, msg.length);
		
		datagramSocket.send(outPacket);
		datagramSocket.receive(inPacket);
		System.out.println("current server item : "+new String(inPacket.getData()));
		datagramSocket.close();
	}
}
