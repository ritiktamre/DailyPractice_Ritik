package HashSet;

import java.util.HashSet;

public class EmployeeMain {

	public static void main(String[] args) {
	
		HashSet<Employee> emp = new HashSet<Employee>();
		emp.add(new Employee(12,"Radhe",30000));
		emp.add(new Employee(13,"Shyam",25000));
		emp.add(new Employee(14,"Kahna",20000));
		emp.add(new Employee(15,"MahaMai",10000));
		
		
		
		    
		    
		    for(Employee e : emp)
		{
			System.out.println(e);
		}

	}

}
