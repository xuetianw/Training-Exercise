package OOD1.Module7;

public class Main {
    public static void main(String[] args) {
        Processor processor1 =  new Processor("Dell", 22, 1);
        HardDrive hardDrive1 = new HardDrive("Dell", 2.2);
        Memory memory1 = new Memory("Dell,", 2.2, 2);
        Computer computer1 = new Computer("Dell", hardDrive1, memory1, processor1);


        Processor processor2 =  new Processor("Lenovo", 22, 1);
        HardDrive hardDrive2 = new HardDrive("Lenovo", 2.2);
        Memory memory2 = new Memory("Lenovo,", 2.2, 2);
        Computer computer2 = new Computer("Lenovo", hardDrive2, memory2, processor2);

        PowerSource powerSource = new PowerSource();
        powerSource.setWatts(110);
        computer1.getPower(powerSource);

        ComputerStore computerStore = new ComputerStore("Fred's store");
        computerStore.addComputer(computer1);
        computerStore.addComputer(computer2);
        System.out.println(computerStore.getAllComputers());


    }
}
