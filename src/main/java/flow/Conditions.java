package flow;

public class Conditions {
  public static void main(String[] args) {
    int x = 99;

    // parens required, expression MUST be boolean
    if (x > 100) {
      System.out.println("x is bigish");
    } else if (x > 200) { // no "elif" not needed
      System.out.println("x is very big");
    } else {
      System.out.println("x is smallish");
    }

    switch (x) { // only int numerics, String, and enums
      case 1:
        System.out.println("it's one!!!");
        break;
      case 99:
        System.out.println("it's ninety nine...");
        break;
      default:
        System.out.println("it's something else");
        break;
    }

    // ternary operator is an IF "expression"
    String message = x == 99 ? "it's 100" : "it's not";
    System.out.println(message);
  }
}
