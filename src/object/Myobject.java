package object;

public class Myobject {


    public static void main(String[] args) {
        Car car = new Car("red",1);
        Car car2 = new Car("red",2);

        System.out.println(car.equals(car2));
    }
}
