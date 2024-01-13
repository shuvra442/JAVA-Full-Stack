package BasicOfJava.OPPS.constructor;

/**
 * constructor chaining --->>>
 * when one construcotr call another constructor is called constructor chaining 
 * its occure in a same clase also in a base class  
 *  we performe constructor in a same class using this()
 *  we performe constructor in a base class using super()
 */
 class Cons{
  int s;
  Cons(){
    System.out.println("<<---This is base class constrctor--->>");
  }
  Cons(int s){
    this.s=s;
    System.out.println("<<---This is base class constrctor--== " +s);
  }
 }

 class Conss extends Cons{
  Conss(){
    System.out.println(" <<--This is a derived class constructor -->> ");
  }
  // excution start here
  Conss(int z){
    // calling the base class constructor any argument
    super(4);
    System.out.println("Derived class constructor excuted in last");
  }
 }


public class constructorChaining {
  constructorChaining(){
    System.out.println("default cons");
  }
  constructorChaining(int x){
    // calling constructor 1
    this();
    System.out.println(x);
  }
  constructorChaining(int x, int y){
    // calling constructor 2
    this(5);
    System.out.println("I am the constructor 2");
  }
  public static void main(String[] args) {
    // same class constructor chaining
    new constructorChaining(3,5);

    // base class constructor
    new Conss(3);
  }
}
