package serialize.car;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Volvo", 180, "red", "logo");
        try {
            Serialize.serializable(car);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            Car carLoad =(Car) Serialize.deserializable();
            System.out.println(carLoad.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
