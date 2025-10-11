package starPattern;

public class RectangleHallow {

	public static void main(String[] args) {
	
		int i = 6;
		int j = 5;
		
		for(i = 1;i<=6;i++)
		{
			for(j = 1;j<=5;j++)
			{
				if(i==1 || i==6 || j== 1|| j==5)
				{
					System.out.print(" * ");
				}
				
				else
				{
					System.out.print("   ");
				}
			}
			
			System.out.println();
	
		}
		
		

	}

}
