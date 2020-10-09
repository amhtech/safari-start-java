package many;

public class WhileLoop {
  public static void main(String[] args) {
    int count = 3;
    while (count > 0) {
      System.out.println("count is " + count--);
//      count = count - 1;
//      count -= 1;
//      count--;
    }
  }
}
