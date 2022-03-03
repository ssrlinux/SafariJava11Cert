package accesscontrol;

public class WhatIsPrivate {
  private int x = 99;

  public static void main(String[] args) {
    WhatIsPrivate wip = new WhatIsPrivate();
    System.out.println(wip.x);
    Nested n = new Nested();
    System.out.println(n.x);
  }
  static class AnotherNested {
    public static void main(String[] args) {
      Nested n = new Nested();
      System.out.println(n.x);
    }
  }
  static class Nested {
    private int x = 100;
    public void stuff() {
      WhatIsPrivate w = new WhatIsPrivate();
      System.out.println(w.x);
    }
  }
}

class TryIt {
  public static void main(String[] args) {
//    System.out.println(new WhatIsPrivate().x);
  }
}