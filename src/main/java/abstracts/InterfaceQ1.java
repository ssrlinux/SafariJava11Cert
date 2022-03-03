package abstracts;
interface Int1 {
  default void doStuff(Int1 this) { // this IS an instance method
    System.out.println("Int1.doStuff()");
  }
//  /*public abstract*/ void doAbstractStuff();
  private void doPrivateStuff(/*Int1 this*/) {}
  static void doStaticStuff() {} // public :)
  private static void doPrivateStaticStuff() {}
}

class Cl1 implements Int1 {
  public void doStuff() {
    System.out.println("Cl1.doStuff");
  }
}

public class InterfaceQ1 {
  public static void main(String[] args) {
    new Cl1().doStuff();
  }
}
