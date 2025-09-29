package DoubleLinkedlist;

public class SalesManagerDL {

	
	SalesManagerDL prev;
	int id;
	String name;
	double salary;
	double incentive;
	SalesManagerDL next;
	
//	public SalesManagerDL(int i, String string, int j, int k) {
//		// TODO Auto-generated constructor stub
//	}

	public SalesManagerDL( int id, String name, double salary,double incentive) {
	
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.incentive = incentive;
	}

//	public SalesManagerDL(int i, String string, int j, int k) {
//		// TODO Auto-generated constructor stub
//	}
//
//	public SalesManagerDL(int i, String string, int j, int k) {
//		// TODO Auto-generated constructor stub
//	}

	public SalesManagerDL getPrev() {
		return prev;
	}

	public void setPrev(SalesManagerDL prev) {
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

	public double getIncentive() {
		return incentive;
	}

	public void setIncentive(double incentive) {
		this.incentive = incentive;
	}

	public SalesManagerDL getNext() {
		return next;
	}

	public void setNext(SalesManagerDL next) {
		this.next = next;
	}
}
