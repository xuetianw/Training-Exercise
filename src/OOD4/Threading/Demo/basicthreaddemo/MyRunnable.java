package OOD4.Threading.Demo.basicthreaddemo;

public class MyRunnable implements Runnable {
	public int counter = 0;
	
	@Override
	public void run() {
		while (counter < 100) {
			System.out.println(Thread.currentThread().getName() + "  " );
			counter++;			
			
			
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
	}
}
