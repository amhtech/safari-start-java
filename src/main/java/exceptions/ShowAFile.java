package exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ShowAFile {
  public static void main(String[] args) {
    // InputStream is byte, Reader is char
    // InputStreamReader converts (based on local character encoding)
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // "checked exception" YOU SHOULD HANDLE THIS!
    try {
      String filename = br.readLine();
      BufferedReader fileIn = new BufferedReader(new FileReader(filename));

    } catch (IOException ioe) {
      System.out.println("that broke " + ioe.getMessage());
    }
    System.out.println("Finished");
  }
}
