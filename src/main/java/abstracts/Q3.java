package abstracts;

import java.io.Serializable;

abstract class Concept3 {
  abstract void doStuff();
  void doMoreStuff() {}
  protected Concept3() {}
}

class Concrete extends Concept3 implements Serializable {
  void doStuff() {}
}

public class Q3 {
}
