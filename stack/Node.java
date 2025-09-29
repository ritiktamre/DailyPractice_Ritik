package queue;

public class Node {
 
	int id;
	String name;
	double salary;
	Node next;
	
	public Node() {
		// TODO Auto-generated constructor stub
	}

	public Node(int id, String name, double salary) {
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

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "Node [id=" + id + ", name=" + name + ", salary=" + salary + ", next=" + next + "]";
	}
	
	Node front,rear;
	
	public void enQueue(Node n)
	{
		if(rear == null)
		{
			rear = front = n;
			
		}
		else
		{
		    rear.next = n;
		    rear = n;
		}
		
		System.out.println("Id :"+n.id);
		System.out.println("Name :"+n.name);
		System.out.println("Salary :"+n.salary);
		System.out.println();
	}
	
	public Node deQueue()
	{
		if(front == null)
		{
		System.out.println("Queue is empty");
		   return null;
		}
		
		Node temp = front;
		front = front.next;
		
		if(front == null)
		{
			rear = null;
		}
		
		System.out.println("Id :"+temp.id);
		System.out.println("Name :"+temp.name);
		System.out.println("Salary :"+temp.salary);
		System.out.println("Data Deleated");
		System.out.println();
		return temp;
		
		
	}
	
	public void display()
	{
		if(front == null)
		{
			System.out.println("Queue is Empty");
			return;
		}
		Node temp = front ;
		while(temp != null)
		{
		System.out.println("Id :"+temp.id);
		System.out.println("Name :"+temp.name);
		System.out.println("Salary :"+temp.salary);
		System.out.println();
		 temp = temp.next;
		}
	}
	
	
}
