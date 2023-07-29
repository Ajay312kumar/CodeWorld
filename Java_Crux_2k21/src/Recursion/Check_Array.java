package Recursion;

public class Check_Array {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4};
	 
		int n = arr.length;
	     
		if(check(arr, n) != 0)
		{
			System.out.println("sorted");
		}
		else
		{
			System.out.println("Not sorted");
		}
	     
	     
	     
	}

	public static int check(int[] arr, int n)
	{
		
	   if(n == 1 || n == 0)
	   {
		  return 1;
	   }
	   
	   if(arr[n-1] < arr[n-2])
	   {
		return 0;  
	   }
	   
	   return check(arr, n-1);
	   
	   
	}
}
