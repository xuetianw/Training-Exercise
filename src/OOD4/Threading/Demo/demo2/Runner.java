package OOD4.Threading.Demo.demo2;

public class Runner {

	public static void main(String[] args) {
		Counter counter = new Counter();

		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int count = 1; count <= 1000000; count++) {
					counter.increment();
				}
			}
		});
		
		thread1.start();
		
//		try {
//			thread1.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		System.out.println(counter.getCount());

	}

}
