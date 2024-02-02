import java.io.Serializable;

public class Serilization implements Serializable{
  private String name;
  private String email;
  private int age;
  private int number;

  public Serilization(String name, String email, int age, int number) {
    this.name = name;
    this.email = email;
    this.age = age;
    this.number = number;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }
  public int getAge() {
    return age;
  }
  public void setAge(int age) {
    this.age = age;
  }
  public int getNumber() {
    return number;
  }
  public void setNumber(int number) {
    this.number = number;
  }

  public Serilization() {
  }
  
public void display(){
  System.out.println(this.name);
}

}
