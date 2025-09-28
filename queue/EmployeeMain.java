package queue;

public class EmployeeMain {

	public static void main(String[] args) {
	
		Employee emp = new Employee();
		
		Employee e1 = new Employee(12,"Radhe",30000);
		Employee e2 = new Employee(13,"Shyam",25000);
		Employee e3 = new Employee(14,"Kahna",20000);
		
		System.out.println("EnQueue Operations Used");
		emp.enQueue(e1);
		emp.enQueue(e2);
		emp.enQueue(e3);
		
		System.out.println("Display Operations Used");
		emp.display();
		
		
		System.out.println("DeQueue Operations Used");
		emp.deQueue();
		
		

	}

}
