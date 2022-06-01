package OOD4.Threading.Demo.demo1;

public class Printer {
	
	public void printCountdown() {
		for (int i=50; i>0; i--) {
			System.out.println(Thread.currentThread().getName() + " :: counter: " + i);
		}
	}
}
