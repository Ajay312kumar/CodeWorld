package Array;
import java.util.Arrays;
import java.util.Scanner;
public class ProductOfArrayExceptSelf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt( );
     int[] arr = new int[n];
     for(int i=0; i<arr.length; i++)
		{
		    arr[i]=sc.nextInt();
		}
     int prod = 1;
     int[] lp = new int[arr.length];
     for(int i = 0; i < lp.length; i++)
     {
    	 lp[i] = prod;
    	 prod *= arr[i];
     }
       System.out.println(Arrays.toString(lp));
       
       int[] rp = new int[arr.length];
        prod = 1;
       for(int i = arr.length-1; i >= 0;i--)
       {
    	  rp[i] = prod;
    	  prod *= arr[i];
       }
       System.out.println(Arrays.toString(rp));
       
       int[] ans = new int[arr.length]; 
       for(int i = 0; i < lp.length; i++)
       {
    	   ans[i] = lp[i]*rp[i];
       }
       
       System.out.println(Arrays.toString(ans));
	}

}
