package dsa;

public class EmpMainSL {

	EmployeeSL head;
	public static void main(String[] args) {
	
//        EmployeeSL emp = new EmployeeSL();
        EmployeeSL e1 = new EmployeeSL(1,"Radhe",30000);
        EmployeeSL e2 = new EmployeeSL(11,"MahaMai",40000);
        EmployeeSL e3 = new EmployeeSL(32,"Kahna",35000);
        EmployeeSL e4 = new EmployeeSL(14,"Shyam",25000);
        
        
        EmpMainSL em = new EmpMainSL();
        em.insert(e1);
        em.insert(e2);
        em.insert(e3);
        em.insert(e4);
        
        em.display();
        
        System.out.println("-- Insert the Data in the Table --");
        EmployeeSL e5 = new EmployeeSL(2,"Durga jii",45000);
        em.insertPos(e5,2);
        System.out.println("SucessFull Data Insert ");
        em.display();
     
        
        System.out.println("Delete the Data in the Table -- ");
        em.delete("Radhe");
        System.out.println("SuccessFull Deleated");
        em.display();
        
        System.out.println("-- Search the Data in the Table --");
        em.search(11);
        
	}
	
	public void insert(EmployeeSL e)
	{
		if(head == null)
		{
			head = e;
		}
		
		else
		{
			EmployeeSL current = head;
			while(current.next != null)
			{
				current = current.next;
			}
			
			current.next = e;
		}
	}
	
	public void insertPos(EmployeeSL e,int pos)
	{
		if(pos == 1)
		{
			e.next = head ;
			head = e;
			return;
		}
		
		else {
			EmployeeSL current = head;
			int count = 1;
			while(current!=null  && count < pos - 1)
			{
				current = current.next;
				count++;
			}
			
			e.next = current.next;
			current.next = e;
			return ;
			
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
			EmployeeSL current = head;
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
		EmployeeSL current = head;
	     boolean found = false;
	     
	     while(current!= null)
	     {
	    	 if(current.id == id)
	    	 {
	    		 System.out.println("Employee Found ");
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
	    	 System.out.println("Invalid data ");
	     }
	}
	
	public void display()
	{
		
		EmployeeSL current = head;
		while(current!=null)
		
		{
			
			System.out.println("Id :"+current.id);
			System.out.println("Name :"+current.name);
			System.out.println("Salary :"+current.salary);
			
			System.out.println();//next line used
			
			current = current.next;
		}
	}

}
