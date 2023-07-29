package Array;

public class findingRepeatingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {12,12,2,3,3,35,6,2,4};
		   int[] b = new int[a.length];
           int k = 0;
           int num = 0;
		   for(int i = 0; i < a.length; i++)
		   {
			   for(int j = i+1; j < a.length; j++)
			   {
				   if(a[i] == a[j])
				   {   
					   num++;
					   b[k] = a[j];
					   k++;   
				   }
			   }
		   }
		   System.out.println("Repeating elements are:");
		   for(int i = 0; i < num; i++)
		   {
			   System.out.print(b[i]+" ");
		   }
	
	}

}
