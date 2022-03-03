package nested;

import java.util.function.Predicate;

public class FudgeInner {
  public Predicate<String> doStuff() {
    class MyPredicate implements Predicate<String> {
      int len;
      public MyPredicate(int l) {len = l;}
      @Override
      public boolean test(String s) {
        return s.length() > len;
      }
    }
    final int len = 3;

    Predicate<String> ps2 = new MyPredicate(len);

    Predicate<String> ps = new Predicate<String>() {
      @Override
      public boolean test(String s) {
        return s.length() > len; // line n1
      }
    };
    // line n2
//    len++;
//    System.out.println(++len);
    return ps;
  }

  public static void main(String[] args) {
    FudgeInner fi = new FudgeInner();

    System.out.println(fi.doStuff().test("hello"));

//    int x = 9;
//    (++x)++;
  }
}
