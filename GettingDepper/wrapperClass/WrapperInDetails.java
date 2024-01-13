public class WrapperInDetails {
  public static void main(String[] args) {
    // creating object of the class using default constructor
    Integer i=new Integer("20"); /* String is applicable in Wrapper constructor but only acceptable 0-9 neumeric value if define any alphabetic value its gets an error  */
    Integer j=new Integer(20); /* Integer is applicable in Wrapper constructor  */
    // Integer k=new Integer("A0"); /* Its throws an error --> (NumberFormatException */
    System.out.println(i);
    System.out.println(j);
    // System.out.println(k);

  }
}
