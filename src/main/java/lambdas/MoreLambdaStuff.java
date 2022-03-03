package lambdas;

import java.util.function.ToIntFunction;

public class MoreLambdaStuff {
  static class StrLen implements ToIntFunction<String> {
    @Override
    public int applyAsInt(String s) {
      if (s.equals("")) return 0;
      else return 1 + this.applyAsInt(s.substring(1));
    }
  }

  public static void main(String[] args) {
    ToIntFunction<String> len1 = new StrLen();
    System.out.println("Length of hello is " + len1.applyAsInt("hello"));

    ToIntFunction<String> len2 = new ToIntFunction<String>() {
      @Override
      public int applyAsInt(String s) {
        if (s.equals("")) return 0;
        else return 1 + this.applyAsInt(s.substring(1));
      }
    };
    System.out.println("Length of hello using len2 is " + len2.applyAsInt("hello"));

    // this one fails; lambdas do NOT create a "this" context of their own
//    ToIntFunction<String> len3 = (String s) -> {
//      if (s.equals("")) return 0;
//      else return 1 + this.applyAsInt(s.substring(1));
//    };
//    System.out.println("Length of hello using len2 is "
//    + len2.applyAsInt("hello"));
  }
}
