package controlstructs;

public class UseIf {
  public static void main(String[] args) {
    double x = Math.random();
    if (x > 3) { // MUST HAVE boolean (or Boolean) expression, in parens
    } else if (x < 2) {

    }

    var s =
        (x > 0.5) ? "Big number" : 99;
    System.out.println(s);
//    s.compareTo();
  }
}
