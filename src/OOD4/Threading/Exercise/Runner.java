package OOD4.Threading.Exercise;

import java.util.Random;

public class Runner {
    public static void main(String[] args) {
//        ThreadManager threadManager = new ThreadManager();
        Random random = new Random();
//        threadManager.creatThreads(random.nextInt(5));
//        threadManager.runThreads();

        ThreadManager threadManager1 = new ThreadManagerChild();
        threadManager1.creatThreads(random.nextInt(5));
        threadManager1.runThreads();

    }
}
