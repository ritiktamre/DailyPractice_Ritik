package stack;

public class Employee {

	int id;
	String name;
	double salary;
	Employee next;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, double salary) {
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

	public Employee getNext() {
		return next;
	}

	public void setNext(Employee next) {
		this.next = next;
	}
	
	
	Employee top;
	
	public void push(Employee e)
	{
		e.next = top;
		top = e;
		
		System.out.println("Id :"+e.id);
		System.out.println("Name :"+e.name);
		System.out.println("Salary :"+e.salary);
		
		
	}
	
	public Employee pop()
	{
		if(top == null)
		{
			System.out.println("Stack is Empty");
			return null; 
		}
		
		Employee temp = top;
		top = top.next;
		temp.next = null;
		
		System.out.println("Id :"+temp.id);
		System.out.println("Name :"+temp.name);
		System.out.println("Salary :"+temp.salary);
		System.out.println("Data Deleated");
		return temp;
		
	}
	
	public Employee peek()
	{
		if(top == null)
		{
			return null;
		}
		
		System.out.println("Id :"+top.id);
		System.out.println("Name :"+top.name);
		System.out.println("Salary :"+top.salary);
		
		return top;
		
	}
	
	public void display()
	{
		if(top == null)
		{
			System.out.println("Stack is Empty");
		}
		
		Employee temp = top;
		
		while(temp != null ) {
		System.out.println("Id :"+temp.id);
		System.out.println("Name :"+temp.name);
		System.out.println("Salary :"+temp.salary);
		
		
		temp = temp.next;
		System.out.println();
	  }
	}
	
}
