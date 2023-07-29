package Recursion;
import java.util.Scanner;
public class FirstOccurenceOfEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
  int[] arr = new int[n];
  for(int i = 0; i < arr.length; i++)
  {
	  arr[i] = sc.nextInt();
  }
  int ele = sc.nextInt();
  System.out.println(foc(arr, 0, ele));
	}
       public static int foc(int[] arr, int id, int ele)
       {
    	   if(id == arr.length)
    	   {
    		   return -1;
    	   }
    	   else
    	   {
    		   if(ele == arr[id])
    			  return id;
    		   else
    			   return foc(arr,id+1,ele);
    	   }
       }
}
