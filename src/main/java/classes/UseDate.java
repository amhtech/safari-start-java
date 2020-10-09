package classes;

public class UseDate {
  public static void main(String[] args) {
//    Date today = new Date();
//    today.day = 9;

    // "construction" is done by new
    // initialization is done by the "constructor"
    Date today = new Date(9, 10, 2020);
//    System.out.println(today.day);
    System.out.println(today.getDay());
    Date bad = new Date(1, 1, 2020);
//    bad.day = 34;
//    Date.setDay(bad, 34);
//    bad.setDay(34);
//    System.out.println("Bad is " + bad.day);
    System.out.println("Bad is " + bad.getDay());
    System.out.println("Entire today date is " + today);

    Date d1 = new Date(1, 1, 2020);
    Date d2 = new Date(1, 1, 2020);
    System.out.println("d1 == d2 " + (d1 == d2));
    System.out.println("d1.equals(d2) " + (d1.equals(d2)));

    Date newYears = new Holiday(1, 1, 2021, "new year's day");

    System.out.println("holiday is " + newYears);

  }
}
