package Module6.com.fdmgroup.classesAndObjectsExercises;

public class Runner {
    public static void main(String[] args) {
        HardDrive hardDrive1 = new HardDrive("Seagate", 2);
        HardDrive hardDrive2 = new HardDrive("Dell", 3);

        hardDrive1.setUsedSpace(0);
        hardDrive2.setUsedSpace(500);

        System.out.println(hardDrive1.getCAPACITY());
        System.out.println(hardDrive1.getMODEL());
        System.out.println(hardDrive1.getUsedSpace());

        System.out.println(hardDrive2.getCAPACITY());
        System.out.println(hardDrive2.getMODEL());
        System.out.println(hardDrive2.getUsedSpace());


        Processor processor1 = new Processor("Kingston", 1600, 6);
        Processor processor2 = new Processor("Intel Celeron", 2.9, 2);


        Memory memory1 = new Memory("Kingston", 4, 1600);
        Memory memory2 = new Memory("Corsair", 8, 1333);

        hardDrive1.setUsedSpace(50);
        System.out.println(hardDrive1.getUsedSpace());


    }
}
