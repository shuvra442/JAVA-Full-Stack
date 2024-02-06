package BasicOfJava.Exception;

/**
 * throws -->> throws keyword is required only for checked exceptions and usage of the throws keyword for          unchecked exceptions is meaningless.
 * 
 * throw  -->> this exception mainly define the throws exception
 */

public class ThrowAndThrows {

  static void add() throws ArithmeticException{
    System.out.println("Inside a add()");
    int c=10/0;
    throw new ArithmeticException("Demo"+c);
  }
  public static void main(String[] args) throws InterruptedException  {
    Thread.sleep(1000);
    for(int i=0;i<10;i++) {
      System.out.println(i);
    }

    try {
      add();
    } catch (Exception e) {
      // TODO: handle exception
      System.out.println(e.getMessage());
    }
  }

}
