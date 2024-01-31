package GettingDepper.collections.linkedList;

import java.util.LinkedList;
import java.util.*;

public class AdvancedLinkedList {
  public static void main(String[] args) {
    LinkedList <String> list2= new LinkedList<>();
    list2.add("P");
    list2.add("Pa");
    list2.add("Pat");
    list2.add("Patr");
    list2.add("Patra");
    System.out.println("New List is :"+list2);
    // Access the first element
    System.out.println(list2.getFirst());
    // Access the last element
    System.out.println(list2.getLast());
    System.out.println(list2);
    
    // Removing elements from linked list using remove() method
    System.out.println(list2.removeFirst());
    System.out.println(list2.removeLast());
    System.out.println(list2);

    /*
     * Different type of iterator in linkedList
     * 1. iterator
     * 2. advanced foreach
     * 3. for loop
     */
    Iterator <String> itr = list2.iterator();
    while (itr.hasNext()) {
      String str=(String) itr.next();
      System.out.println("This is Used Iterator : "+str);
    }
    for( String e:list2){
      System.out.println("This is used  For each Loop : "+e);
    }
 
    for(int i=0;i<list2.size();i++){
      System.out.println("This is used  normal for loop : "+list2.get(i));
    }
  }
}
