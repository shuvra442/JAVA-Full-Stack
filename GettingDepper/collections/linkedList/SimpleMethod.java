package GettingDepper.collections.linkedList;

import java.util.LinkedList;

public class SimpleMethod {
  public static void main(String[] args) {
    LinkedList<String> list =new LinkedList<>();
    // Add element to the linkedList
    list.add("sh");
    list.add("shu");
    list.add("shuv");
    list.add("shuvr");
    list.add("shuvra");
    System.out.println(list);
    
    // Add elem in a specifice position..
    list.add(2,"patra");
    System.out.println(list);

    // Now add element in the first postion
    list.addFirst("Amit");
    list.addFirst("amity");
    System.out.println(list);

    // add in last position
    list.addLast("addLast1");
    list.addLast("addLast2");
    System.out.println(list);

    list.removeFirst();
    System.out.println("After remove First : "+list);
    list.removeLast();
    System.out.println("After remove Last : "+list);
  }
}