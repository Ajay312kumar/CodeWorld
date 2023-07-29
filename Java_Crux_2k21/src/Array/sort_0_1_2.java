package Array;

public class sort_0_1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,1,0,2,1,0,2};
		int[] ans=sort(arr);
        display(ans);
	}
	
	public static int[] sort(int[] arr)
	{
		int low=0;
		int high=arr.length-1;
		int mid=0;
		
		while(mid <= high)
		{
			if(arr[mid] == 0)
			{
				swap(arr, low, mid );
				low++;
				mid++;
			}
			else if(arr[mid]==1)
			{
				mid++;
			}
			else
			{
				swap(arr, mid, high);
				high--;
			}
		}
		return arr;
	}
	
	
	public static void swap(int[] arr, int i, int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
 
	public static void display(int[] arr)
	{
		for(int i=0; i < arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
	
	
	
	
	

}
