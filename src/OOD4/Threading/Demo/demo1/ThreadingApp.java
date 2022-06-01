package OOD4.Threading.Demo.demo1;

public class ThreadingApp {
	public static void main(String[] args) {
		Printer p = new Printer();
		
		ThreadDemo t1 = new ThreadDemo("Thread 1 " , p);
		ThreadDemo t2 = new ThreadDemo("Thread 2 " , p);
		ThreadDemo t3 = new ThreadDemo("Thread 3 " , p);
		ThreadDemo t4 = new ThreadDemo("Thread 4 " , p);
		
		t1.start();
		t2.start();
//		try { 
//			t1.join();
//			t2.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		
		t3.start();
		t4.start();
		
		System.out.println("Now All Threads Have been Completed");
	}
}
