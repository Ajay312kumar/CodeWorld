package Array;
  import java.util.Scanner;
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the no. of element");
      int n = sc.nextInt();
      int[] arr = new int[n];
    
      for( int  i = 0; i < n; i++)
      {
    	  arr[i] = sc.nextInt();
     
      }
		  for(int i = 0; i < arr.length; i++)
		  {
			  for(int j = i+1; j < arr.length-1; j++)
			  {
				  if(arr[j] < arr[i])
				  {
					  int temp = arr[i];
					  arr[i] = arr[j];
					  arr[j] = temp;
				  }
			  }
		  }
		  for(int i = 0; i < arr.length; i++)
		  {
			  System.out.print(arr[i]+" ");
		  }
	  }

}
