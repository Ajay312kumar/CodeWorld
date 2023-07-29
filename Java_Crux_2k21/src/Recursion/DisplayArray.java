package Recursion;

public class DisplayArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[] arr = {1,4,2,5,6};
		dis(arr,0);
     
	}
       public static void dis(int[] arr, int id)
       {
    	   if(id == arr.length-1)
    	   {
    		   System.out.println(" "+arr[id]);
    		   return;
    	   }
    	   else
    	   {
    		   System.out.print(" "+arr[id]);
    		   dis(arr,id+1);
    	   }
       }
	
}
