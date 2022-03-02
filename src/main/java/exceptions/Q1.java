package exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class Q1 {
  void doStuff() throws IOException {};
  void doStuff2() throws FileNotFoundException {};

  void tryStuff() {
    try {
      doStuff();
      doStuff2();
      if (Math.random() > 0.5) throw new SQLException();
    } catch (IOException | SQLException e) { /*handle both exceptions */
    }
//     catch (IOException e) {}

  }
//  A) catch (IOException | FileNotFoundException e)
//  B) catch (FileNotFoundException | IOException e)
//  C) catch (FileNotFoundException e)
//  D) catch (IOException e)
//  E) finally
}
