package object;

public class Car {

    String color;
    int id;

    public Car(String color, int id) {
        this.color = color;
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;

        Car car = (Car) o;

        if (id != car.id) return false;
        return color.equals(car.color);
    }

    @Override
    public int hashCode() {
        int result = color.hashCode();
        result = 31 * result + id;
        return result;
    }
}
