package BasicOfJava.Exception;

public class UserDefinedExcep {
  public static void main(String[] args) {

    try {
      System.out.println(" User defined exception in java ");
      throw new MyName("Your name is invalid");
    } catch (MyName e) {
      System.out.println("Caught the exception");
      System.out.println(e.getMessage());
    }
  }
}
class MyName extends Exception{
  public MyName(String s){
   super(s);
  }
}

/*
 * shuvra 2nd
 * shuvra 1st
 */
