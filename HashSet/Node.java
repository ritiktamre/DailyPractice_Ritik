package HashSet;

public class Node {

	int id;
	String name;
	double salary;
	
	public Node() {
		// TODO Auto-generated constructor stub
	}

	public Node(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Node [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
}
