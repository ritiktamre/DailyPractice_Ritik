package SingleLinkedlist;

public class HRSLMain {

	HRSL head;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HRSL h1 = new HRSL(12,"Ritik",30000);
		HRSL h2 = new HRSL(11,"Rahul",20000);
		
		HRSLMain hr = new HRSLMain();
		hr.insert(h1);
		hr.insert(h2);
		hr.display();
		
		System.out.println("-- Insert Position in the table --");
		HRSL h3 = new HRSL(10,"Duggu",10000);
		hr.insertPos(h3, 1);
		hr.display();
		
		System.out.println("-- Delete the Data in the table --");
		hr.delete(10);
		hr.display();
		
		System.out.println("-- Search the Data in the Table --");
		hr.search(12);
	}
	
	public void insertPos(HRSL h,int pos)
	{
		if(pos == 1)
		{
			h.next = head;
			head = h;
			return;
		}
		
		else
		{
			HRSL current = head;
			int count = 1;
			while(current!=null && count < pos -1) 
			{
				current = current.next;
				count++;
			}
			
			 h.next =	current.next ;
			current.next = h;
			
		}
	}
	
	public void search(int id)
	{
		HRSL current = head;
		boolean found = false;
		
		while(current!=null)
		{
			if(current.id ==id )
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
			System.out.println("Invalid Choice");
		}
	}
	
	public void delete(int id)
	{
		if(head==null)
		{
			return;
		}
		if(head.id ==id )
		{
			head = head.next;
		}
		
		HRSL current = head;
		while(current.next!=null)
		{
			if(current.next.id == id)
			{
				current.next = current.next.next;
				return;
			}
			
			current = current.next;
		}
	}
	
	public void insert(HRSL h)
	{
		if(head == null)
		{
			head = h;
			return;
		}
		
		HRSL current = head;
		while(current.next!=null)
		{
			current = current.next;
		}
		
		current.next = h;
	}
	
	public void display()
	{
		HRSL current = head;
		while(current!=null)
		{
			System.out.println("ID :"+current.id);
			System.out.println("Name :"+current.name);
			System.out.println("Salary :"+current.salary);
			
			System.out.println();//next line used
			
			current= current.next;
		}
	}

}
