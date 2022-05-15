package Module10;

public class Laptop implements Basketltem{
    private String name;
    private double price;
    private double cpuSpeed;
    private double hardDrive;

    public double getCpuSpeed() {
        return cpuSpeed;
    }

    public void setCpuSpeed(double cpuSpeed) {
        this.cpuSpeed = cpuSpeed;
    }

    public double getHardDrive() {
        return hardDrive;
    }

    public void setHardDrive(double hardDrive) {
        this.hardDrive = hardDrive;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "name='" + name + '\'' +
                ", cpuSpeed=" + cpuSpeed +
                ", hardDrive=" + hardDrive +
                '}';
    }
}
