/**
 * The default size of ArrayList is 10
 * 
 */

import java.util.*;

public class ArrayListEx {
  public static void main(String[] args) {
   List<String>list=new ArrayList<>();
   list.add("list1");
   list.add("list2");
   list.add("list3");
   list.add("list4");
   list.add("list5");
   List<String> list1= new ArrayList<>(10);
   list1.add("Shu");
   list1.add("Shuv");
   list1.add("Shuvr");
   list1.add("Shuvra");
   list1.add("Shuvrap");
   List<String> list2= new ArrayList<>(list);
   System.out.println(list2.addAll(list1));
   System.out.println(list1.size());
   System.out.println(list2.get(1));
   System.out.println(list.isEmpty());
  // so many features available in arraylist same as list
  }
}
