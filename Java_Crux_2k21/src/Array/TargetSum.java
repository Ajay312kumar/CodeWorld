package Array;

public class TargetSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,2,3,6,7,9};
		
		//BubbleSort(arr);
		System.out.println("target sum is:");
		Targetsum(arr, 10);
	}

	
	 public static void BubbleSort(int[] a)
	  {
		  for(int i = 0; i < a.length-1; i++)
		  {
			  for(int j = i+1; j < a.length-1; j++)
			  {
				  if(a[i] > a[j+1])
				  {
					  int temp = a[i];
					  a[i] = a[j+1];
					  a[j+1] = temp;
				  }
			  }
		  }
		  for(int i = 0; i < a.length; i++)
		  {
			  System.out.print(a[i]+" ");
		  }
	  }
	 
	 public static void Targetsum(int[] ar ,int n)
	 {
		 for(int i = 0; i < ar.length; i++)
		 {
			 for(int j = 0; j < ar.length; j++)
			 {
				 for(int k = 0; k < ar.length; k++)
				 {
					 if(n == (k+j+ar[i]))
					 {
						 System.out.println(k+" "+j+ " "+ar[i]);
					 }
				 }
			 }
		 }
	 }
	 
	 
	 
	 
}
