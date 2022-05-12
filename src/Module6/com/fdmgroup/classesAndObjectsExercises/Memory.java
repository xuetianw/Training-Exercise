package Module6.com.fdmgroup.classesAndObjectsExercises;

public class Memory {
    final String MODEL;
    final double CAPACITY;
    double usedSpace;
    final double SPEED;


    public Memory(String model, double capacity, double speed) {
        this.MODEL = model;
        this.CAPACITY = capacity;
        this.SPEED = speed;
    }


    public double getUsedSpace() {
        return usedSpace;
    }

    public void setUsedSpace(double usedSpace) {
        this.usedSpace = usedSpace;
    }

    void storeData(String data) {
        System.out.println("data : " + data);
    }


    public String getMODEL() {
        return MODEL;
    }

    public double getCAPACITY() {
        return CAPACITY;
    }

    public double getSpeed() {
        return SPEED;
    }
}
