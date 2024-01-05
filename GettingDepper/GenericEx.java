package GettingDepper;

import java.util.ArrayList;
import java.util.List;

public class GenericEx {
  public static void main(String[] args) {
  /**
    <> --> his symbol define the generic in java .....
    In this angular backet we define the differnt type of datatype 
    Most probably generice used type safty purpose in java because its a type safty language 
    Here we learn two types of generices class 
    1. using method 
    2. or using class
    in bellow describe the      * 
  */

    // List<String> list = new ArrayList<>();
    // list.add(20);
    // list.add(30);
    // list.add("list");
    // System.out.println(list.get(0));
    /**
      In the above example simply define what is generic in java 
      Now its time to go deep knowledge in java 
      1st saw you in using method() 
    */

      Integer[] intArray = { 1, 2, 3, 4, 5 };
      Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
      Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

      System.out.println("Array integerArray contains:");
      printArray(intArray);   // pass an Integer array

      System.out.println("\nArray doubleArray contains:");
      printArray(doubleArray);   // pass a Double array

      System.out.println("\nArray characterArray contains:");
      printArray(charArray);   // pass a Character array
  }
  public static < T > void printArray( T[] inputArray ) {
    // Display array elements
    for(T element : inputArray) {
       System.out.printf("%s ", element);
    }
    System.out.println();
}
}
