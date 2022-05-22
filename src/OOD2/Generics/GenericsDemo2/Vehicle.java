package OOD2.Generics.GenericsDemo2;

public abstract class Vehicle {
    private String name;
    private int numOfWheels;
    private int year;

    public Vehicle() {
    }

    public Vehicle(String name, int numOfWheels, int year) {
        this.name = name;
        this.numOfWheels = numOfWheels;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", numOfWheels=" + numOfWheels +
                ", year=" + year +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumOfWheels() {
        return numOfWheels;
    }

    public void setNumOfWheels(int numOfWheels) {
        this.numOfWheels = numOfWheels;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public abstract void drive();

    public abstract void park();
}
