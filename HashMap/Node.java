package HashMap;

public class Node {
 
	   int id ;
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
		return "Node [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	   
	   
}//class Node ends here

class Hello {
	int hello;
	
	public Hello() {
		// TODO Auto-generated constructor stub
	}

	public int getHello() {
		return hello;
	}

	public void setHello(int hello) {
		this.hello = hello;
	}

	@Override
	public String toString() {
		return "Hello [hello=" + hello + "]";
	}
	
	
	
}

