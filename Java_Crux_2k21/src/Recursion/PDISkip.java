package Recursion;
import java.util.Scanner;
public class PDISkip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
		PDI(n);
	}

	public static void PDI(int n)
	{
		if(n == 0)
		{
			return;
		}
		if(n % 2 != 0)
		{
			System.out.println(n);
		}
		
		PDI(n-1);
		if(n % 2 == 0)
		{
			System.out.println(n);
		}
	}
	
}
