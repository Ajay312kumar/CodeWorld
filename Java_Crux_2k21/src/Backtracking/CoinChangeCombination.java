package Backtracking;

public class CoinChangeCombination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		coinChange(new int[] {2,3,5,6}, 10, " ", 0);
	}
	
	public static void coinChange(int[] denom, int amount, String ans, int lastDenomidx)
	{
		if(amount == 0)
		{
			System.out.println(ans);
			return;
		}
		for(int i = lastDenomidx; i < denom.length; i++)
		{
		  if(amount >= denom[i])
		  {
			coinChange(denom, amount-denom[i], ans+denom[i], i);
		  }
	    }

    }
}