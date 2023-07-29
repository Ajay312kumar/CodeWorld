package DP;

public class MazePathDiagonal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 5;
		System.out.println(MPDRecursion(0,0,n,n));
		
	}
	
	public static int MPDRecursion(int cr, int cc, int er, int ec)
	{
		if(cr == er && cc == ec)
		{
			return 1;
		}
		
		if(cr > er && cc > ec)
		{
			return 0;
		}
		
		int ch = MPDRecursion(cr, cc+1, er, ec);
		int cv = MPDRecursion(cr+1, cc, er, ec);
		int cd = MPDRecursion(cr+1, cc+1, er, ec);
		
		return ch+cv+cd;
	}
}
