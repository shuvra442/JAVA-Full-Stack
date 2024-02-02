import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class Serial {
  public static void main(String[] args) {
    // create the object of the serialization
   try {
    Serilization serilization = new Serilization("shuvra","Shuvrapatra5@gmail.com",22,894287);
    
    // Now create the file to hold the data and write into it using ObjectOutputStream
    FileOutputStream fos=new FileOutputStream("obj.txt");
    // Create an ObjectOutputStream object from the FileOutputStream object
    ObjectOutputStream oos=new ObjectOutputStream(fos);
    // Write the object to the file
    oos.writeObject(serilization);
    oos.close();
    fos.close();
    System.out.println("Serialized Successfully!");
   } catch (IOException exception) {
    exception.printStackTrace();
   }
  }
}
