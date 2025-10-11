package starPattern;

public class Que6 {

	public static void main(String[] args) {
	
		int n = 6;
	   int number = 1;
		
		for(int i=1;i<=6;i++)
		{
			for(int j=1;j<=i;j++)
			{
			  System.out.print(" "+number);
			  number++;
			}
			
			System.out.println();
		}

	}

}
