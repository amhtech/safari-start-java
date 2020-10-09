package exceptions;

public class Example {

  public static String dayName(int d) {
    if (d < 0 || d > 6) {
      throw new IllegalArgumentException("Bad day number " + d);
    }
    String[] names = {"Saturday", "Sunday", "Monday", "Tuesday", "Wendesday", "Thursday", "Friday"};
    return names[d];
  }

  public static void main(String[] args) {
    System.out.println("day 0 is " + dayName(0));
    try {
      System.out.println("About to try silly day name");
      String name = dayName(-1);
      System.out.println("day 0 is " + name);
      System.out.println("Name succesfully extracted");
    } catch (IllegalArgumentException ie) {
      System.out.println("oops, " + ie.getMessage());
    }
    System.out.println("Finished");
  }
}
