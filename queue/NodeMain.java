package stack;

public class NodeMain {
   
	
	public static void main(String[] args) {
	
		Node n = new Node();
		
		Node n1 = new Node(12,"Radhe",30000);
		Node n2 = new Node(13,"Shyam",20000);
		Node n3 = new Node(10,"Kahna",10000);
		
	
			System.out.println("Push Operations Used");
			n.push(n1);
			n.push(n2);
			n.push(n3);
			System.out.println();//next line used
			
		System.out.println("Display Method Used");
		n.display();
		System.out.println();
		
		System.out.println("Pop Operations Used");
		n.pop();
		System.out.println();
		
		System.out.println("Display Operations Used");
		n.display();
		
		System.out.println("Peek Operations Used");
		n.peek();
			
	}
	
	

}
