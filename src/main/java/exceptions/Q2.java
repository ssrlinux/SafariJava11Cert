package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLException;

public class Q2 {
  void doStuff() throws SQLException {};
  void doStuff2() throws FileNotFoundException {};
  void tryStuff() throws FileNotFoundException, SQLException {
    try {
      doStuff();
      doStuff2();
    } catch (FileNotFoundException | SQLException e) {
//      final Exception e1 = e; throw e1; // fails
      throw e;
    }
  }
}
