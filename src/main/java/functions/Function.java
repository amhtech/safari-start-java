package functions;

public class Function {
  // access public, private-- between top level curly braces surrounding declaration
  // protected, "default"

  // ... accepts an array, but the caller might change...
  // variable part (...) must be last in the argument list...
  public static void showAll(int ... nums) {
    for (int n : nums) {
      System.out.println("> " + n);
    }
  }

  public static int dayOfWeek(int day, int month) {
    return dayOfWeek(day, month, 2020);
  }
    // Zeller's Congruence 0 = Saturday -> 6 = Friday
  // Java does not have "named parameters" nor "default values"
  public static int dayOfWeek(int day, int month, int year) {
    if (month < 3) {
      month += 12;
      year--;
    }
//    int rv = (day + (13 * (month + 1) / 5) + year + year / 4 - year / 100 + year / 400) % 7;
//    return rv;
    return (day + (13 * (month + 1) / 5) + year + year / 4 - year / 100 + year / 400) % 7;
  }

  public static void main(String[] args) {
    int month = 1;
    System.out.println("Day of jan 1 2000 is " + dayOfWeek(1, month, 2000));
    System.out.println("month is " + month);
    System.out.println("Today is " + dayOfWeek(9, 10, 2020));
    System.out.println("Today is " + dayOfWeek(9, 10));

//    int [] ia = {1, 2, 3, 4};
//    showAll(new int []{1, 2, 3, 4});
    showAll(1, 2, 3, 4); // target uses ... compiler builds the array for us
  }
}
