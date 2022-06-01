package OOD4.Threading.Exercise;

import java.util.Random;

public class ThreadManagerChild extends ThreadManager {

    @Override
    public void creatThreads(int number) {
        for (int i = 0; i < number; i++) {
            threads.add(new Thread(() -> System.out.println(Thread.currentThread().getName()), "thread " + (i + 1)));
        }
    }
}
