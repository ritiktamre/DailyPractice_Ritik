package stack;

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
	
	
	Node top;
	
	public void push(Node n)
	{
		n.next = top;
		top = n;
		
		System.out.println("Id :"+n.id);
		System.out.println("Name :"+n.name);
		System.out.println("Salary :"+ n.salary);
		System.out.println();
		
	
	}
	
	public void display()
	{
		if(top == null)
		{
			System.out.println("Stack is Empty");
			return;
		}
		
		Node temp = top;
		while(temp != null )
		{
			System.out.println("Id :"+temp.id);
			System.out.println("Name :"+temp.name);
			System.out.println("Salary :"+ temp.salary);
			System.out.println();
			
			temp = temp.next;
			
		}
		
	}
	
	public Node pop()
	{
		if(top == null)
		{
			System.out.println("Stack is empty");
			return null;
		}
		
		Node temp = top;
		top = top.next;
		temp.next = null;
		{
		System.out.println("ID :"+temp.id);
		System.out.println("Name :"+temp.name);
		System.out.println("Salary :"+temp.salary);
		System.out.println("Data Deleated");
		
		return temp;
	}
	}
	
	public Node peek()
	{
		if(top == null)
		{
			System.out.println("Stack is empty");
			return null ;
		}
		
		System.out.println("Id :"+top.id);
		System.out.println("Name :"+top.name);
		System.out.println("Salary :"+top.salary);
		return top;
		
	}
}
