package dsa;

//Single Linked List Method

public class EmployeeSL {

	int id;
	String name;
	double salary;
	EmployeeSL next;
	
	public EmployeeSL() {
		// TODO Auto-generated constructor stub
	}

	public EmployeeSL(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.next = null;
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

	public EmployeeSL getNext() {
		return next;
	}

	public void setNext(EmployeeSL next) {
		this.next = next;
	}
	
	
	
	
	
}
