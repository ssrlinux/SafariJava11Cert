package annotations;

import java.lang.reflect.Method;

public class TestRunner {
  public static void main(String[] args) throws Throwable {
    String uutName = "annotations.UnitUnderTest";
    Class<?> theClass = Class.forName(uutName);
    Object thisObject = theClass.getDeclaredConstructor().newInstance();

    Method[] methods = theClass.getDeclaredMethods();
    for (Method m : methods) {
      System.out.println("> " + m);
      RunMe annot = m.getAnnotation(RunMe.class);
      if (annot != null) {
        System.out.println("***** RunMe!!! name=" + annot.value()
          + " count=" + annot.count());
        m.setAccessible(true);
        m.invoke(thisObject);
      }
    }
  }
}
