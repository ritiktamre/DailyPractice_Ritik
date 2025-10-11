package starPattern;

public class Que7 {

	public static void main(String[] args) {
	
		int n =6;
		
		for(int i = 1;i<=n;i++)
		{
			for(int j =1;j<=n+1-i;j++)
			{
				System.out.print(" " +j);
			}
			
			System.out.println("");
		}
	}

}
