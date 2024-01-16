package BasicOfJava.Exception;

 import java.io.IOException;

class M{
  void method() throws IOException {
    throw new IOException("Here define the exception");
  }
}

public class TrowsIoEx {
  public static void main(String[] args)throws IOException{
    try {
      M obj = new M();
      obj.method();
      System.out.println("Normal flow");
      
    } catch (Exception e) {
      System.out.println("Exception occure and catech here ");
    }
  }
}
