package hello; // package can be dotted, e.g. greetings.hello
// packages MUST EXACTLY match directory structure (dots => directory separators)

public class Hello { // ALL "interesting" code MUST BE IN a type (class)
  // where does my program start?
  public static void main(String[] args) {
    System.out.println("Hello World!");
  }
}
