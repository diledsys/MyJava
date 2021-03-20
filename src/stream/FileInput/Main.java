package stream.FileInput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        try (FileInputStream fis = new FileInputStream(new File("c:\\book.txt"))) {
            while (fis.available()>0){
                char ch = (char) fis.read();
                System.out.println(ch);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
