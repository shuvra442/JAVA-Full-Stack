package BasicOfJava.BasicOfFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class CreatNewFile {
  public static void main(String[] args) {
    String getName = "";
    String getPath = "";  
    try {
      BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
      String text= "Hi my name is shuvra patra";
      System.out.println("Enter the name of the file :: ");
      getName = bf.readLine();
      System.out.println("Enter the path of the file :: ");
      getPath = bf.readLine();
      File file = new File(getPath + " " +getName +".text");
      file.createNewFile();
      System.out.println("The file has been created successfully!");
      FileWriter fileWriter = new FileWriter(file);
      fileWriter.write(text);
      fileWriter.close();
      System.out.println("File write is scuccesfully");
      FileReader fileReader = new FileReader(file);
      int i;
      while ((i = fileReader.read()) != -1)
            System.out.println((char)i);

      //  Now its time to delete the file 
      file.delete();
      System.out.println("File deleted succesfully !! ");
    } catch (Exception e) {
      System.out.println(e.toString());
    }
  }
   
}
