package p150423_Chapter15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.Socket;
/* echo Ŭ���̾�Ʈ �����ϱ�
 * 1. ������ ����
 * 2. Ű����κ��� ���ڸ� �Է�
 * 3. �Է¹��� ������ ������ �����ϱ�
 * 4. �����κ��� ���� ������ ȭ�鿡 ����ϱ�.
 * 5. 2��~4�������� "bye"���� ���� ������ �ݺ�.
 * 6. ����
 * */
public class Ex15_05_TcpIpClientEx2 {
	public static void main(String[] args) throws IOException {
		String server_ip = "localhost";
		System.out.println("������ ���� �� ���� IP : " + server_ip);
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
