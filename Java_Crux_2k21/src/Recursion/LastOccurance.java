package Recursion;
import java.util.Scanner;
public class LastOccurance {

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
      
      
      System.out.println(LOC(arr,2,ele,-1));
	}
	  public static int LOC(int[] arr,int id,int ele,int ans)
	  {
		  if(id == arr.length)
		  {
			  return ans;
		  }
		  else
		  {
			  if(arr[id] == ele)
				  ans = id;
			  return LOC(arr,id+1,ele,ans);
		  }
	  }
}
