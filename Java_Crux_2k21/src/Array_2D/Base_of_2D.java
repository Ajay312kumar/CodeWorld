package Array_2D;
import java.util.Scanner;
public class Base_of_2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc = new Scanner(System.in);
		int[][] arr = new int[3][2];
		
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[0][0]);
		System.out.println(arr[0].length);
		System.out.println(arr.length);
		
	System.out.println("enter the value");	
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[0].length; j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[0].length; j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("display using each for loop");
		
		for(int[] val : arr)
		{
			for(int i : val)
			{
	     		System.out.print(i+" ");
     		 }
		  System.out.println();
     	}
	}
   }
