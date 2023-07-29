package Array;
import java.util.Scanner;
public class FindLargestPalindromeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc = new Scanner(System.in);
   System.out.println("enter the size of Array");
   int size = sc.nextInt();
   int[] arr = new int[size];
   System.out.println("enter the elements");
   for(int i =0; i < arr.length; i++)
   {
	   arr[i] = sc.nextInt();
   }
   int large = longest(arr);
   if(large == -1)
   {
	   System.out.println("there is no palindrome");
   }
   else 
   {
	   System.out.println(" longest palindrome in this array"+large);
   }
	}
	
	public static boolean isPalindrome(int n)
	{
		int number, rem, reverse = 0;
		number = n;
		while(n != 0)
		{
			rem = n / 10;
			reverse =  reverse * 10 + rem;
			n = n/ 10;
		}
		if(number == reverse)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static int longest(int[] arr)
	{
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = i+1; j < arr.length; i++)
			{
				if(arr[i] > arr[j])
				{
					int temp = arr[i];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		for(int i = arr.length-1; i >= 0; --i)
		{
			if(isPalindrome(arr[i]))
			{
				return arr[i];
			}
	    }
		return -1;
	
	}
}

