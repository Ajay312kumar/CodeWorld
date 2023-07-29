package Array;
import java.util.Arrays;
import java.util.Scanner;
public class InsertionSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		int n= sc .nextInt();
		int[] arr=new int[n];
		for(int i=0; i<arr.length; i++)
		{
		    arr[i]=sc.nextInt();
		}
		
		 insertionSort(arr);
		    for(int i = 0; i < arr.length; i++)
		    {
		        System.out.print(arr[i]+" ");
		    }
		}
		public static void insertionSort(int[] arr)
		{
		    for(int i=1; i<arr.length; i++)
		    {
		        insert(arr,i);
		    }
		}
		public static void insert(int[] arr,int n)
		{
		    int temp=arr[n];
		    int pos = 0;
		    for(int i = n-1; i >= 0; i--)
		    {
		        if(temp<arr[i])
		        {
		            arr[i+1]=arr[i];
		        }
		        else
		        {
		            pos=i+1;
		            break;
		        }
		    }
		    arr[pos]=temp;
		}
}
