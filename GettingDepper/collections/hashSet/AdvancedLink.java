package GettingDepper.collections.hashSet;

import java.util.*;

/*
 * Set is a collection which is unordered and unindexed
 * Its not contain ant duplicate element
 */

public class AdvancedLink {
  public static void main(String[] args) {
    Set<String> set = new HashSet<>();
    set.add("s");
    set.add("sh");
    set.add("shu");
    set.add("shuv");
    set.add("shuvr");
    set.add("shuvra");
    // Not contain any duplicate elements
    set.add("shuvra");
    System.out.println(set);

    // Differnet type of iterator in set
    Iterator<String> itr = set.iterator();
    while (itr.hasNext()) {
      String str=(String) itr.next();
      System.out.println("This is Used Iterator : "+str);
    }
    for( String e:set){
      System.out.println("This is used  For each Loop : "+e);
    }
    // Using lambda function JDK 8
    // omly used in hasghSet 
    set.forEach(e -> System.out.println("This is used  lembda : "+e));
  }
}
