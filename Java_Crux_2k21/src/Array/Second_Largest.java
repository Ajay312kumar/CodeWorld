package Array;

public class Second_Largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {3,6,4,8,9,2};
		
		int max1 , max2;
		max1 = max2 = arr[0];
		for(int i = 1; i < arr.length; i++)
		{
			if(arr[i] > max1)
			{
				max2 = max1;
				max1 = arr[i];
			}
			else if(arr[i] > max2 )
			{
				max2  = arr[i];
			}
			
		}
		System.out.println("the value of max1 is="+ max1+  " the value of max2 is= "+  max2);
	}

}
