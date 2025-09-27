package Ritik30;

public class HRSL {

	int id;
	String name;
	double salary;
	HRSL next;
	
	public HRSL() {
		// TODO Auto-generated constructor stub
	}

	public HRSL(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public HRSL getNext() {
		return next;
	}

	public void setNext(HRSL next) {
		this.next = next;
	}
	
	
}
