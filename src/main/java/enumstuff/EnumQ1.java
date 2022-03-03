package enumstuff;

import java.lang.reflect.Constructor;

enum Day {
  MONDAY(1), TUESDAY;
  Day(int d) {}
  Day() {}

  @Override
  public String toString() {
    return "Enum Day with value: " + name(); // name is a final method
  }
}

public class EnumQ1 {
  public static void main(String[] args) {
    System.out.println(Day.MONDAY);
    Class<?> cl = Day.class;
    Constructor[] cons = cl.getDeclaredConstructors();
    for (Constructor c : cons) {
      System.out.println(c);
    }
  }
}
