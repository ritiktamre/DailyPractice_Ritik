package BubbleSort;

public class India {

	public static void main(String[] args) {
		
		int arr[] = {12,3,2,1,34,5,67,54,68,90,8};
		
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j< arr.length-1-i;j++)
			{
				if(arr[j] > arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}

	}

}
