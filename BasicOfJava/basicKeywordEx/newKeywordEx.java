package BasicOfJava.basicKeywordEx;

/**
 * new => create object of an class 
 * creating memory of an obejct 
 * all the memory are create in heap memory
 */


class Sleep{
  void run(){
    System.out.println("Lets run::");
  }
}

public class newKeywordEx {
  public static void main(String[] args) {
    Sleep sleep = new Sleep();
    sleep.run();
  }
}
