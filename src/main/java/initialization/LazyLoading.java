package initialization;

class Singleton {
  private static Singleton self = new Singleton();
  {
    System.out.println("Instantiating Singleton");
  }
  static {
    System.out.println("Loading Singleton class");
  }
  public static Singleton get() {
    return self;
  }
}

public class LazyLoading {
  public static void main(String[] args) {
    System.out.println("Step one, declare variable");
    Singleton s;
    System.out.println("Step two, find defining class");
    Class<?> cl = Singleton.class;
    System.out.println("Step three, start using the Singleton");
    s = Singleton.get();
    System.out.println("All done...");
  }
}
