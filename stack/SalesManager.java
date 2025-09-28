package stack;

public class SalesManager {
 
	int id;
	String name;
	double salary;
	SalesManager next;
	
	public SalesManager() {
		// TODO Auto-generated constructor stub
	}

	public SalesManager(int id, String name, double salary) {
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

	public SalesManager getNext() {
		return next;
	}

	public void setNext(SalesManager next) {
		this.next = next;
	}
	
	
	
	SalesManager top;
	
	public void push(SalesManager s)
	{
		s.next = top;
		top = s;
		
		System.out.println("Id :"+top.id);
		System.out.println("Name :"+top.name);
		System.out.println("Salary :"+top.salary);
		
		
	}
	
	public SalesManager pop()
	{
		if(top == null)
		{
			System.out.println("Stack is Empty");
			return null;
		}
		
		SalesManager temp = top;
		top = top.next;
		temp.next= null;
		System.out.println("Id :"+temp.id);
		System.out.println("Name :"+temp.name);
		System.out.println("Salary :"+temp.salary);
		
		System.out.println("Data Deleted");
		return temp;
	}
	
	public SalesManager peek()
	{
		if(top == null)
		{
			System.out.println("Stack is Empty");
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
			return ;
		}
		
		SalesManager temp = top;
		while(temp != null )
		{
			System.out.println("Id :"+temp.id);
			System.out.println("Name :"+temp.name);
			System.out.println("Salary :"+temp.salary);
			
			temp = temp.next;
			System.out.println();//next line used 
			
		}
	}
}
