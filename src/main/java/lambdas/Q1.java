package lambdas;

import java.util.List;
import java.util.function.BiPredicate;

interface StudentCriterion {
  boolean test(Student s);
}

class Student {
  public int getGpa() {
    return 0;
  }

  public List<String> getCourses() {
    return null;
  }
}

public class Q1 {
  public static void main(String[] args) {

//    StudentCriterion sc = Student s -> {
//      return s.getGpa() > 3;
//    };
//
//    StudentCriterion sc = s -> {
//      s.getGpa() > 3
//    };

//    Object sc = s -> {
//      return s.getGpa() > 3;
//    };

//    StudentCriterion sc = (s) -> s.getGpa() > 3;
    StudentCriterion sc = s -> {
      return s.getGpa() > 3;
    };

    BiPredicate<String, String> bpss = (s1, s2) -> true  ;


//    StudentCriterion sc = s -> s.getCourses().size();
  }

}
