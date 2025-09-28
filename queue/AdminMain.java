package queue;

public class AdminMain {

	public static void main(String[] args) {
	Admin adm = new Admin();
	
	Admin a1 = new Admin(12,"Radhe",20000);
	Admin a2 = new Admin(13,"Shyam",30000);
	Admin a3 = new Admin(14,"Kahna",23455);
			
	
	System.out.println(" EnQueue Operations used");
	adm.enQueue(a1);
	adm.enQueue(a2);
	adm.enQueue(a3);
	
	System.out.println(" Display Operations Used");
	adm.display();
	
	System.out.println("DeQueue Operations Used");
	adm.deQueue();
	
	System.out.println(" Display Operations used");
	adm.display();
	
	

	}

}
