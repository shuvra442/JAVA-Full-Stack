package BasicOfJava.basicKeywordEx;

class CallBy{
  int data=50;
  void change(int data){
    data=data+100;
    System.out.println(data);
  }

  void dataa(CallBy op){
    op.data=op.data+100;
  }
}

public class CallByValue {
  public static void main(String[] args) {
    CallBy callBy=new CallBy();
    System.out.println("Before chnage the value is ::"+callBy.data);
    callBy.change(100);
    System.out.println("After changes the valus is ::"+callBy.data);
    callBy.dataa(callBy);
    System.out.println("Creating obejct we can change value :"+callBy.data);
  }
}
