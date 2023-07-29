package Recursion;

public class PrintIncreasing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      PI1(5, 10);
	}
        public static void PI1(int n1, int n2)
        {
        	if(n1 > n2)
        	{
        		return;
        	}
        	else
        	{
        		
        	    System.out.print(n1+" ");
        	    PI1(n1+1,n2);
        	}
        }
}
