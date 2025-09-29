package queue;

public class NodeMain {

	public static void main(String[] args) {
	
		Node nd = new Node();
		Node n1 = new Node(12,"Radhe",30000);
		Node n2 = new Node(13,"Shyam",40000);
		Node n3 = new Node(11,"Kahna",35000);
		Node n4 = new Node(10,"Mahamai",25000);
		
		System.out.println("EnQueue Operations Used");
		nd.enQueue(n1);
		nd.enQueue(n2);
		nd.enQueue(n3);
		nd.enQueue(n4);
		System.out.println();//next line used
		
		
		System.out.println("DeQueue Operations Used");
		nd.deQueue();
		System.out.println();
		
		System.out.println("Display Operations Used");
		nd.display();

	}

}
