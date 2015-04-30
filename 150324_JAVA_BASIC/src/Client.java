

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.Socket;

public class Client {
   static String server_ip;
   static Socket socket;
   static BufferedReader sysin;
   static BufferedReader sin;
   static Writer sout;
   static boolean bExit=false;
   public static void main(String[] args) throws IOException {
      server_ip = "172.16.1.21";
      System.out.println("서버에 연결 중 서버 IP : " + server_ip);
      socket = new Socket(server_ip, 9876);

      sysin = new BufferedReader(new InputStreamReader(
            System.in));
      sin = new BufferedReader(new InputStreamReader(
            socket.getInputStream()));
      sout = new OutputStreamWriter(socket.getOutputStream());
      RcvStream rs = new RcvStream();
      SndStream ss = new SndStream();
      rs.start(); ss.start();
      while(bExit==false){
         try {
            Thread.sleep(60);
         } catch (InterruptedException e) {
            e.printStackTrace();
         }
      }
//      while (true) {
//         // 2.
//         String keyboardData = sysin.readLine();
//         sout.write(keyboardData + "\n");
//         sout.flush();
//         String data = sin.readLine();
//         System.out.println(data);
//         if (keyboardData.equals("bye"))
//            break;
//      }
   }
   static class RcvStream extends Thread {
      @Override
      public void run() {
//         while (true) {
//            
//            
//                  try {
//                     sin.readLine();
//                  } catch (IOException e) {
//                     e.printStackTrace();
//                  }
//            
//         }
         while (true) {
            // 2.
            String keyboardData;
            try {
               String data = sin.readLine();
               System.out.println(data);
               
            } catch (IOException e) {
               // TODO Auto-generated catch block
               e.printStackTrace();
               
            }
            
         }
      }
   }

   static class SndStream extends Thread {
      @Override
      public void run() {
//         while (true) {
//            if (sb[id].length() != 0) {
//               try {
//                  w.write(sb[id].toString() + "\n");
//                  w.flush();
//                  if(sb[id].toString().equals("bye")) bExit=true;
//                  sb[id].delete(0,sb[id].length()-1);
//               } catch (IOException e) {
//                  e.printStackTrace();
//               }
//            }
//         }
         while (true) {
            // 2.
            String keyboardData;
            try {
               keyboardData = sysin.readLine();
               sout.write(keyboardData + "\n");
               sout.flush();
               if (keyboardData.equals("bye")){
                  bExit=true;
                  break;
               }
                  
               
            } catch (IOException e) {
               // TODO Auto-generated catch block
               e.printStackTrace();
            }
            
         }
      }
   }
}