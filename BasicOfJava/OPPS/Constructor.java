package BasicOfJava.OPPS;

class Dog{
  // constructor is the same name as the class name 
  // 1. default constructor
  Dog(){
    System.out.println("Hi My name is Rocky");
  }
  // parameterized constructor
  Dog(String breed){
    System.out.println("I am a " + breed);
    }
    
}

public class Constructor {
  public static void main(String[] args) {
    Dog dog =  new Dog();
    Dog dog1 =  new Dog("Zermansaport");
  }
}
/**
 * output:
 *  Hi My name is Rocky
 */