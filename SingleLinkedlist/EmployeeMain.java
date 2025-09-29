package SingleLinkedlist;

public class EmployeeMain {

	Employee head;
	public static void main(String[] args) {
		
		Employee e1 = new Employee(12,"Radhe",30000);
		Employee e2 = new Employee(11,"Shyam",20000);
		Employee e3 = new Employee(10,"Kahna",25000);
		
		EmployeeMain emp = new EmployeeMain();
		emp.insert(e1);
		emp.insert(e2);
		emp.insert(e3);
		emp.display();
		
		System.out.println("Insert the Position in the Table ");
		Employee e4 = new Employee(13,"Mahamai",30000);
		emp.insertPos(e4, 2);
		emp.display();
		
		System.out.println("Delete the Data in the Table ");
		emp.delete("Kahna");
		emp.display();
		
		System.out.println("Search the Data in the Table");
		emp.search(10);
		System.out.println();
		emp.search(11);
		
		

	}
	
	public void insert(Employee e)
	{
		if(head == null)
		{
			head = e;
		}
		
		else
		{
		
		Employee current = head;
		while(current.next != null)
		{
			current = current.next;
		
		}
		
		current.next = e;
	}
		
	}
	
	public void insertPos(Employee e,int pos)
	{
		if(pos == 1)
		{
		    e.next = head;
		    head = e;
		}
		
		else {
			
			Employee current = head;
			int count = 1;
			while(current != null && count < pos - 1)
				
			{
				current = current.next;
				count++;
			}
			
			e.next = current.next;
			current.next = e;
			
		}
	}
	
	public void delete(String name)
	{
		if(head == null)
		{
			return;
		}
		
		if(head.name == name)
		{
			head = head.next;
		}
		
		else
		{
			Employee current = head ;
			while(current.next != null )
			{
				if(current.next.name == name)
				{
					current.next = current.next.next;
					return;
				}
				
				current = current.next  ;
			}
		}
	}
	
	public void search(int id)
	{
		Employee current = head ;
        boolean found = false;
		while(current != null)
		{
			
			if(current.id == id)
			{
				System.out.println("Employee Found");
				System.out.println("Id :"+current.id);
				System.out.println("Name :"+current.name);
				System.out.println("Salary :"+current.salary);
				System.out.println();
				found = true;
				break;
				
			}
			
			current = current.next;
		}
		
		if(!found)
		{
			System.out.println("Invalid Choice Data Does Not Access");
		}
	}
	
	
	public void display()
	{
		Employee current = head;
		while(current != null)
		{
			System.out.println("Id :"+current.id);
			System.out.println("Name :"+current.name);
			System.out.println("Salary :"+current.salary);
			System.out.println();
			
			current = current.next;
			
			
		}
		
	
	}

}
