package clonable.car;

public class Main {
    public static void main(String[] args) {
        Car car =  new Car("Renault","metalic",230);
        Car clonablCar = Car.newInstanceof(car);
        System.out.println(clonablCar);

    }
}
