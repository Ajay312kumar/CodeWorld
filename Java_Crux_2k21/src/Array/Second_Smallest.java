package Array;

public class Second_Smallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,3,4,8,2,9};
		
		int min1, min2;
		min1 = min2 = arr[0];
		
		for(int i = 1; i < arr.length; i++)
		{
			if(arr[i]  < min1)
			{
				min2=min1;
				min1=arr[i];
			}
			else if(arr[i] < min2)
			{
				
				min2 = arr[i];
			}
		}
		System.out.println(min2);
	}

}
