package Array;
   import java.util.Scanner;
public class FiindMaxEle {

	//private static final String Integar = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
   int[] arr = new int[n];
   for(int i = 0; i <  arr.length; i++)
   {
	   arr[i] = sc.nextInt(); 
   }
   System.out.println(maximum(arr));
	}
	public static int maximum(int[] arr)
	{   
		int max = Integer.MIN_VALUE;
		for(int val : arr)
		{
			max = Math.max(val, max);
		}
		return max;
	}

}
