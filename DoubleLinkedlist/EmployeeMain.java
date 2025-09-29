package DoubleLinkedlist;

public class EmployeeMain {

	Employee head;
	public static void main(String[] args) {
		
		Employee e1 = new Employee(12,"Radhe",30000);
		Employee e2 = new Employee(1,"Shyam",20000);
		Employee e3 = new Employee(11,"Kahna",23000);
		Employee e4 = new Employee(18,"Mahamai",35000);
		
		EmployeeMain emp = new EmployeeMain();
		emp.insert(e1);
		emp.insert(e2);
		emp.insert(e3);
		emp.insert(e4);
		emp.display();
		
		System.out.println("Insert data in the Position ");
		Employee e5 = new  Employee(15,"Durgajii",40000);
		emp.insertPos(e5, 3);
		emp.display();
		
		System.out.println("Search the Data in the Table ");
		emp.search(15);
		
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
			e.prev = current;
		}
	}
	
	public void insertPos(Employee e,int pos)
	{
		if(pos == 1)
		{
			return;	
		}
		
		else
		{
			Employee current = head;
			int count = 1;
			while(current != null && count < pos - 1)
			{
				current = current.next;
				count++;
			}
			
			if(current == null)
			{
				return;
			}
			
			e.next = current.next;
			
			if(current.next != null)
			{
				current.next = e;
				e.prev = current;
			}
		}
		
		
	}
	
	public void search(int id)
	{
		Employee current = head;
		boolean found = false;
		
		while(current != null)
		{
			if( current.id == id)
			{
				System.out.println("Employee found");
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
		Employee current = head ;
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
