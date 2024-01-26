package GettingDepper;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamEx {
  public static void main(String[] args) {
  //  1. example
    List<Integer> number = Arrays.asList(1,2,3,4,23,1);
    List<String> name= Arrays.asList("shuvra","surajit","Biswajit","Panu");
     number
    .stream()
    .forEach(numbers-> System.out.println(numbers));

    // 2. example
    List<Integer> sortedData = 
    number.stream().sorted().collect(Collectors.toList());
    System.out.println(sortedData);
    
    // 3. example
    Set<Integer> setData = 
    number.stream().sorted().collect(Collectors.toSet());
    System.out.println(setData);

    // 4. example
    List<String> namePrint=
    name.stream().filter(s-> s.startsWith("B"))
    .collect(Collectors.toList());
    System.out.println(namePrint);

    // 5. example
    List<Integer> findSquare=
    number.stream().map(x->x*x).collect(Collectors.toList());
    System.out.println(findSquare);
    
  }
}
