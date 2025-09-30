package Trees;

import java.util.Scanner;

public class RitikMain {

	Ritik root;
	
	public static Ritik createTree()
	{
		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();
		
		if(id == -1)
		{
			return null;
		}
		
		Ritik root = new Ritik( id);
		
		System.out.println("Enter the Left Child :"+id);
	    root.left = createTree();
	    
	    System.out.println("Enter the Right Child :"+id);
	    root.right = createTree();
	    
	    return root;
	}
	
	public static void inorder(Ritik root)
	{
		if(root == null)
		{
			return;
		}
		
		inorder(root.left);
		System.out.println(root.id);
		inorder(root.right);
	}
	
	
	public static void preorder(Ritik root)
	{
		if(root == null)
		{
			return;
		}
		
		System.out.println(root.id);
		preorder(root.left);
		preorder(root.right);
	}
	
	public static void postorder(Ritik root)
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
		Ritik root = createTree();
		
		System.out.println("InOrder Operations Used");
		inorder(root);
		
		System.out.println("PreOrder Operations Used");
		preorder(root);
		
		System.out.println("PostOrder Operations Used");
		postorder(root);

	}

}
