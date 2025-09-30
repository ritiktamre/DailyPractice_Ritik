package Trees;

import java.util.Scanner;

public class DemoMain {

	Demo root;
		
		public static Demo createTree()
		{
			Scanner sc = new Scanner(System.in);
			int id = sc.nextInt();
			
			
			if(id == -1)
			{
				return null;
			}
			Demo root = new Demo(id);
			
			System.out.println("Enter the Left Child :"+id);
			  root.left = createTree();
			  
			  System.out.println("Enter the Right Child :"+id);
			  root.right = createTree();
			  
			  return root;
		

	}
		
		public static void inorder(Demo root)
		{
			if(root == null)
			{
				return;
			}
			
			inorder(root.left);
			System.out.println(root.id);
			inorder(root.right);
				
		}
		
		public static void preorder(Demo root)
		{
			if(root == null)
			{
				return;
			}
			
			System.out.println(root.id);
			preorder(root.left);
			preorder(root.right);
		}
		
		public static void postorder(Demo root)
		{
			
			if(root == null)
			{
				return;
			}
			
			postorder(root.left);
			postorder(root.right);
			System.out.println(root.id);
		}
		
		public static void main(String[] args)
		{
			Scanner sc = new Scanner(System.in);
			Demo root = createTree();
			
			System.out.println("--- Inorder operations ---");
			inorder(root);
			
			System.out.println("--- PreOrder operations ---");
			preorder(root);
			
			System.out.println("--- postorder operations ---");
			postorder(root);
		}

}
