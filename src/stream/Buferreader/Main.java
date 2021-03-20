package stream.Buferreader;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        try {
            String str =bf.readLine();
            System.out.println(str);
            bf.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            BufferedReader br = new BufferedReader(new FileReader(new File("c:\\book.txt")));
            String sPrint =br.readLine();
            System.out.println(sPrint);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            BufferedInputStream bris =new BufferedInputStream(new FileInputStream("c:\\book.txt"));
            while (bris.available()>0){
                char ch=(char) bris.read();
                System.out.println(ch);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
