package BasicOfJava.Exception;

import java.util.*;

public class CheckedException {
  public static void main(String[] args) {
    Scanner scan = new Scanner("Hello shuvra"); 
    System.out.println("" + scan.nextLine()); 
    System.out.println("Exception Output: " + scan.ioException()); 
    scan.close();
  }
}

/**
 * output : 
 * 
 * Hello shuvra
 * Exception Output: null
 */