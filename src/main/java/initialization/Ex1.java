package initialization;

class P {
//  public P(int x) {}
}

class S extends P {
//  S() { // Compiler generated default!!!
//    super();
//    // instance init
//  }
}
public class Ex1 {
  public static void main(String[] args) {
    new S();
  }
}
