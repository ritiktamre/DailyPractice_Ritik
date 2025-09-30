package HashSet;

import java.util.HashSet;

public class NodeMain {

	public static void main(String[] args) {
		
		HashSet<Node> nd = new HashSet<Node>();
		nd.add(new Node(1,"Radhe",30000));
		nd.add(new Node(2,"Shyam",25000));
		nd.add(new Node(5,"Kahna",20000));
		nd.add(new Node(8,"Mahamai",10000));
		nd.add(new Node(12,"Durgajii",35000));
		
		for(Node n : nd)
		{
			System.out.println(n);
		}

	}

}
