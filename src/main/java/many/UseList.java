package many;

import java.util.ArrayList;
import java.util.List; // NO CHANGE to binary (not #include..)

public class UseList {
  public static void main(String[] args) {
//    java.util.List<String> names;
//    List<String> names = new ArrayList<String>();
    List<String> names = new ArrayList<>();
    names.add("Fred");
    names.add("Jim");
    names.add("Sheila");
    System.out.println(names);
    String third = names.get(2); // Zero indexed!!
    System.out.println(third);

    for (String n : names) {
      System.out.println("> " + n);
    }
  }
}
