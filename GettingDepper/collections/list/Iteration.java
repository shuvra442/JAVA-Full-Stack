import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/*
 * different typemof iteration in java 
 * 
 * create a arrays.asList
 * 
 * 1. simple for loop 
 * 2. enhanced loop
 * 3. Using Iterator()
 * 4. using while loop terator()
 * 5. using stream 
 */

class Iteration{
  public static void main(String[] args) {
      List<String> lpName=Arrays.asList("HP","Dell","Lenovo","acer","Realme");
      // 1..
      for(int i=0;i<lpName.size();i++){
        System.out.println(lpName.get(i));
      }
      System.out.println("\n");
      // 2.
      for(String it: lpName){
        System.out.println(it);
      }
      System.out.println();
      // 3.
      for(Iterator<String> lIterator= lpName.iterator(); lIterator.hasNext();){
        String strElement=(String)lIterator.next();
        System.out.println(strElement);
      }
      System.out.println();
      // 4.
      Iterator<String> iterator=lpName.iterator();
      while(iterator.hasNext()){
       String str=(String)iterator.next();
       System.out.println(str);
      }

      // stream +lemda
      System.out.println();
      lpName.stream().forEach(lp ->System.out.println(lp));
  }
}