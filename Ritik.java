package SingleLinkedList;

public class Ritik {

	int id;
	String name;
	double salary;
	Ritik next;
	
	public Ritik() {
		// TODO Auto-generated constructor stub
	}

	public Ritik(int id, String name, double salary) {
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

	public Ritik getNext() {
		return next;
	}

	public void setNext(Ritik next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "Ritik [id=" + id + ", name=" + name + ", salary=" + salary + ", next=" + next + "]";
	}
	
	
	
	
}
