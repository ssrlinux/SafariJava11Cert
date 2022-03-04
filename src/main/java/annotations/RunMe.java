package annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@interface AnotherAnnotation {}
enum DayOfWeek { MONDAY; }
@Retention(RetentionPolicy.RUNTIME)
//@Target({ElementType.METHOD})
@Target(ElementType.METHOD)
//public @ interface RunMe {
public @interface RunMe {
  // annotation "elements" -- key/value pairs -- cannot have names
  // of methods in Object
  String value() default "Unknown"; // String
  int count() default 0; // primitives YES
  Class theClass() default java.lang.Object.class;
  AnotherAnnotation annot() default @AnotherAnnotation;
  DayOfWeek day() default DayOfWeek.MONDAY;

  // SINGLE dimension arrays only!
  String [] colors() default { "Red", "Green", "Blue" };

//  Integer bad();
}
