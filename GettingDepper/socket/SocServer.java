package GettingDepper.socket;

import java.net.ServerSocket;
import java.net.Socket;

public class SocServer { 
  public static void main(String[] args) { 
    try {
      System.out.println("Server is waiting for a client request :: ");
      ServerSocket sos = new ServerSocket(9999);
      Socket soc= sos.accept();
      System.out.println("Client is connected to the server :: ");
      
    } catch (Exception e) {
      // TODO: handle exception
      e.printStackTrace();
    }

  }
}
