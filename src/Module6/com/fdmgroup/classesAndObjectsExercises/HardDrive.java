package Module6.com.fdmgroup.classesAndObjectsExercises;

public class HardDrive {
    private final String MODEL;
    private final double CAPACITY;
    private double usedSpace;

    public String getMODEL() {
        return MODEL;
    }

    public double getCAPACITY() {
        return CAPACITY;
    }

    public double getUsedSpace() {
        return usedSpace;
    }

    public HardDrive(String model, double capacity) {
        this.MODEL = model;
        this.CAPACITY = capacity;
    }

    String readData(String file) {
        return "data from " + file;
    }

    void writeData(String data, String file) {
        System.out.println("writeData");
        System.out.println("dada : " + data + "file : " + file);
    }


    public void setUsedSpace(double usedSpace) {
        this.usedSpace = usedSpace;
    }
}
