package Array;
 import java.util.Scanner;
public class ArrayInvTrue_False {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++)
		{
		    arr[i]=sc.nextInt();
		}
		if(ismirrorinverse(arr))
		System.out.println("true");
		else
		System.out.println("false");
		    }
		public static boolean ismirrorinverse(int arr[])
		{
		for(int i=0; i<arr.length; i++)
		{
		   // inv[arr[i]]=i;
		    if(arr[arr[i]]!=i)
		    return false;
		}
		return true;
		           }
	}


