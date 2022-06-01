package OOD4.Threading.Demo.racecondition;

public class Counter {
	private int count;

	public synchronized void increment() {
		count++;
	}

	public synchronized void decrement() {
		count--;
	}

	public int getCount() {
		return count;
	}
}
