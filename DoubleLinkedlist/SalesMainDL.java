package DoubleLinkedlist;

public class SalesMainDL {

	SalesManagerDL head;
	public static void main(String[] args) {
	
		SalesManagerDL s1 = new SalesManagerDL(12,"Ritik",30000,3000);
		SalesManagerDL s2 = new SalesManagerDL(11,"Rahul",20000,2000);

		SalesMainDL sal = new SalesMainDL();
		sal.insert(s1);
		sal.insert(s2);
		sal.display();
		
		System.out.println("-- InsertPos Data in the Table --");
		SalesManagerDL s3 = new SalesManagerDL(1,"UV",5000,500);
		sal.insertPos(s3, 3);
		sal.display();
		
		System.out.println("-- Search the Data in the Table --");
		sal.search(14);
		System.out.println();
		sal.search(11);
	}
	
	public void insert(SalesManagerDL s)
	{
		if(head == null)
		{
			head = s;
		}
		
		else
		{
			SalesManagerDL current = head;
			while(current.next!=null)
			{
				current = current.next;
			}
			
			current.next=s;
			s.prev = current;
		}
	}
	
	public void insertPos(SalesManagerDL s,int pos)
	{
		if(pos == 1)
		{
		    return;
		}
		
		SalesManagerDL current = head;
		int count=1;
		while(current!=null && count < pos -1 )
		{
			current = current.next;
			count ++;
		}
		
		if(current == null)
		{
			return;
		}
		
		s.next = current .next;
		if(current.next!=null)
		{
			current.next.prev = s;
		}
		
		current.next = s;
		s.prev = current;
	}
	
	public void search(int id)
	{
		SalesManagerDL current = head;
		boolean found = false;
		
		while(current!=null)
		{
			if(current.id == id)
			{
				System.out.println("Employee Found ");
				System.out.println("Id :"+current.id);
				System.out.println("Name :"+current.name);
				System.out.println("Salary :"+current.salary);
				System.out.println("Incentive :"+current.incentive);
				found = true;
				break;
			}
			
			current = current.next;
		}
		
		if(!found)
		{
			System.out.println("Data does Not Exists");
		}
		
		
	}
	
	public void display()
	{
		SalesManagerDL current = head;
		while(current!=null)
		{
			System.out.println("Id :"+current.id);
			System.out.println("Name :"+current.name);
			System.out.println("Salary :"+current.salary);
			System.out.println("Incentive :"+current.incentive);
			
			System.out.println();//next line used
			
			current = current.next;
		}
	}

}
