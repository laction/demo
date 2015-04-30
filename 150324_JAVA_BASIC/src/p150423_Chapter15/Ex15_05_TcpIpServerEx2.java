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

/* echo 서버 만들기
 * 클라이언트가 보내준 내용을 그대로 다시 클라이언트에게 전송하는 서버 만들기.
 * 여러 클라이언트에게 서비스 할 수 있도록 쓰레드 사용하기.
 * */
public class Ex15_05_TcpIpServerEx2 {
	public static void main(String[] args) throws IOException {
		//1 . 서버소켓 생성하기
		
		ServerSocket ss = new ServerSocket(1505);
			
		//2 . accept로 소켓을 저장하기
		long exitTime = new Date().getTime() + 5000*1000;
		while(exitTime > new Date().getTime()){
				System.out.println("대기");
			Socket s = ss.accept();
				System.out.println("클라이언트 접속 / 쓰레드 시작");
			new EchoStreamer(s).start();
		}
		
		System.out.println("서버 종료");
		
		//3. Thread를 생성하여 소켓을 전달하기
		
		
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
			// 6. 클라이언트로부터 "bye" 문자를 받을때까지 클라이언트의 전송문자를 읽은 후
			// 바로 클라이언트에 받은 문자를 다시 전송하기.
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
