package Array;

import java.util.HashSet;

public class RemoveDuplicateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,2,3,4,5,5,2,3,3,2,1,4};
		
		HashSet<Integer> hs = new HashSet<>();
		
		for(int i = 0; i < arr.length; i++)
		{
			hs.add(arr[i]);
		}
		for(int no : hs)
		{
			System.out.print (no+" ");
		}
		
	}

}
