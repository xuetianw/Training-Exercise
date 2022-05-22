package OOD2.Generics.GenericsDemo2;

public class Car extends Vehicle {
    public Car() {
        super();
    }

    public Car(String name, int numOfWheels, int year) {
        super(name, numOfWheels, year);
    }

    @Override
    public void drive() {
        System.out.println("drive :" + super.getName());
    }

    @Override
    public void park() {
        System.out.println("park :" + super.getName());
    }

    @Override
    public String toString() {
        return "Car{} " + super.toString();
    }
}
