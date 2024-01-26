import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortList {
  public static void main(String[] args) {
    List<Integer> list= new ArrayList<>();
    list.add(5);
    list.add(4);
    list.add(3);
    list.add(2);
    list.add(1);

    // Using collection we can easily sort the list
    Collections.sort(list);
    System.out.println(list);

    // if we eant to dc orderd list simply used Coollections.reverd method easily reversed list

    Collections.reverse(list);
    System.out.println(list);

    // Now create a new list 
    List<String> list2=new ArrayList<>();
    list2.add(0, "s"); /* Its oneway ...also have an another way to simply put the elem*/
    list2.add(1, "sh");
    list2.add(2, "shu");

    System.out.println(list2);
    // if want to a specific elemet then we can used this get method ....can easily acces the elem
    System.out.println(list2.get(2));
  }
}
