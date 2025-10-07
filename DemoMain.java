package SingleLinkedList;

public class DemoMain {

	Demo head;
	public static void main(String[] args) {
	
		Demo d1 = new Demo(11,"Radhe",30000);
		Demo d2 = new Demo(12,"Shyam",35000);
		Demo d3 = new Demo(13,"Kahna",25000);
		
		DemoMain dm = new DemoMain();
     
		System.out.println("Insert the Data in the table");
		dm.insert(d1);
		dm.insert(d2);
		dm.insert(d3);
		dm.display();
		
		System.out.println("Insert the Position in the Table");
		Demo d4 = new Demo(14,"Mahamai",40000);
		dm.insertPos(d4, 2);
		dm.display();
		
		System.out.println("Delete the Data in the table");
		dm.delete("Kahna");
		dm.display();
		
		System.out.println("Search the Data in the Table");
		dm.search("Mahamai");
		dm.search("Kahna");
	}
	
	public void insert(Demo d)
	{
		if(head == null)
		{
		   head = d;
		}
		
		else
		{
			Demo current = head;
			while(current.next != null)
			{
				current = current.next;
			}
			
			current.next = d;
		}
	}
	
	public void insertPos(Demo d,int pos)
	{
		if(pos == 1)
		{
		    d.next = head ;
		    head = d;
		}
		
		else
		{
			Demo current = head;
			int count = 1;
			while(current != null && count < pos - 1)
			{
				current = current.next;
				count ++;
			}
			
			d.next = current.next;
			current .next= d;
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
			Demo current = head;
			while(current != null)
			{
				if(current.next.name == name)
				{
					current.next = current.next.next;
					return;
				}
				current = current.next;
			}
		}
	}
	
	public void search(String name)
	{
		Demo current = head;
		boolean found = false;
		while(current.next != null)
		{
			if(current.name == name)
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
		
		if( ! found)
		{
			System.out.println("Invalid Choice Data does not insert");
		}
	}
	
	public void display()
	{
		Demo current = head;
		while( current != null)
		{
			System.out.println("Id :"+current.id);
			System.out.println("Name :"+current.name);
			System.out.println("Salary :"+current.salary);
			System.out.println();
			current = current.next;
		}
	}

}
