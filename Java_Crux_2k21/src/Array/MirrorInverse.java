package Array;
import java.util.Scanner;
public class MirrorInverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   int[] arr = new int[n];
   for(int i = 0; i < n; i++)
   {
	   arr[i] = sc.nextInt();
   }
  //  System.out.println(inverse(arr));
	//}
   //public static boolean inverse(int[] arr)
  // {
	//Scanner sc = new Scanner(System.in);
   int[] inv = new int[arr.length];
   for(int i = 0; i < arr.length; i++)
   {
	   inv[arr[i]] =  i;
	  //System.out.println(inv[arr[i]]);
   }
   // System.out.println(inv[i]);
   for(int i = 0; i < arr.length; i++)
   {
	  	  System.out.println(inv[arr[i]]);
   }
     for(int i = 0; i < 1; i++)
     {
    	 if(arr[i] == inv[i])
    	 {
            System.out.println("true");
    	 }
    	 else
    	 {
    		 System.out.println("false");
    	 }
    	
     }
}
}