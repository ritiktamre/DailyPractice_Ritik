package Ritik30;

public class AdminMain {

	Admin head;
	
	public static void main(String[] args) {
	
		Admin a1 = new Admin(12,"Ritik",30000,3000);
		Admin a2 = new Admin(11,"Shweta",20000,2000);
		
		AdminMain adm = new AdminMain();
		System.out.println("-- Insert the Data in the table --");
		adm.insert(a1);
		adm.insert(a2);
		
		adm.Display();
		
		System.out.println("-- Insert the Data in the Table --");
		Admin a3 = new Admin(1,"Duggu",25000,2000);
		Admin a4 = new Admin(5,"Anmol",27000,2500);
		
		adm.insertPos(a3, 1);
		adm.insertPos(a4, 3);
		
		adm.Display();
		
		System.out.println("-- Delete the Data in the Table -- ");
		adm.delete("Shweta");
		adm.Display();
		
		System.out.println(" -- Search the Data in the Table --");
		adm.search(12);
		
	}
	
	public void insert(Admin a)
	{
		if(head == null)
		{
			head = a;
		}
		
		else
		{
			Admin current = head;
			while(current.next!=null)
			{
				current = current .next;
			}
			
			current.next = a;
		}
	}// Insert Method End
	
	public void insertPos(Admin a ,int pos)
	{
		if(pos == 1)
		{
			a.next = head;
			head = a;
		}
		
		else
		{
			Admin current = head;
			int count =1;
			while(current!=null && count < pos - 1)
			{
				current = current.next;
				count++;
			}
			
			a.next=current.next;
			current.next = a;
		}
	}
	
	public void delete(String name)
	{
		if(head == null)
		{
			return ;
		}
		
		if(head.name == name)
		{
			head=head.next; 
		}
		
		else
		{
			Admin current = head;
			while(current.next!=null)
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
		Admin current = head;
		boolean found = false;
		while(current !=null)
		{
			if(current.id==id)
			{
				System.out.println("Employee Found");
				System.out.println("Id :"+current.id);
				System.out.println("Name :"+current.name);
				System.out.println("Salary :"+current.salary);
				System.out.println("Allowance :"+current.allowance);
				
				found = true;
				break;
			}
			current = current.next;
		}	
			if(!found)
			{
				System.out.println("Data Does Not Exists ");
			}
			
		
		
	}
	
	
	public void Display()
	{
		Admin current = head;
		while(current!=null)
		{
			System.out.println("Id :"+current.id);
			System.out.println("Name :"+current.name);
			System.out.println("Salary :"+current.salary);
			System.out.println("Allowance :"+current.allowance);
			
			System.out.println();//next line used
			
			current = current .next;
		}
	}

}
