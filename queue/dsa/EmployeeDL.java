package dsa;

public class EmployeeDL {
   
	EmployeeDL prev;
	int id;
	String name;
	double salary;
	EmployeeDL next;
	
	public EmployeeDL() {
		// TODO Auto-generated constructor stub
	}

	public EmployeeDL(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.next = null;
		this.prev = null;
	}

	public EmployeeDL getPrev() {
		return prev;
	}

	public void setPrev(EmployeeDL prev) {
		this.prev = prev;
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

	public EmployeeDL getNext() {
		return next;
	}

	public void setNext(EmployeeDL next) {
		this.next = next;
	}
	
	
	
	
}
