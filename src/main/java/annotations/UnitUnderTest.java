package annotations;

//@RunMe
public class UnitUnderTest {
//  @RunMe
  String message = "Hello";

//  @RunMe("Fred", count = 10) // NO! Can't leave out value = when
  // there are multiple key/value pairs being specified
  @RunMe(value = "Fred", count = 10)
  public void itShouldWork() {
    System.out.println("It should work");
  }

  @RunMe("Alice")
  private void itShouldStillWork() {
    System.out.println("It should still work");
  }

  public void itShouldNotRunThis() {
    System.out.println("It should not run this");
  }
}
