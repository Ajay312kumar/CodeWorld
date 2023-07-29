package Recursion;

public class ClimbingStair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  System.out.println(stair(5,""));
	}
	public static int stair(int n, String ans)
	{
		if(n < 0)
		{
			return 0;
		}
		if(n == 0)
		{
			System.out.println(ans);
			return 1;
		}
		else
		{
			return stair(n-1, ans+1)+stair(n-2,ans+2);
		}
	}

}
