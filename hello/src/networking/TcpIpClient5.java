package networking;

import java.io.IOException;
import java.net.ConnectException;
import java.net.Socket;

public class TcpIpClient5 {

   public static void main(String[] args) {
      try {
         String serverTp = "127.0.0.1";

         // 소켓을 생성해 연결 요청
         Socket socket = new Socket(serverTp, 7777);

         System.out.println("서버에 연결되었습니다.");
         Sender sender = new Sender(socket);
         Receiver receiver = new Receiver(socket);

         sender.start();
         receiver.start();
      } catch (ConnectException ce) {
         ce.printStackTrace();
      } catch (IOException ie) {
         ie.printStackTrace();
      } catch (Exception e) {
         e.printStackTrace();
      }
   }
}
