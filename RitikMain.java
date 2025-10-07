package SingleLinkedList;

public class RitikMain {

	Ritik head;
	public static void main(String[] args) {
		
		Ritik r1 = new Ritik(12,"Radhe",30000);
		Ritik r2 = new Ritik(13,"Shyam",25000);
		Ritik r3 = new Ritik(14,"Kahna",20000);
		
		RitikMain rm = new RitikMain();
		System.out.println("Insert the Data in the Table");
		rm.insert(r1);
		rm.insert(r2);
		rm.insert(r3);
		rm.display();
		
		System.out.println("Insert the Position in the Table");
		Ritik r4 = new Ritik(11,"Mahamai",40000);
		rm.insertPos(r4, 2);
		rm.display();
		
		System.out.println("Delete the Data in the Table");
		rm.delete("Kahna");
		rm.display();
		
		System.out.println("Search the data in the Table");
		rm.search(11);
		
		
		

	}
	
	public void insert(Ritik r)
	{
		if(head == null)
		{
			head = r;
		}
		
		else
		{
			Ritik current = head;
			while(current.next != null)
			{
				current = current.next;
			}
			current .next = r;
			
		}
	}
	
	public void insertPos(Ritik r , int pos)
	{
		if(pos == 1)
		{
			r.next = head ;
			head = r;
		}	
			else 
			{
				Ritik current = head;
				int count = 1;
				
				while(current != null && count < pos -1)
				{
					current = current.next;
					count ++;
				}
				
				r.next = current.next;
				current.next = r;
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
			Ritik current = head;
			while(current.next != null)
			{
				if(current.next.name ==name)
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
		Ritik current = head;
		boolean found = false;
		
		while(current.next != null)
		{
			if(current.next.id == id)
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
		
		if(! found)
		{
			System.out.println("Invalid Choice Data does not exists");
		}
		
	}
	
	public void display()
	{
		Ritik current = head;
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
