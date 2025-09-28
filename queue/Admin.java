package queue;

public class Admin {
     
	int id ;
	String name;
	double salary;
	Admin next;
	
	public Admin() {
		// TODO Auto-generated constructor stub
	}

	public Admin(int id, String name, double salary) {
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

	public Admin getNext() {
		return next;
	}

	public void setNext(Admin next) {
		this.next = next;
	}
	
	Admin front,rear;
	
	public void enQueue(Admin a)
	{
		if(rear == null) {
			front = rear= a;
		
	}
		else
		{
			 rear .next = a;
			 rear = a;
		}
	  
		  System.out.println("Id :"+a.id);
		  System.out.println("Name :"+a.name);
		  System.out.println("Salary :"+a.salary);
		  System.out.println();
	  }
	  

public Admin deQueue()
{
   if(front == null)
   {
	   System.out.println("Queue is Empty");
	   return null;
   }
  
   Admin temp = front ;
   front = front.next;
   
   if(front == null)
   {
	   rear = null;
   }
     System.out.println("Id :"+temp.id);
	  System.out.println("Name :"+temp.name);
	  System.out.println("Salary :"+temp.salary);
      System.out.println();
 	 return temp;
 }

public void display()
{
	if(front == null)
	{
		System.out.println("Queue is Empty");
		return ;
	}
	
	Admin temp = front;
	
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