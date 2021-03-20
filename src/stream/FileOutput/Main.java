package stream.FileOutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args)  {
       try (FileOutputStream fos = new FileOutputStream(new File("c:\\book.txt"))) {
           fos.write("same text".getBytes());
       } catch (IOException e) {
           e.printStackTrace();
       }

    }
}
