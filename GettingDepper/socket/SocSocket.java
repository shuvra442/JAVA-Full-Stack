package GettingDepper.socket;

import java.io.IOException;
import java.net.Socket;

public class SocSocket {
  public static void main(String[] args)throws IOException {
    String IP="localhost";
    int port=9999;
    System.out.println("Clinet socket started");
    Socket soc= new Socket(IP,port);
    soc.close();
  }
}
