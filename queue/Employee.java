package queue;

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
	
	
	Employee front,rear;
	
	public void enQueue(Employee e)
	{
		if(rear == null)
		{
			front = rear = e;
		}
		else
		{
			rear.next = e;
			rear = e;
		}	
			System.out.println("Id :"+e.id);
			System.out.println("Name :"+e.name);
			System.out.println("Salary :"+e.salary);
			System.out.println();
		
	}
	
	
	public Employee deQueue()
	{
		if(front == null)
		{
			System.out.println("Queue is Empty");
			return null;
		}
		
		Employee temp = front ;
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
		
		Employee temp = front ;
		while(temp!=null)
		{
			System.out.println("Id :"+temp.id);
			System.out.println("Name :"+temp.name);
			System.out.println("Salary :"+temp.salary);
			System.out.println();
			temp = temp.next;
		}
	}
	
}
