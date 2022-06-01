package OOD4.Threading.Exercise;

import java.util.ArrayList;
import java.util.List;

public class ThreadManager {
    protected List<Thread> threads = new ArrayList<>();

    public void creatThreads(int number) {
        MyRunnable myRunnable = new MyRunnable();

        for (int i = 0; i < number; i++) {
            threads.add(new Thread(myRunnable, "thread " + (i + 1)));
        }
    }

    public void runThreads() {
        threads.forEach(t -> t.start());
    }
}
