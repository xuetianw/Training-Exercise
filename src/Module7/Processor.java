package Module7;

public class Processor {
    final String MODEL;
    final double speed;
    final int NUM_OF_CORES;

    public Processor(String model, double speed, int num_of_cores) {
        this.MODEL = model;
        this.speed = speed;
        this.NUM_OF_CORES = num_of_cores;
    }

    void processData(String data) {
        System.out.println("data :" + data);
    }

    public String getMODEL() {
        return MODEL;
    }

    public double getSpeed() {
        return speed;
    }

    public int getNUM_OF_CORES() {
        return NUM_OF_CORES;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "MODEL='" + MODEL + '\'' +
                ", speed=" + speed +
                ", NUM_OF_CORES=" + NUM_OF_CORES +
                '}';
    }
}
