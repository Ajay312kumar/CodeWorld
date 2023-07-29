
package Recursion;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println(fib(60));
	}
    public static int fib(int n)
    {
    	if(n == 0 || n == 1)
    	{
    		return n;
    	}
    	else
    	{
    		int t = fib(n-1)+fib(n-2);
    		return t;
    	}
    }
}
