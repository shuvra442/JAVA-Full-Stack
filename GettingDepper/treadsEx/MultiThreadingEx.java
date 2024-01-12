package GettingDepper.treadsEx;

class MultiThreading implements Runnable{
  public void run(){

  }
}

public class MultiThreadingEx {
  public static void main(String[] args) {
    Thread m1=new Thread(new MultiThreading(),"Demo1");
    Thread m2=new Thread(new MultiThreading(),"Demo2");
    System.out.println("This is a multiThreading Example :: ");
    System.out.println(m1.getName());
    System.out.println(m1.getPriority());
    System.out.println(m2.getName());
    System.out.println(m2.getPriority());
  }
}
