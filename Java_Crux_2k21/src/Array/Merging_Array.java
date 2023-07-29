package Array;

import java.util.Arrays;

public class Merging_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=0;
        System.out.println("the first array is=");
        int ar1[] = {1, 12, 15, 26, 38};
        for(int a = 0; a < ar1.length; a++)
        {
        	System.out.print(ar1[a]+" ");
        }
        System.out.println();
        System.out.println("the second array is=");
        int ar2[] = {2, 13, 17, 30, 45,46};
        for(int b = 0; b < ar1.length; b++)
        {
        	System.out.print(ar2[b]+" ");
        }
        System.out.println();
        int[] arr3 = new int[ar1.length+ar2.length];
         
        int i = 0;
        int j = 0;
        int k=0;
        while(i<ar1.length && j<ar2.length)
        {
        	if(ar1[i]<ar2[j])
        	{
        		arr3[k++] = ar1[i];
        		i++;
        	}
        	else
        	{
        		arr3[k++] = ar2[j];
        		j++;
        	}
        }
        while(i<ar1.length)
        {
        	arr3[k++] = ar1[i];
        	i++;
        }
        while(j<ar2.length)
        {
        	arr3[k++] = ar2[j];
        	j++;
        }
        System.out.println("After merging the array");
       for(int r = 0; r < arr3.length; r++)
       {
    	   System.out.print(arr3[r]+" ");
       }
        System.out.println();
       int mid = arr3.length/2;
       if(mid%2==0) 
       {
    	   System.out.println(arr3[mid]);
       }
       else
       {
    	   int m = (mid+mid+1)/2;
    	   System.out.println(arr3[m]);
       }
       
	}

}
