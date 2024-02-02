import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserilization {
  public static void main(String[] args) {
    // Now deserilization 
    try {
      // Create an ObjectInputStream object from the FileInputStream object
      ObjectInputStream ois=new ObjectInputStream(new FileInputStream("obj.txt"));
      // Read the object from the file
      Serilization serilization=(Serilization)ois.readObject();
      serilization.display();
      System.out.println(serilization.getName());
      System.out.println(serilization.getEmail());
      System.out.println(serilization.getAge());
      System.out.println(serilization.getNumber());
      ois.close();
    } catch (IOException exception) {
      exception.printStackTrace();
    } catch (ClassNotFoundException exception) {
      exception.printStackTrace();
    }
  }
}
