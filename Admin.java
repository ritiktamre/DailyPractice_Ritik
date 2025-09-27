package Ritik30;

public class Admin {

	int id;
	String name;
	double salary;
	double allowance;
	Admin next;
	
	public Admin() {
		// TODO Auto-generated constructor stub
	}

	public Admin(int id, String name, double salary, double allowance) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.allowance = allowance;
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

	public double getAllowance() {
		return allowance;
	}

	public void setAllowance(double allowance) {
		this.allowance = allowance;
	}

	public Admin getNext() {
		return next;
	}

	public void setNext(Admin next) {
		this.next = next;
	}
	
	
}
