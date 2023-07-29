package Array;
  import java.util.Scanner;
public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
			int[] arr = {1,2,3,4};
			int ele = 5;
		System.out.println(linearSearch(arr,ele));

	}
	public static int linearSearch(int[] arr, int ele)
    {
		  for(int i = 0; i< arr.length; i++)
		  {
			  if(arr[i] == ele)
			  {
				 return i;
			  }
		  }
		  return -1;
    }

}
