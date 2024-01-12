package GettingDepper.treadsEx;

class MyTask extends Thread{
  public void run(){
    for(int i=0;i<10;i++){
      System.out.println("Printing the run method printer");
    }
  }
}
public class ThreadsEx {
  public static void main(String[] args) {
    System.out.println("<<== Application Started ==>>");
    // Job 1 
    for(int i=0;i<10;i++){
      System.out.println("Printing the main method printer");
    }
    // Job 2
    new Thread(new MyTask()).start();
    System.out.println("<<=== Application Terminated ===>>");
  }
}
