package Backtracking;

public class QueenPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		boolean[] board = new boolean[4];
		qp(board, 0, 2, "");
		
	}
	public static void qp(boolean[] board, int qpsf, int tq, String ans)
	{
		if(qpsf == tq)
		{
			System.out.println(ans);
		}
		else
		{
			for(int i = 0; i < board.length; i++)
			{
				if(board[i] == false)
				{
					board[i] = true;
					qp(board, qpsf+1, tq, ans+"q"+qpsf+" b"+i+" ");
					board[i] = false; // backtracking
				}
			}
		}
	}

}
