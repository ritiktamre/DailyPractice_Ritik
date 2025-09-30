package HashMap;

import java.util.HashMap;

public class NodeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		Node n1 = new Node(12,"Radhe",30000);
		Node n2 = new Node(10,"Shyam",20000);
		Node n3 = new Node(15,"Kahna",10000);
		
		HashMap<Node,Integer> n = new HashMap<Node, Integer>();
		 n.put(n1, 12);
		 n.put(n2, 34);
		 n.put(n3, 1);
		 
		 System.out.println(n);
	}

}
