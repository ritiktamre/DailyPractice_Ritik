package BubbleSort;

public class Tamre {

	public static void main(String[] args) {
	
		int arr[] = {12,3,45,6,78,6,5,43,2,4,7};
		
		for(int i =0;i<arr.length-1;i++)
		{
			for(int j =0;j<arr.length-1-i;j++)
			{
				if(arr[j] > arr[j+1])
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
