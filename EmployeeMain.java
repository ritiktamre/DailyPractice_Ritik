package Ritik30;

import DataStructure.Employee;

public class EmployeeMain {

	           Employee head;
	public static void main(String[] args) {
	
		Employee e1 = new Employee(12,"Ritik",30000);
		Employee e2 = new Employee(13,"Rahul",40000);
		
		EmployeeMain emp = new  EmployeeMain();
		emp.insert(e1);
		emp.insert(e2);
		emp.display();
		

		
		System.out.println("-- Insert Position --");
	       Employee e4 = new Employee(5,"Halke",60000);
	       emp.insertpos(e4, 2);
	       
	       Employee e3 = new Employee(3,"Keshav",70000);
	       emp.insertpos(e3, 1);
	       emp.display();
	       
	       System.out.println("-- Deleate Data --");
	       emp.delete(12);
	       emp.display();
	       

	       System.out.println("-- Search Data --");
	       emp.search(13);
	       System.out.println();
	       emp.search(12);
	       System.out.println();
	       emp.search(5);
	    
	}
	
	public void insert(Employee e)
	{
		if(head==null)
		{
			head=e;
		}
		
		else
		{
			Employee current = head;
			while(current.next!=null)
			{
				current = current.next;
			}
			
			current.next=e;
		}
	}
	
	public void insertpos(Employee e,int pos)
	{
		if(pos == 1)
		{
			e.next = head;
			head = e;
			return;
		}
		
		else
		{
			Employee current = head;
			int count =1;
			while(current!=null && count > pos-1)
			{
				current = current.next;
				count++;
			}
			
			e.next=current.next;
			current.next=e;
		}
	}
	
	public void delete(int id )
	{
		if(head ==null)
		{
			return ;
		}
		
		if(head.id == id)
		{
			head = head.next;
		}
		
		else
		{
			Employee current = head;
			while(current.next!=null)
			{
				if(current.next.id==id)
				{
					current.next = current.next.next;
					return;
				}
				
				current = current.next;
			}
		}
	}
	
	public void search(int id)
	{
		Employee current = head;
		boolean found = false;
		
		while(current!=null)
		{
			if(current.id==id)
		{
			System.out.println("Employee Found");
			System.out.println("ID :"+current.id);
			System.out.println("Name :"+current.name);
			System.out.println("Salary :"+current.salary);
			 found = true;
	            break; 
		}
		   current = current.next;
		}	
		
		if(!found)
		{
			System.out.println("Employee Not Found");
		}
	}
	
	public void display()
	{
		Employee current = head;
		while(current!=null)
		{
			System.out.println("ID :"+current.id);
			System.out.println("Name :"+current.name);
			System.out.println("Salary :"+current.salary);
			System.out.println();
			current = current.next;
		}
	}

}
