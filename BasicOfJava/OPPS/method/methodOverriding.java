package BasicOfJava.OPPS.method;

class Shap{
  void draw(){
    System.out.println("I am Draw");
  }
}
class Square extends Shap{
  void draw(){
    // super.draw(); /* With out super keyword prints only syper class  */
    System.out.println("I am square");
  }
}

public class methodOverriding {
  public static void main(String[] args) {
    Square square=new Square();
    square.draw();
  }
}
