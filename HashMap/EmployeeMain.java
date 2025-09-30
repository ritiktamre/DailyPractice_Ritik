package HashMap;

import java.util.HashMap;

public class EmployeeMain {

	public static void main(String[] args) {
	
		Employee e1 = new Employee(1,"Radhe",30000);
		Employee e2 = new Employee(12,"Shyam",32000);
		Employee e3 = new Employee(16,"Kahna",25000);
		
	
		
     HashMap emp = new HashMap<MyKey,Employee>();
     emp.put(e1, 12);
     emp.put(e2,23);
     emp.put(e3, 12);
     
    System.out.println(emp);
          
		
	}

}
