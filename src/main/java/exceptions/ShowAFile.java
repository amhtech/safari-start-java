package exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ShowAFile {
  public static void main(String[] args) throws IOException {
    // InputStream is byte, Reader is char
    // InputStreamReader converts (based on local character encoding)
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // "checked exception" YOU SHOULD HANDLE THIS!
    boolean success = false;
    while (! success) {
      try {
        String filename = br.readLine();
        // THIS FAILS TO CLOSE THE FILE... INVESTIGATE TRY WITH RESOURCES
        // AND OR FINALLY
        BufferedReader fileIn = new BufferedReader(new FileReader(filename));
        // also investigate PrintWriter, and FileWriter... :)
        String line;
        while ((line = fileIn.readLine()) != null) {
          System.out.println("> " + line);
        }
        success = true;
      } catch (IOException ioe) {
        System.out.println("that broke " + ioe.getMessage());
      }
    }
    System.out.println("Finished");
  }
}
