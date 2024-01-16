package BasicOfJava.OPPS.constructor;

class DeafultCon{
  String name;
  int age; 
  DeafultCon(){
    name="Shuvra";
    age=21;
  }
  DeafultCon(String n, int a){
    name =n;
    age = a;
  }
}

public class defaultExplicit {
  public static void main(String[] args) {
    DeafultCon deafultCon=new DeafultCon();
    System.out.println(deafultCon.name+" "+deafultCon.age);
    DeafultCon deafultCon1=new DeafultCon("shh", 22);
    DeafultCon deafultCon2=new DeafultCon("sh", 23);
    System.out.println(deafultCon1.name+" "+deafultCon1.age);
    System.out.println(deafultCon2.name+" "+deafultCon1.age);
  }
}
