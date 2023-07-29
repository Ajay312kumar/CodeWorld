package Recursion;

import java.util.Arrays;

public class Merge_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int[]  a = {1,4,5};
//		int[]  b = {2,3,6,7};
//		int[] c = merge(a,b);
//		System.out.println(Arrays.toString(c));
//		
		int[] arr = {4,2,5,3,2,6,4};
		int[] sorted = merge_sort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(sorted));
		
	}

	public static int[] merge(int[] a, int[] b)
	{
		int i,j,k;
		i = j = k = 0;
		int[]  res = new int[a.length + b.length];
		while( i < a.length && j < b.length)
		{
			if(a[i] < b[j])
			{
		       	res[k]	= a[i];
		       	i++;
		       	k++;
			}
			else
			{
				res[k] = b[j];
				j++;
				k++;
				
			}
		}
			while( j < b.length )
			{
				res[k] = b[j];
				j++;
				k++;
			}
			while( i < a.length )
			{
				res[k] = a[i];
				i++;
				k++;
				
			}
		
		return res;
	}
	
	public static int[] merge_sort(int[] arr, int si, int ei)
	{
		if(si > ei)
		{
			int[] ans = new int[0];
			return ans;
		}
		
		else if(si == ei)
		{
			int[] ans = new int[1];
			ans[0] = arr[si];
			return ans;
		}
		else
		{
		int mid = (si+ei)/2;
		int[] a = merge_sort(arr, si, mid);
		int[] b = merge_sort(arr, mid+1, ei);
		return merge(a,b);
		
	   }
	}
}
