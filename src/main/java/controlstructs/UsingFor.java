package controlstructs;

import java.util.Collection;

public class UsingFor {
  public static void main(String[] args) {

    Collection<String> cs = null;
    for (String s : cs) {
      // there is NO COUNTER
    }

    int x = 0, y = 99;
    for (System.out.println(x), y++;
//    for (int x = 0, ia[] = {1,2,3}, y = 99, j;
         x < 10;
         x++, y--) {
    }
  }
}
