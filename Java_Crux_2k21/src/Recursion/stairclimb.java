package Recursion;

public class stairclimb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stair(0, 5, "");
	}

	public static void stair(int curr, int n, String ans)
	{
		if(curr == n)
		{
			System.out.println(ans);
			return;
		}
		
		if(curr > n)
		{
			return;
		}
		
		stair(curr+1, n, ans+1);
		stair(curr+2, n, ans+2);
		stair(curr+3, n, ans+3);
	}
	
	
}
