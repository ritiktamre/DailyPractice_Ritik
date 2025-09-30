package Trees;

import java.util.Scanner;

public class NodeMain {

	Node root;
	
	public static Node createTree()
	{
		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();
		
		if(id == -1)
		{
			return null;
		}
		
		Node root = new Node(id);
		
		System.out.println("Enter the Left Child :"+id);
		root.left = createTree();
		
		System.out.println("Enter the Right Child :"+id);
		root.right = createTree();
		
		return root;
	}//////class CreateTree ends here
	
	public static void inorder(Node root)
	{
		if(root == null)
		{
			return;
		}
		
		inorder(root.left);
		System.out.println(root.id);
		inorder(root.right);
	}
	
	public static void preorder(Node root)
	{
		if(root == null)
		{
			return;
		}
		
		System.out.println(root.id);
		preorder(root.left);
		preorder(root.right);
	}
	
	public static void postorder(Node root)
	{
		if(root == null)
		{
			return;
		}
		
		postorder(root.left);
		postorder(root.right);
		System.out.println(root.id);
	}
	
	public static void main(String[] args) {
		
	
		Scanner sc = new Scanner(System.in);
		
		Node root = createTree();
		
		System.out.println("-- InOrder Opeartions --");
		inorder(root);
		
		System.out.println("--- PreOrder Operations ---");
		preorder(root);
		
		System.out.println("--- PostOrder Operations ---");
		postorder(root);
	}
	
	
}
