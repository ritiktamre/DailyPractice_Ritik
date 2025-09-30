package HashMap;

public class SalesManager {
  
	int id;
	String name;
	double salary;
	double incentive;
	
	public SalesManager() {
		// TODO Auto-generated constructor stub
	}

	public SalesManager(int id, String name, double salary, double incentive) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.incentive = incentive;
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

	@Override
	public String toString() {
		return "SalesManager [id=" + id + ", name=" + name + ", salary=" + salary + ", incentive=" + incentive + "]";
	}
	
	
}

class Key {
	
	int key;
	
	public Key() {
		// TODO Auto-generated constructor stub
	}

	public Key(int key) {
		super();
		this.key = key;
	}

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	@Override
	public String toString() {
		return "Key [key=" + key + "]";
	}
	
	
}
