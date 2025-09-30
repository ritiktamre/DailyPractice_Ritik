package HashMap;

public class Admin {

	int id;
	String name;
	double salary;
	double allowance;
	
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

	@Override
	public String toString() {
		return "Admin [id=" + id + ", name=" + name + ", salary=" + salary + ", allowance=" + allowance + "]";
	}
	
	
}


class MKey {
	
	int key;
	
	public MKey() {
		// TODO Auto-generated constructor stub
	}

	public MKey(int key) {
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
		return "MKey [key=" + key + "]";
	}
	
	
}
