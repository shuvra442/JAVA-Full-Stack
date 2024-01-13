package BasicOfJava.OPPS.method;

public class MethodOverloading {
  void add(int a,int b){
    System.out.println("Adding two integers: " + (a+b));
  }
  void add(int a,int b,int c){
    System.out.println("Adding three integers: " + (a+b+c));
  }
  void add(int a,int b, double c){
    System.out.println("Adding three integers: " + (a+b+c));
  }
  public static void main(String[] args) {
    MethodOverloading mOverloading= new MethodOverloading();
    mOverloading.add(10,20);
    mOverloading.add(10,20,30);
    mOverloading.add(10,20,30.50);
  }
}
