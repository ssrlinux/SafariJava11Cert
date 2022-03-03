package abstracts;

class Wrapper {
  abstract class Concept {
    String name;
    //  abstract String name;
    abstract void doStuff();
    private Concept() {}
    class ConceptNested extends Concept{

      @Override
      void doStuff() {
      }
    }
  }
}

abstract /*final*/ class Concept2 {
  abstract void doStuff();
  /*default*/ void doMoreStuff() {}
  private Concept2() {}
  class Thing extends Concept2 {
    public void doStuff() {}
  }
}



public class AnAbstract {
}
