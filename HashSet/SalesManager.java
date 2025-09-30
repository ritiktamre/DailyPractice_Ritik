package HashSet;

public class SalesManager {

	int id;
	String name;
	double salary;
	double incentive;
	int target;
	
	public SalesManager() {
		// TODO Auto-generated constructor stub
	}

	public SalesManager(int id, String name, double salary, double incentive, int target) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.incentive = incentive;
		this.target = target;
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

	public int getTarget() {
		return target;
	}

	public void setTarget(int target) {
		this.target = target;
	}

	@Override
	public String toString() {
		return "SalesManager [id=" + id + ", name=" + name + ", salary=" + salary + ", incentive=" + incentive
				+ ", target=" + target + "]";
	}
	
	
}
