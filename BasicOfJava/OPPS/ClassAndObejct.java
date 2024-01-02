package BasicOfJava.OPPS;

class Dog{
  String name;
  int age;
  public void bark(){
    System.out.println("Woof Woof");
  }
  // Constructor
  public Dog(String n,int a)
  {
    name=n;age=a;
  }
  // Method to display the details of dog
  public void showDetails() { 
    System.out.print("Name: " + name);
  System.out.println(", Age: " + age+" years"); 
  }
}

public class ClassAndObejct {
  public static void main(String[] args) {
    // Creating object of Dog class
    Dog d1 = new Dog("Tom",2);
    // Calling method using dot operator
    d1.bark();
    // Accessing private member using dot operator (not allowed in this case)
    //   d1.name = "Rex";
    // Displaying the details of dog
    d1.showDetails();
 }
}
/**
 * Woof Woof
 * Name:Tom
 * Age : 2 years
 */