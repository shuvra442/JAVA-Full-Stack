package BasicOfJava.OPPS;

class Sog{
  // constructor is the same name as the class name 
  // 1. default constructor
  Sog(){
    System.out.println("Hi My name is Rocky");
  }
  // parameterized constructor
  Sog(String breed){
    System.out.println("I am a " + breed);
    }
    
}

public class Constructor {
  public static void main(String[] args) {
    Sog dog =  new Sog();
    Sog dog1 =  new Sog("Zermansaport");
  }
}
/**
 * output:
 *  Hi My name is Rocky
 */