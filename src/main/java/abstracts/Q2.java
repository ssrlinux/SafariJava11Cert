package abstracts;

interface IntA {
  default void doStuff() { System.out.println("IntA.doStuff()"); }
}
interface IntB /*extends IntA*/ {
  default void doStuff() {  System.out.println("IntB.doStuff()"); }
//  void doStuff();
}
class ClA implements IntA, IntB {
  public void doStuff() {
    IntA.super.doStuff();
    IntB.super.doStuff();
    System.out.println("C1A.doStuff()");
  }
}

public class Q2 {
}
