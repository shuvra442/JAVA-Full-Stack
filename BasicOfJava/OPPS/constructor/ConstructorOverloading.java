package BasicOfJava.OPPS.constructor;


public class ConstructorOverloading {
   int id;
   String name;
  ConstructorOverloading(){
    System.out.println("This is a default constructor :: ");
  }
  ConstructorOverloading(int id, String name){
    this.id=id;
    this.name=name;
  }
  public static void main(String[] args) {
    ConstructorOverloading cons= new ConstructorOverloading();

    System.out.println("Default constuctor Value : ");
    System.out.println("The id is "+ cons.id +"The Namr is "+ cons.name);


    ConstructorOverloading cOverloading=new ConstructorOverloading(1,"shvra");
    System.out.println("The Id is "+ cOverloading.id +"The Name is "+ cOverloading.name);
  }
}
