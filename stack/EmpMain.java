package stack;

public class EmpMain {

	public static void main(String[] args) {
	
		Employee emp = new Employee();
		
		Employee e1 = new Employee(1,"Radhe",30000);
		Employee e2 = new Employee(11,"Shyam",25000);
		Employee e3 = new Employee(101,"Kahna",20000);
		
		System.out.println("-- Push Operation used --");
		emp.push(e1);
		System.out.println();
		emp.push(e2);
		System.out.println();
		emp.push(e3);
		System.out.println();
		
	   System.out.println("-- Display operations used --");
	   emp.display();
	   System.out.println();//next line
		
		System.out.println("-- Pop Operations used --");
		emp.pop();
		System.out.println();//next line
		
		System.out.println("-- Display Operations --");
		emp.display();
		
		System.out.println();//next line
				
		System.out.println("-- Peek Operations used --");
		emp.peek();
		
		
		
		
	}

}
