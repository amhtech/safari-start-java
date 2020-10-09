package many;

public class UseArray {
  public static void main(String[] args) {
    // subscripts start a zero, always contiguous (no sparse arrays)
    // index is int type
    int [] ia = {1, 2, 9, 8, 7};
    System.out.println("ia[0] " + ia[0]);
    System.out.println("ia[0] " + ia);
    ia[0] = 99;
    System.out.println("ia[0] " + ia[0]);
    System.out.println("length is " + ia.length);

    for (int i : ia) {
      System.out.println(">> " + i);
    }
  }
}
