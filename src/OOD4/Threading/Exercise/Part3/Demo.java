package OOD4.Threading.Exercise.Part3;

// Java Program to demonstrate usage of wait() and notify()

class Demo {
    // variable to check if part1 has returned
    // volatile used to prevent threads from
    // storing local copies of variable
    volatile boolean part1done = false;

    // method synchronized on this
    // i.e. current object of demo
    synchronized void part1() {
        System.out.println("Welcome to India");
        part1done = true;
        System.out.println(
                "Thread t1 about to surrender lock");
        // notify the waiting thread, if any
        notify();
        notifyAll();
    }

    // method synchronized on this
    // i.e. current object of demo
    synchronized void part2() {
        // loop to prevent spurious wake-up
        while (!part1done) {
            try {
                System.out.println("Thread t2 waiting");
                // wait till notify is called
                wait();
                System.out.println(
                        "Thread t2 running again");
            } catch (Exception e) {
                System.out.println(e.getClass());
            }
        }
        System.out.println("Do visit Taj Mahal");
    }

    synchronized void part3() {
        // loop to prevent spurious wake-up
        while (!part1done) {
            try {
                System.out.println("Thread t2 waiting");
                // wait till notify is called
                wait();
                System.out.println(
                        "Thread t3 running again");
            } catch (Exception e) {
                System.out.println(e.getClass());
            }
        }
        System.out.println("Do visit Taj Mahal");
    }
}


