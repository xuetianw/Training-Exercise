package OOD4.Threading.Demo.basicthreaddemo;

public class MainApp {
	public static void main(String[] args) throws InterruptedException {
		MyRunnable run1 = new MyRunnable();
		MyRunnable run2 = new MyRunnable();
		
		Thread t1 = new Thread(run1, " Thread 1 ");
		Thread t2 = new Thread(run2, " Thread 2 ");
		
		t1.start();
		t1.join(); //make sure t1 finish before start the main thread
		
		System.out.println("Thread 1 died");
		
		t2.start();
	}
}
