package HashMap;

public class HR {
 
	int id;
	String name;
	double salary;
	
	public HR() {
		// TODO Auto-generated constructor stub
	}

	public HR(int id, String name, double salary) {
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

	@Override
	public String toString() {
		return "HR [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
}

class Ritik {
	
	int a;
	
	public Ritik() {
		// TODO Auto-generated constructor stub
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public Ritik(int a) {
		super();
		this.a = a;
	}

	@Override
	public String toString() {
		return "Ritik [a=" + a + "]";
	}
	
	
}
