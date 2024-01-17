package GettingDepper.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

/**
 * Define the collection framework 
 * Collection is the praent interface all the intrefaces.
 * which belongs in the java.util package
 */

class CollectionsEx{
  public static void main(String[] args) {
    Collection<String> name= new ArrayList<String>();
    
    //add elements to the arraylist using add() method of ArrayList class
    name.add("shuvra");
    name.add("shuvankar");
    name.add("soumik");
    // sout the size of the arrayList
    System.out.println("The size of the collection : "+name.size());
    // Now removed the arrayList
    System.out.println("After removing the element from the list: ");
    name.remove("shuvankar");
    System.out.println(name);
    // ccheck to contain opertor 
    System.out.println(name.contains("shuvra"));
    // check for empty or not
    if (name.isEmpty()==false) {
      name.add("shuvankar");
    } else{
      System.out.println("Is Empty");
    }
    // Now sout the ArrayList using forEach
    System.out.print("\nElements are : \n");
    name.forEach(elem->{
      System.out.println(elem);
    });

    // Now explor the stream operator
    System.out.println("Check the stream method");
    name
    .stream()
    .sorted()
    .collect(Collectors.toList());
    System.out.println(name);

    System.out.println(name.hashCode());

    Collection<Integer> number= new ArrayList<Integer>();
    number.add(2);
    number.add(1);
    number.add(3);
    number.add(4);
    System.out.println(name.equals(number));
  }
}