package BasicOfJava.InterfaceFull;

interface Habbit{
  void eat();
  void sleep();
}

class Men implements Habbit{
  public void eat(){
    System.out.println("Habbit of men");
  }
  public void sleep(){
    System.out.println("Habbit of men");
  }
}
public class InterfaceEx extends Men {
  public static void main(String[] args) {
    InterfaceEx interfaceEx = new InterfaceEx();
    interfaceEx.eat();
    interfaceEx.sleep();
  }
}
/**
 * Habbit of men
 * Habbit of men
 */