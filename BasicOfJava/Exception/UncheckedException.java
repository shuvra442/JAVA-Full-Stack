package BasicOfJava.Exception;

/**
 * There three types of method to print exception in java
 * 
 * 1. peintStackTrace() : print the exception name, dscription, and stack trace.
 * 2. toString() : print exception name and description.
 * 3. hetMessage() : print the description of the exception.
 */

public class UncheckedException {
  public static void main(String[] args) {
    try {
      int c = 10 / 0;
    } catch (Exception e) {
      // System.out.print(e.printStackTrace());
      System.out.println(e.toString());
      System.out.println(e.getMessage());
    }
  }
}

/**
 * java.lang.ArithmeticException: / by zero
 * / by zero
 */
