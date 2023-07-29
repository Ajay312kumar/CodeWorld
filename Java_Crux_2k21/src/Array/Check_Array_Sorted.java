package Array;

public class Check_Array_Sorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,2,1,4,5};
		
		System.out.println(check(arr));
		
	}
	
	public static boolean check(int[] arr)
	{
		for(int i =1; i < arr.length-1; i++)		
		{
			if(arr[i] < arr[i-1])
			{
				return false;
			}
		}
		
		
		return true;

}
}

