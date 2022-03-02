package resolve;

public class ResolveOverloads {
  void doStuff(int x, int y) {}         // Method A
//  void doStuff(int x, long y) {}        // Method B
//  void doStuff(long x, int y) {}        // Method C
  /*void doStuff(double x, int y) {}*/
//  void doStuff(int ... x) {}            // Method D
//  void doStuff(Integer x, Integer y) {} // Method E
  /*void doStuff(Long x, Long y) {}*/
  /*void doStuff(Integer x, Number y) {}*/
  /*void doStuff(Number x, Integer y) {}*/

  void tryStuff() {
    doStuff(1, 2);
    // option 1 - exact match, or only "widening" conversions
    // if this produces ambiguity FAIL NOW
    // option 2 - boxing promotions
    // if this produces ambiguaity FAIL NOW
    // option 3 - varargs
    // ambiguity forces FAILURE
  }
}
