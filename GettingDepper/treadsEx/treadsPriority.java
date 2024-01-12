package GettingDepper.treadsEx;

class TreadsPriorityex extends Thread{
  public void run(){
    System.out.println("Running method Now now set the priority = "+ Thread.currentThread().getPriority());
  }
}

public class treadsPriority {
  public static void main(String[] args) {
    TreadsPriorityex tPriorityex=new TreadsPriorityex();
    Thread m1=new Thread(tPriorityex);
    Thread m2=new Thread(tPriorityex);
    m1.setPriority(Thread.MIN_PRIORITY);
    m2.setPriority(Thread.MAX_PRIORITY);
    m1.start();
    m2.start();
  }
}
