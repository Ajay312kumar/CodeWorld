package Array;
 import java.util.Scanner;
public class TakeUserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int[] arr = Takeinput(5);
        display(arr);
	}
	public static int[] Takeinput(int n)
	{ 
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[n];
	    for(int i = 0; i < arr.length; i++)
	    { 
	       arr[i] = sc.nextInt();	
	    }
	    return arr;
	}
	   public static void display(int[] arr)
	   {
		   for(int i = 0; i< arr.length; i++)	   
		   {
			  System.out.println(arr[i]);  
		   }
	   }

}
