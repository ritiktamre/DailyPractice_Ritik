package Trees;

import java.util.Scanner;

public class RKMain {

	RK root;
	
	public static  RK createTree()
	{
		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();
		
		if(id == -1)
		{
			return null;
		}
		
		RK root = new RK(id);
		
		System.out.println("Enter the Left Child :"+id);
		root.left = createTree();
		
		System.out.println("Enter the Right Child :"+id);
		root.right = createTree();
		
		return root;
	}
	
	public static void inorder(RK root)
	{
		if( root == null)
		{
			return;
		}
		
		inorder(root.left);
		System.out.println(root.id);
		inorder(root.right);
	}
	
	public static void preorder(RK root)
	{
		if(root == null)
		{
			return;
		}
		
		System.out.println(root.id);
		preorder(root.left);
		preorder(root.right);
	}
	
	public static void postorder(RK root)
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
		RK root = createTree();
		
		System.out.println("InOrder Operations ");
		inorder(root);
		
		System.out.println("PreOrder Operations");
		preorder(root);
		
		System.out.println("PostOrder Operations");
		postorder(root);

	}

}
