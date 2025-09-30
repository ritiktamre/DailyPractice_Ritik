package HashMap;

public class RK {

	int id;
	String name;
	double salary;
	
	public RK() {
		// TODO Auto-generated constructor stub
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

	public RK(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "RK [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
}

class RK1 {
	int a;
	
	public RK1() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "RK1 [a=" + a + "]";
	}

	public RK1(int a) {
		super();
		this.a = a;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
	
	
}
