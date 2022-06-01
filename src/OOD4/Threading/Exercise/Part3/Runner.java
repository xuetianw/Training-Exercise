package OOD4.Threading.Exercise.Part3;

public class Runner {
    public static void main(String[] args) {
        AverageCalculator averageCalculator = new AverageCalculator();
        String fileName = "records1.txt";
        String fileName2 = "records2.txt";

//        FileReaderThread fileReaderThread = new FileReaderThread(averageCalculator, fileName);
//        fileReaderThread.start();
//
//        try {
//            fileReaderThread.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println("count: " + averageCalculator.getCount());
//        System.out.println("total: " + averageCalculator.getTotal());
//        System.out.println("average: " + averageCalculator.calculateAverage());

        FileReaderThread fileReaderThread1 = new FileReaderThread(averageCalculator, fileName);
        FileReaderThread fileReaderThread2 = new FileReaderThread(averageCalculator, fileName2);

        Thread currentTotalThread = new Thread(() -> {
            while(true) {
                System.out.println("count: " + averageCalculator.getCount());
                System.out.println("total: " + averageCalculator.getTotal());
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });


        fileReaderThread1.start();
        fileReaderThread2.start();
        currentTotalThread.start();

        try {
            fileReaderThread1.join();
            fileReaderThread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("count: " + averageCalculator.getCount());
        System.out.println("total: " + averageCalculator.getTotal());
        System.out.println("average: " + averageCalculator.calculateAverage());

        currentTotalThread.interrupt();

    }
}
