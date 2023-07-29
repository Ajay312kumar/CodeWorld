package Array;

public class CountEvenAndOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int[] a = {12,3,5,6,2,4};
   int[] even = new int[a.length];
   int[] odd = new int[a.length];
   int e = 0;
   int o = 0;
   int j = 0;
   int k = 0;
   for(int i = 0; i < a.length; i++)
   {
	   if(a[i] % 2 == 0)
	   {
		   e++;
		   even[k] = a[i];
		   k++;
	   }
	   else
	   {
		   o++;
		   odd[j] = a[i];
		   j++;
	   }
   }
       System.out.println("Number of even are: "+e + " :"+" Number of odd are: "+ o);
   
        System.out.println("even elements are:");
        for(int i = 0; i < e; i++)
        {
        	System.out.print(even[i]+" ");
        }
     System.out.println();
        System.out.println("odd elements are:");
        for(int i = 0; i < o; i++)
        {
        	System.out.print(odd[i]+" ");
        }
	} 

}
