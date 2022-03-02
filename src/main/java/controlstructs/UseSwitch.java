package controlstructs;

public class UseSwitch {
  public static void main(String[] args) {
    int x = 3;
    switch (x) {
      case 1:
      case 2:
      case 3:
        System.out.println("it's 1, 2, or 3");
      case 4:
        System.out.println("4");
      default:
        System.out.println("something else");
    }
  }
}
