package clonable.serealizable;

import java.io.*;

public class Cow implements Serializable {
    private String name;
    private int age;
    private int weight;

    public Cow(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    protected Cow cloneS(Cow cow)  {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();// выделяем место в памяти
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(baos);  // сериализуем обьект в память
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            oos.writeObject(cow); //записываем в память
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            oos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());// считываем
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(bais);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            Cow cloneCow =(Cow) ois.readObject();
            cloneCow.name= "Duska"; // меняем значение в поле name
            return cloneCow;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String toString() {
        return "Cow{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}

