package GettingDepper.collections.hashSet;

import java.util.Set; /* For set */
import java.util.HashSet; /* For HashSet */

public class SimpleHashed {
  public static void main(String[] args) {
    Set<String> set = new HashSet<String>();
    set.add("s");
    set.add("sh");
    set.add("shu");
    set.add("shuv");
    set.add("shuvr");
    set.add("shuvra");

    System.out.println(set);
    System.out.println(set.contains("s"));
    System.out.println(set.contains("sh"));
    System.out.println(set.contains("shu"));
    System.out.println(set.contains("shuv"));
    System.out.println(set.contains("shuvr"));
    System.out.println(set.contains("shuvra"));
    System.out.println(set.size());
    System.out.println(set.isEmpty());
    System.out.println(set.remove("shu"));
    System.out.println(set.remove("shuv"));
    System.out.println(set.remove("shuvr"));
    System.out.println(set.remove("shuvra"));
    System.out.println(set.size());
    System.out.println(set.isEmpty());  
    set.clear();
    System.out.println(set);  
  }
}
