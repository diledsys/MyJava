package serialize.car;

import java.io.*;

public class Serialize {

    public static void serializable(Object object) throws IOException {

        String fPath = "src\\serialize\\car.car";
        try (FileOutputStream fs = new FileOutputStream(fPath);
             ObjectOutputStream oos = new ObjectOutputStream(fs)) {
            oos.writeObject(object);
        }
    }

    public static Object deserializable() throws IOException {

        String fPath = "src\\serialize\\car.car";
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(fPath);
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException");
        }
        ObjectInputStream ois = new ObjectInputStream(fis);
        try {
            return ois.readObject();
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
            System.out.println("ClassNotFoundException");
        }
        return null;
    }
}
