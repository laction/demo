package p150423_Chapter15;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex15_04_SimpleWebServerEx {
	public static void main(String[] args) throws IOException{
		ServerSocket ss = new ServerSocket(8888);
		while(true){
			System.out.println("접속 대기 중");
			Socket socket = ss.accept();
			System.out.println("쓰레드 시작");
			HttpThread ht = new HttpThread(socket);
			ht.start();
		}
	}
	static class HttpThread extends Thread{
		private Socket socket = null;
		InputStream is = null;
		OutputStream os = null;
		HttpThread(Socket socket){
			this.socket = socket;
			try{
				is = socket.getInputStream();
				os = socket.getOutputStream();
			}catch (IOException e){
				e.printStackTrace();
			}
		}
		@Override
		public void run(){
			FileInputStream fis = null;
			try{
				String line = new BufferedReader(new InputStreamReader(is)).readLine();
				System.out.println("line : "+line);
				int start = line.indexOf("/")+1;
				int end = line.lastIndexOf("HTTP")-1;
				String filename = line.substring(start,end);
				System.out.println(filename);
				if(filename.equals(""))	filename = "index.html";
				System.out.println("사용자 요청 파일 : "+filename);
				fis = new FileInputStream(filename);
				byte[] fline = new byte[1024];
				int data ;
				while((data = fis.read(fline))!=-1){
					os.write(fline,0,data);
					os.flush();
				}
			}catch(Exception e){
				e.printStackTrace();
			}finally{
				try{
					if(fis != null) fis.close();
					if(is != null) is.close();
					if(os != null) is.close();
					if(socket != null) socket.close();					
				}catch( Exception e2){	}
			}
		}
	}
}
