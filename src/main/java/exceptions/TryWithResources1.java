package exceptions;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;

public class TryWithResources1 {
  public static void main(String[] args) throws Throwable {
//    BufferedReader br = null;
//    try {
//      /*BufferedReader */br = Files.newBufferedReader(Path.of("text.txt"));
//    } catch (IOException ioe) {
//
//    } finally {
//      if (br != null) {
//        try {
//          br.close();
//        } catch (IOException io) {}
//      }
//    }

    BufferedReader br = Files.newBufferedReader(Path.of("text.txt"));
    try (
//        br; // will be closed too! (PROVIDED br is final, or effectively final)
        var br2 = br;
        PrintWriter pw = new PrintWriter(new FileWriter("out.txt"));
        ) {

    } catch (IOException ioe) {

    }
    br = null;
    System.out.println(br);
  }
}
