package ex_May_25_Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class lab0147 {
    public static void main(String[] args) throws FileNotFoundException {
  readfile("www.path");

    }


      static void readfile(String filename) throws FileNotFoundException {
        int a = 10 / 10;
        int c = 0;
        int a1 = 10 / c;

          FileReader F =new FileReader(new File("www.path"));
    }
}
