package nested;

import java.lang.reflect.Constructor;

class Outer {
  String nameOfOuter = "Outer";
  String x = "OuterX";
  class Inner {
    // instance inners can't have static members
//    static String name = "Fails";
    String nameOfInner = "Inner";
    String x = "InnerX";
    Inner() {}
    void showName() {
      System.out.println("nameOfOuter is " + nameOfOuter);
      System.out.println("nameOfInner is " + nameOfInner);
      System.out.println("x is " + this.x);
      System.out.println("x is " + Outer.this.x);
    }
  }

  Inner makeOne() {
    // anonymous inner of subtype of Outer
//    new Outer() { Inner in = this.new Inner(); };

//    class Odd{}
//    Object o = new Odd();
    return new Inner();
//    return this.new Inner();
  }
}
public class Q1 {
  public static void main(String[] args) {
    Class<?> cl = Outer.Inner.class;
    Constructor [] constructors = cl.getDeclaredConstructors();
    for (Constructor c : constructors) {
      System.out.println(c);
    }

//new Inner();
//    new Outer.Inner();
    Outer ou = new Outer();  ou.new Inner();
    new Outer().new Inner();
  }
}
