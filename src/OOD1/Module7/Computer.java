package OOD1.Module7;

public class Computer {
    private final String MODEL;
    private HardDrive hardDrive;
    private Memory memory;
    private final Processor PROCESSOR;

    public Computer(String model, HardDrive hardDrive, Memory memory, Processor processor) {
        this.MODEL = model;
        this.hardDrive = hardDrive;
        this.memory = memory;
        this.PROCESSOR = processor;
    }

    public void turnOn(){
        System.out.println("turn on");
    }

    public void turnOff() {
        System.out.println("turn off");
    }

    public void getPower(PowerSource powerSource) {
        System.out.println(powerSource.supplyPower() + " watts " +  "received from power source");
    }

    @Override
    public String toString() {
        return "Computer{" +
                "MODEL='" + MODEL + '\'' +
                ", hardDrive=" + hardDrive +
                ", memory=" + memory +
                ", PROCESSOR=" + PROCESSOR +
                '}';
    }
}
