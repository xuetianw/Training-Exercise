package OOD2.Generics.GenericsDemo2;

public class Sedan extends Vehicle implements AllWheelDrive {
    public Sedan() {
    }

    public Sedan(String name, int year) {
        super(name, 4, year);
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerating Sedan" + getName());
    }

    @Override
    public void drive() {
        System.out.println("Driving Sedan" +  getName());
    }

    @Override
    public void park() {
        System.out.println("Parking the Sedan " + getName());
    }
}
