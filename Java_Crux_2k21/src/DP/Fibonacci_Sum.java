package DP;

public class Fibonacci_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n= 50;
		System.out.println(fibTD(n, new int[n+1]));
		
	}
 	 
	 public static int fibTD(int n, int[] strg)
	 {
		 if(n == 0 || n == 1)
		 {
		   return n;
		  }
		 
		  if(strg[n] != 0)  // reuse
		  {
			  return strg[n];
		  }
		  
		  	int t = fibTD(n-1, strg);
		  	int t1 = fibTD(n-2, strg);
		    int tn = t+t1;
		    
		    strg[n] = tn; // store
		    
		    
		    return tn;
		   }
		 
		    	 
	 }


