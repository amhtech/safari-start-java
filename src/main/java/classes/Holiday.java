package classes;

public class Holiday extends Date {
  private String name;
  public Holiday(int d, int m, int y, String n) {
    super(d, m, y);
    this.name = n;
  }

  @Override
  public String toString() {
    return super.toString() + " a holiday called " + name;
  }
}
