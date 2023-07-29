package Sorting;

import java.util.ArrayList;

public class Move_Negative_Towards_End {

//	Given an unsorted array arr[] of size N having both negative and positive integers. The task is place all negative element at the end of array without changing the order of positive element and negative element.
//
//	 
//
//	Example 1:
//
//	Input : 
//	N = 8
//	arr[] = {1, -1, 3, 2, -7, -5, 11, 6 }
//	Output : 
//	1  3  2  11  6  -1  -7  -5
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    int arr[] = {1, -1, 3, 2, -7, -5, 11, 6 };
	    int temp[] = new int[arr.length];
	    int k = 0;
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] > 0 )
			{
				temp[k++] = arr[i];
			}
		}
		
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] < 0)
			{
				temp[k++] = arr[i];
			}
		}
		
		for(int i = 0;  i < arr.length; i++)
		{
		    arr[i] = temp[i];
		}
		for(int i = 0;  i < arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		

	}

}
