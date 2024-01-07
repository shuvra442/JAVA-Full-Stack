package BasicOfJava.basicKeywordEx;

class Student{
  String name;
  int age;
  // constructor
  public Student(String name,int age){
  this.name=name;
  this.age=age;
  }
  void display(){
    System.out.println("Name : "+name);
    System.out.println("Age : "+age);
  }
}


public class ThisKeywordEx {
  public static void main(String[] args) {
    Student student = new Student("shuvra", 22);
    student.display();
  }
}
