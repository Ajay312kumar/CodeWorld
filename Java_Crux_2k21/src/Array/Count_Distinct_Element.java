package Array;
//Count distinct element in an array
//In this section, we will learn, how to print the Count distinct element in an array in java language.
//
//Given an integer array, we have to print all the distinct element of the input array. input array may contain duplicate elements, we have to print one element only once.
//
//Example
//input: a[]={10,20,10,9,6,2,6,20}
//
//Output:  5
//they are  10,20,9,6,2

public class Count_Distinct_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int res = 1;
		int a[]={10,20,10,9,6,2,6,20};
		for(int i = 1; i < a.length; i++)
		{
			
				if(a[i] != a[res-1])
				{
					a[res++] = a[i];
				}
			
		}
		for(int i = 0; i < a.length; i++)
		{
			System.out.println(a[i]+" ");
		}
		

	}

}
