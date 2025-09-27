package Ritik30;

public class EmpMainDL {

	EmployeeDL head;
	public static void main(String[] args) {
	
		EmployeeDL e1 = new EmployeeDL(12,"Ritik",30000);
		EmployeeDL e2 = new EmployeeDL(10,"Aadarsh",20000);
		EmployeeDL e3 = new EmployeeDL(1,"Anmol",10000);
		
		EmpMainDL emp = new EmpMainDL();
		emp.insert(e1);
		emp.insert(e2);
       emp.insert(e3);
       emp.display();
		
		System.out.println("-- Insert at Position in the Table --");
		EmployeeDL e4 = new EmployeeDL(1, "shweta", 10000);
		emp.insertPos(e4, 1);
		emp.display();
		
		
		System.out.println("-- Search the Data in the table --");
		emp.search(1);

	}
	
	public void insert(EmployeeDL e)
	{
		if(head == null)
		{
			head = e;
		}
		else
		{
			EmployeeDL current = head;
			while(current.next!=null)
			{
				current = current.next;
			}
			
			current.next = e;
			e.prev = current;
		}
			
	}
	
	public void insertPos(EmployeeDL e, int pos) {
	    if (pos == 1) {
	       
	        e.next = head;
	        if (head != null) {
	            head.prev = e;
	        }
	        head = e;
	        return;
	    }

	  
	    EmployeeDL current = head;
	    int count = 1;
	    while (current != null && count < pos - 1) {
	        current = current.next;
	        count++;
	    }

	    if (current == null) {
	        System.out.println("Invalid Position: " + pos);
	        return;
	    }

	    
	    e.next = current.next;
	    if (current.next != null) {
	        current.next.prev = e;
	    }
	    current.next = e;
	    e.prev = current;
	}
	
	public void search(int id)
	{
		EmployeeDL current = head ;
		boolean found = true;
		while(current != null)
		{
			if(current.id ==id)
			{
				System.out.println("Employee Found");
				System.out.println("Id :"+current.id);
				System.out.println("Name :"+current.name);
				System.out.println("Salary :"+current.salary);
				
				
				found = true;
				break;
			}
			
			current = current.next;
			
		}
		if(!found)
		{
			System.out.println("Invalid Choice");
		}
		
	}
	
	public void display()
	{
		EmployeeDL current = head;
		while(current != null)
		{
			System.out.println("Id :"+current.id);
			System.out.println("Name :" +current.name);
			System.out.println("Salary :"+current.salary);
			
			System.out.println();//next line used
			
			current = current.next;
		}
	}

}
