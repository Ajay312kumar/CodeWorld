package Recursion;

public class PrintIncreasingDecreasing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         PID(5);
	}
       public static void PID(int n)
       {
    	   if(n <= 0)
    	   {
    		   return;
    	   }
    	   else
    	   {
    		   PID(n-1);
    		   System.out.println(n);
    		    
    		  
    	   }
    	   
       }
	
}
