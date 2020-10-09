package classes;

public class Date { // subclass of java.lang.Object
  private int day;
  private int month;
  private int year;

  // simle setter method
//  public/* static */void setDay(Date this, int day) {
  public void setDay(int day) { // IMPLICIT first argument called this..
    if (day < 1 || day > 31) throw new IllegalArgumentException("Bad day");
    this.day = day;
  }

  public int getDay() {
    return day;
  }

  public int getMonth() {
    return month;
  }

  public void setMonth(int month) {
    this.month = month;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public Date(int d, int m) {
    this(d, m, 2020);
  }
  // "constructor" (actually "initializer")
  public Date(int d, int month, int year) {
    if (d < 1 || d > 31 || month < 1 || month > 12){
      throw new IllegalArgumentException("Bad date");
    }
    // object built by new is called "this"
    day = d; // day implies this.day
    this.month = month;
    this.year = year;
  }
  public static String dayName(int day) {
    switch (day) {
      case 0: return "Saturday";
      case 1: return "Sunday";
      case 2: return "Monday";
      case 3: return "Tuesday";
      case 4: return "Wednesday";
      case 5: return "Thursday";
      case 6: return "Friday";
      default: throw new IllegalArgumentException("bad day number");
    }
  }
  public static int dayOfWeek(int day, int month) {
    return dayOfWeek(day, month, 2020);
  }
  public static int dayOfWeek(int day, int month, int year) {
    if (month < 3) {
      month += 12;
      year--;
    }
    return (day + (13 * (month + 1) / 5) + year + year / 4 - year / 100 + year / 400) % 7;
  }

  // Overrides the toString in Object...
  // BECAUSE it exactly matches the "signature" name, argument type sequence.
  @Override // changes nothing in the code, but adds a check that this IS in fact an override
  public String toString() {
    return "Date " + this.day + "/" + month + "/" + year;
  }

  // if you want content comparison, implement equals (and hashcode)
  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Date) {
      Date other = (Date)obj;
      return this.day == other.day && this.month == other.month && this.year == other.year;
    } else {
      return false;
    }
  }
}
