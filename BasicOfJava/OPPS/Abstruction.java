package BasicOfJava.OPPS;

abstract class Base{
  abstract void printName();
}

class C extends Base{
  void printName(){
    System.out.println("I am a subclass");
  }
}

public class Abstruction {
  public static void main(String[] args) {
    Base base =new C();
    base.printName();
  }
}

/**
 * output:
 * I'm a subclass
 */
