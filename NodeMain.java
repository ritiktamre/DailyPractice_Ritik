package SingleLinkedList;

public class NodeMain {

	Node head;
	public static void main(String[] args) {
		
		Node n1 = new Node(12,"Ritik",30000);
		Node n2 = new Node(13,"Shweta",35000);
		Node n3 = new Node(14,"Aadarsh",25000);
		
		NodeMain nm = new NodeMain();
		System.out.println("Insert the Data in the Table");
		nm.insert(n1);
		nm.insert(n2);
		nm.insert(n3);
		nm.display();
		
		System.out.println("Insert the Position in the Table");
		Node n4 = new Node(11,"Anmol",20000);
		nm.insertPos(n4, 2);
		nm.display();
		
		System.out.println("Delete the Data in the Table");
		nm.delete("Shweta");
		nm.display();

		System.out.println("Search the Data in the Table");
		nm.search(15);
	
	}
	
	public void insert(Node n)
	{
		if(head == null)
		{
			head = n;
		}
		
		else
		{
			Node current = head;
			while(current.next != null)
			{
				current = current.next;
			}
			
			current.next = n;
		}
	}
	
	public void insertPos(Node n ,int pos)
	{
		if(pos == 1)
		{
			n.next = head;
			head = n;
		}
		
		else 
		{
			Node current = head;
			int count = 1;
			while( current != null && count > pos -1)
			{
				current = current.next;
				count ++;
			}
			
			n.next = current.next; 
			current.next = n;
			
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
			Node current = head;
			while(current.next != null)
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
	
	public void search(int id)
	{
		Node current = head;
		boolean found = false;
		
		while(current != null)
		{
			if(current.id == id)
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
		
		if(! found)
		{
			System.out.println("Invalid choice Data does not Exists");
		}
	}
	
	public void display()
	{
		Node current = head;
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
