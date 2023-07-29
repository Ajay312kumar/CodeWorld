package Recursion;
import java.util.Scanner;
public class TrickyPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		String s = sc.next();
		if(s.length() <= 8)
		trickypermutations(s, "");
	 
	}
	
	public static void trickypermutations(String ques,String ans)
	{
		if(ques.length() == 0)
		{
			System.out.println(ans);
		}
		else
		{
			for(int i = 0; i < ques.length(); i++)
			{
				boolean flag = true;
				for(int j = 0; j < i; j++)
				{
					if(ques.charAt(j) == ques.charAt(i))
					{
						flag = false;
						break;
					}
				}
				
				if(flag) {
					String nq = ques.substring(0,i)+ques.substring(i+1);
					trickypermutations(nq, ans+ques.charAt(i));
				}
			}
		}
	}
}

