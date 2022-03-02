package resolve;
class X {
  static int x = 99;
}
class Y extends X {
//  int x = 100;
  void doStuff() {
    // unqualified identifier searched as:
    // local
    // this prefix in our class (if available)
    // our class prefix
    // move up the class hierarchy (one level at a time)
//    int x = 200;
    System.out.println(this.x);
  }

  static void doMore(int x) {
    new Y().doStuff();
  }

  public static void main(String[] args) {
    doMore(98);
  }
}
public class Identifiers {
}
