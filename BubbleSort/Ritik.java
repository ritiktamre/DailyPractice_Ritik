package BubbleSort;

public class Ritik {

	public static void main(String[] args) {
	
		int arr[] = {12,4,3,23,44,56,43,21,2,45,6};
		
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j+1] < arr[j])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		for(int i = 0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}

	}

}
