package BasicOfJava.basicKeywordEx;

/**
 * final => 1. If we define a variable as a final then we can't changed  the value... 
 *       => 2. If we define a class as a final then we can.t extend the  class....
 *       => 3. If we define a method as a final then we can.t ovveride the  method...
 *   Beacuse final keyword are bydefault static 
 */

  class Women{
    final int var = 30;
   void sleep(){
    // var = 40; // The final field Women.var cannot be assigned
    System.out.println("Women is Sleeping");
  }
 }

 class Menn extends Women{ // The type Menn cannot subclass the final class WomenJava(16777529)
  void sleep(){  // Cannot override the final method from Women
    System.out.println("Men is less sleep then women");
  }
 }


public class FinalFullEx extends Menn {
  public static void main(String[] args) {
    FinalFullEx finalFullEx= new FinalFullEx();
    finalFullEx.sleep();
  }
}
