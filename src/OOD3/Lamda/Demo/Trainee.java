package OOD3.Lamda.Demo;

public class Trainee{
	private String firstName;
	private String lastName;
	private int mark;
	private String stream;
	
	public Trainee(String firstName, String lastName, int mark, String stream) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.mark = mark;
		this.stream = stream;
	}

	public Trainee(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Trainee(String firstName, String lastName, int mark) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.mark = mark;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}

	public String getStream() {
		return stream;
	}

	public void setStream(String stream) {
		this.stream = stream;
	}	
}
