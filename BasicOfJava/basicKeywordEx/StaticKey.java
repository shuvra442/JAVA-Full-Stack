package BasicOfJava.basicKeywordEx;

/**
 * Its all about static keyword
 */


public class StaticKey {
   static int n=40;
   static int n1=m2();
  static void m1(){
    n=50;
    System.out.println(n);
    }
    static int m2(){
      System.out.println("form m2");
      return 20;
    }
    public static void main(String[] args) {
      // StaticKey staticKey= new StaticKey();
      System.out.println(n);
      System.out.println(n1);
      m1();
    }
}
