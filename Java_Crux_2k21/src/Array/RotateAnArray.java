 package Array;
import java.util.Scanner;
public class RotateAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    int input = sc.nextInt();
    int[] inArray = new int[input];
    for(int i = 0; i < inArray.length; i++)
    {
    	inArray[i] = sc.nextInt();
    }	
    	int rotate = sc.nextInt();
    	rotate %= input;
    	for(int i = 1; i <= rotate; i++)
    	{
    	   int temp = inArray[inArray.length-1];
    	   for(int j = inArray.length-1; j> 0; j--)
    	   {
    		   inArray[j] = inArray[j-1];
    	   }
    	   inArray[0] = temp;
    	}
    	for(int ar : inArray)
    	{
    		System.out.println(ar);
    	}
    	}
    }
	


