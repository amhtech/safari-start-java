package hello; // package can be dotted, e.g. greetings.hello
// packages MUST EXACTLY match directory structure (dots => directory separators)

public class Hello { // ALL "interesting" code MUST BE IN a type (class)
  // where does my program start?
  public static void main(String[] args) {
    System.out.println("Hello World!");
    int x = 99;
    System.out.println(x);
    x = 100;
//    x = "Hello";
//    x = 3.2;
    int y = 100;
    int z = 101;
//    int a = y + 3.2;
    boolean xequalsy = x == y;
    System.out.println("x equals y? " + xequalsy);

    String s = "Hello";
    String t = "He";
    String u = t + "llo";
    System.out.println("s is " + s);
    System.out.println("u is " + u);
    System.out.println("s == u? " + (s == u));
    System.out.println("s.equals(u)? " + s.equals(u));
    s.toUpperCase(); // Strings are "immutable"
    String upper = s.toUpperCase();
    System.out.println(s);
    System.out.println(upper);
    String dup = "Hello";
    System.out.println("s == dup? " + (s == dup));

    StringBuilder sb = new StringBuilder("Hello");
    StringBuilder sb1 = new StringBuilder("Hello");
    System.out.println("sb == sb1? " + (sb == sb1));
    System.out.println("sb.equals(sb1)? " + (sb.equals(sb1)));
    System.out.println("sb.equals(sb1)? " + (sb.toString().equals(sb1.toString())));

    // Operators such as + - * / %
    // Comparisons == != < > <= >=
    // boolean operators && || !
    // bitwise & | ^
    // assignement operators += -= etc...

    double pi = 3.14159;
    pi += 99; // pi = pi + 99
    System.out.println(pi);

    // assignment has value :)
    System.out.println("pi is " + (pi = 3.14159));


  }
}
