package OOD2.Generics.GenericsDemo2;

public class SUV extends Vehicle implements AllWheelDrive {
    public SUV() {
    }

    public SUV(String name,  int year) {
        super(name, 4, year);
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerating SUV" + getName());
    }

    @Override
    public void drive() {
        System.out.println("Driving SUV" +  getName());
    }

    @Override
    public void park() {
        System.out.println("Parking the car " + getName());
    }
}
