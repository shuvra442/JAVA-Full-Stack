
import java.util.*;
import java.util.stream.Collectors;

/**
 * List --> List is an interface
 */

public class ListEx {
  public static void main(String[] args) {
    List<String> list= new ArrayList<>();
    // Now the elemt in the list
    list.add("Hello");
    list.add("World");
    System.out.println("Original List: " +list);
    // sout the size of the array
    System.out.println(list.size());
    // sout the class of the list
    System.out.println(list.getClass());
    // sout true or flase if list is empty return false otherwish sout the true
    System.out.println(list.isEmpty());
    System.out.println(list.iterator());
    list.stream().sorted().collect(Collectors.toList());
    System.out.println(list);
  }
}
