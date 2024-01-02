/**
 * smae method perform differnt operation is called polymorphism
 * two type polymorphism occurd in java 
 * 1. compile time polymorphism
 * 2. run time polymorphism
 * compiltime : a polymorphism which is occured in compile time is called compile time polymorphism its acchived function overloading and operator overloading 
 * 
 * runtime: a polymorphism which is occured in runtime is called  runtime polymorphism
 *  
 * compile time polymorphism contain :  method overloading 
 * runtime polymorphism contain : method overriding
 */

package BasicOfJava.OPPS;

public class Polymorphism {
  void add(){
     System.out.println(10+20);
  }
  void add(int a, int b){
    System.out.println(a+b);
  }
  void add(int a, double b){
    System.out.println(a+b);
  }

  public static void main(String[] args) {
    Polymorphism polymorphism=new Polymorphism();
    polymorphism.add();
    polymorphism.add(10, 20);
    polymorphism.add(10, 30.6);
  }
}
/**
 * output: 
 * 30
 * 30
 * 40.6
 */
