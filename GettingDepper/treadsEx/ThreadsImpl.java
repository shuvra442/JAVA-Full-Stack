package GettingDepper.treadsEx;

class MyJob implements Runnable{
  public void run(){
   for(int i=0;i<5;i++){
    System.out.println("Method run");
   }
  }
}

public class ThreadsImpl {
  public static void main(String[] args) {
    System.out.println("<<<===Appliaction Started==>>>");
    for(int i=0;i<5;i++){
      System.out.println("** Main Method Runnnig ==> ");
    }
    MyJob myJob= new MyJob();
    Thread thread= new Thread(myJob,"Hello");
    String str=thread.getName();
    int str1=thread.getPriority();
    System.out.println(str);
    System.out.println(str1);
    System.out.println("@@  Appliaction terminated ==>");
  }
}
