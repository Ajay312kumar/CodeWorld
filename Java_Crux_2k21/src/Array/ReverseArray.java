package Array;
import java.util.Scanner;
public class ReverseArray {
	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[]= new int[N];
        for(int i = 0; i < N; i++)
        {
            arr[i] = sc.nextInt();
        }
	    reverse(arr);
	   
		for(int i = 0; i < arr.length; i++)
        {
           System.out.print(arr[i]+" ");
        }
	}
    public static void reverse(int[] arr)
    {
        int si = 0;
        int ei = arr.length-1;
        while(si < ei)
        {
            swap(arr,si,ei);
            si++;
            ei--;
        }
    }
    public static void swap(int[] arr,int a,int b)
    {
        int t = arr[a];
        arr[a] = arr[b];
        arr[b] = t;
    }
	 
	 
}
