package dsa;

public class EmpMainDL {

	EmployeeDL head;
	public static void main(String[] args) {
	
		EmployeeDL e1 = new EmployeeDL(1,"Radhe",30000);
        EmployeeDL e2 = new EmployeeDL(11,"MahaMai",40000);
        EmployeeDL e3 = new EmployeeDL(32,"Kahna",35000);
        
        
        EmpMainDL emp = new EmpMainDL();
        emp.insert(e1);
        emp.insert(e2);
        emp.insert(e3);
        emp.display();
     
        
        
        System.out.println("-- Insert the Data in the Table --");
        EmployeeDL e4 = new EmployeeDL(14,"Shyam",25000); 
           emp.insert(e4);
           emp.display();
           
           System.out.println("-- Insert the Data in the Position --");
           EmployeeDL e5 = new EmployeeDL(18,"Durga",45000);
           emp.insertPos(e5, 3);
           System.out.println("SuccessFull Insert");
           emp.display();
           
           
           System.out.println("-- Search the Data in the Table --");
           emp.search(45000);
	}
	

	
	public void insert(EmployeeDL e)
	{
		if(head == null)
		{
			head = e;
		}
		
		else
		{
		    EmployeeDL current = head ;
		    while(current.next!=null)
		    {
		    	current = current.next;
		    }
		    
		    current.next = e;
		    e.prev = current;
		}
	}
	
	public void insertPos(EmployeeDL e,int pos)
	{
		if(pos == 1)
		{
			return;
		}
		
		EmployeeDL current = head;
		int count = 1;
		while(current!= null && count < pos - 1)
		{
			current = current.next;
			count ++;
		}
		
		if(current == null)
		{
			return;
		}
		
		e.next = current.next;
		if(current.next != null)
		{
			current.next.prev = e;
		}
		
		current.next = e;
		e.prev = current;
	}
	
	public void search(double salary)
	{
		EmployeeDL current = head;
		boolean found = true;
		
		while(current != null)
		{
			if(current.salary == salary)
			{
				System.out.println("Employee Found");
				System.out.println("Id :"+current.id);
				System.out.println("Name :"+current.name);
				System.out.println("Salary :"+current.salary);
				
				found = true;
				break;
			}
			
			current  = current.next;
		}
		
		if(!found)
		{
			System.out.println("Data inValid");
		}
	}
	
	public void display()
	{
		EmployeeDL current = head;
		while(current!=null)
		{
			System.out.println("Id :"+current.id);
			System.out.println("Name :"+current.name);
			System.out.println("Salary :"+current.salary);
			
			System.out.println();
			current = current.next;
		}
	}

}
