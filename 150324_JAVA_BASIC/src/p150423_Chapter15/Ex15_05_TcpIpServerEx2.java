package p150423_Chapter15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

/* echo ���� �����
 * Ŭ���̾�Ʈ�� ������ ������ �״�� �ٽ� Ŭ���̾�Ʈ���� �����ϴ� ���� �����.
 * ���� Ŭ���̾�Ʈ���� ���� �� �� �ֵ��� ������ ����ϱ�.
 * */
public class Ex15_05_TcpIpServerEx2 {
	public static void main(String[] args) throws IOException {
		//1 . �������� �����ϱ�
		
		ServerSocket ss = new ServerSocket(1505);
			
		//2 . accept�� ������ �����ϱ�
		long exitTime = new Date().getTime() + 5000*1000;
		while(exitTime > new Date().getTime()){
				System.out.println("���");
			Socket s = ss.accept();
				System.out.println("Ŭ���̾�Ʈ ���� / ������ ����");
			new EchoStreamer(s).start();
		}
		
		System.out.println("���� ����");
		
		//3. Thread�� �����Ͽ� ������ �����ϱ�
		
		
	}
	static class EchoStreamer extends Thread{
		InputStream is;
		OutputStream os;
		Socket socket;
		EchoStreamer(Socket socket){
			this.socket = socket;			
			try {
				is = socket.getInputStream();
				os = socket.getOutputStream();
			} catch (IOException e) {			e.printStackTrace();			}
		}
		@Override
		public void run() {
			// 6. Ŭ���̾�Ʈ�κ��� "bye" ���ڸ� ���������� Ŭ���̾�Ʈ�� ���۹��ڸ� ���� ��
			// �ٷ� Ŭ���̾�Ʈ�� ���� ���ڸ� �ٽ� �����ϱ�.
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			Writer w = new OutputStreamWriter(os);
			try{ 
				while(true){
					String t = br.readLine();
					System.out.println(t);
					w.write(t+"\n");
					w.flush();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally{
				try{
					if(is != null)is.close();
					if(os != null)os.close();
					if(socket != null)socket.close();
				}catch(IOException e2){  e2.printStackTrace();}
			}
			
		}
	}
}
