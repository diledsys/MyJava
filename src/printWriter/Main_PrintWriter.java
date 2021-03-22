package printWriter;

import java.io.*;
import java.util.Arrays;

public class Main_PrintWriter {
    public static void main(String[] args) {
        try {
            PrintWriter printWriter = new PrintWriter(new FileWriter("c:\\book.txt"));
            printWriter.write("some simple task text ");
            printWriter.append(" rrrrrrrrrrrr");
            printWriter.println(123456789);
            printWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

        {
            PrintWriter printWriter2 = new PrintWriter(System.out);
            printWriter2.println("text in console");
            printWriter2.append("ccc");
            printWriter2.flush();
            printWriter2.close();

            printWriter2.println("text in console");
            //printWriter2.append("ccc");
            printWriter2.flush();
            printWriter2.close();
        }

        try {
            PrintWriter printWriter3 = new PrintWriter("test");
            printWriter3.println("text");
            printWriter3.flush();
            printWriter3.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
