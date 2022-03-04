package gcandpooling;

public class IntegerStuff {
  public static void main(String[] args) {
//    Integer a = Integer.valueOf(1);
//    Integer b = Integer.valueOf(1);
//    Integer a = 1;
//    Integer b = 1;
    Integer a = new Integer(1);
    Integer b = new Integer(1);
    System.out.println(a == b);

    System.out.println("String pooling...");
    String s0 = "Hello";
    String s1 = "Hello";
    String s2 = "He";
    String s3 = s2 + "llo";
    System.out.println(s0);
    System.out.println(s1);
    System.out.println(s2);
    System.out.println(s3);
    System.out.println("s1 == s0 " + (s1 == s0));
    System.out.println("s1 == s2 " + (s1 == s2));
    System.out.println("s1 == s3 " + (s1 == s3));
    String s4 = s3.intern();
    System.out.println("s1 == s4 " + (s1 == s4));


  }
}
