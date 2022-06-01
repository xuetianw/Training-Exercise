package OOD4.Threading.Demo.demo1;

public class ThreadDemo extends Thread{
	private String threadName;
	private Printer p;
	
	
	public ThreadDemo() {
		super();
	}

	public ThreadDemo(String threadName, Printer p) {
		super();
		this.threadName = threadName;
		this.p = p;
	}

	public String getThreadName() {
		return threadName;
	}

	public void setThreadName(String threadName) {
		this.threadName = threadName;
	}

	public Printer getP() {
		return p;
	}

	public void setP(Printer p) {
		this.p = p;
	}

	@Override
	public void run() {
		System.out.println("Thread " + threadName + " has been started");
		
		p.printCountdown();
		
		System.out.println("Thread " + threadName + " has been completed");
	}
	
}
