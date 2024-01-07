package BasicOfJava.Exception;

/**
 * If we define a finally block after the try_catch block and if the programe is run then finally block must be excute 
 */

public class FinallyEx {
  public static void main(String[] args) {
    try {
      System.out.println("Check 0 can devided by any number or not ::"+ 10/0);
    } catch (Exception e) {
      System.out.println(e.toString());
      // TODO: handle exception
    } finally{
      System.out.println("Fianlly block run");
    }
  }
}
