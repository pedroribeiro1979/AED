import java.util.Scanner;
import java.util.LinkedList;

public class TestMap {
  public static void main(String[] args) {
    String  phoneList = "Nuno 960234576  Clara 960112343 Laura 919245333 Jorge 939122227";
    Scanner in = new Scanner(phoneList);
    Map<String,Integer> m1 = new Map<String,Integer>();
    while(in.hasNext()) 
	LibMap.put(m1, in.next(), in.nextInt());
    System.out.println("size:  " + LibMap.size(m1));
    System.out.println(LibMap.toString(m1));
    System.out.println("Laura's phone is " + LibMap.get(m1, "Laura"));
    System.out.println("Keys -> " + LibMap.keys(m1));
    Map<Integer,String> m2 = LibMap.invert(m1);    
    System.out.println("the inverted map is as follows...");
    System.out.println(LibMap.toString(m2));
    System.out.println("Keys -> " + LibMap.keys(m2));

  }
}
