package SingleLinkedList;

public class Demo {

	int id;
	String name;
	double salary;
	Demo next;
	
	public Demo() {
		// TODO Auto-generated constructor stub
	}

	public Demo(int id, String name, double salary) {
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

	public Demo getNext() {
		return next;
	}

	public void setNext(Demo next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "Demo [id=" + id + ", name=" + name + ", salary=" + salary + ", next=" + next + "]";
	}
	
	
	
	
}
