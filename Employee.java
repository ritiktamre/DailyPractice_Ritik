package Ritik30;

public class Employee {
   
	public int id;
	public String name;
	public double salary;
	public Employee next;
	
public Employee() {
	// TODO Auto-generated constructor stub
}

public Employee(int id, String name, double salary) {
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

public Employee getNext() {
	return next;
}

public void setNext(Employee next) {
	this.next = next;
}



}
