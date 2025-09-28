package stack;

public class SalesManagerMain {

	public static void main(String[] args) {

		SalesManager sal = new SalesManager();
		
		SalesManager s1 = new SalesManager(11,"Radhe",30000);
		SalesManager s2 = new SalesManager(12,"Shyam",42000);
		SalesManager s3 = new SalesManager(13,"Kahna",35000);
		SalesManager s4 = new SalesManager(14,"MeriMai",50000);
		
		System.out.println("-- Push Operation Used --");
		sal.push(s1);
		System.out.println();//next line used
		
		sal.push(s2);
		System.out.println();//next line used
		
		sal.push(s3);
		System.out.println();//next line used
		
		sal.push(s4);
		System.out.println();//next line used
		
		System.out.println("-- Display Operation Used --");
		sal.display();
		System.out.println();//next line used
		
		System.out.println("-- Pop Operations Used --");
		sal.pop();
	  System.out.println();//next line used);
	  
	  System.out.println("-- Display Operations Used --");
	  sal.display();
	  System.out.println();//next line used
	  
	  System.out.println("-- Peek Operations Used --");
	  sal.peek();
     System.out.println();//next line used
     
     System.out.println("-- Display Operations Used --");
     sal.display();
	}

}
