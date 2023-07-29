package Recursion;

public class Permutation {

	public static void main(String[] args) {
//		 TODO Auto-generated method stub
      permutation2("abcd", "");
	}

	public static void permutation(String ques, String ans)
	{
		if(ques.length() == 0)
		{
			System.out.println(ans);
		}
		else
		{
			char ch = ques.charAt(0);
			for(int i = 0; i <= ans.length(); i++)
			{
				String na = ans.substring(0,i)+ch+ans.substring(i);
			permutation(ques.substring(1), na);
			}
		}
	}
   	
  public static void permutation2(String ques, String ans)
	{
		if(ques.length() == 0)
		{
			System.out.println(ans);
		}
		else
		{
			for(int i = 0; i < ques.length(); i++)
			{
				String nq = ques.substring(0,i)+ques.substring(i+1);
				permutation2(nq, ans+ques.charAt(i));
				
		}
	}
	}
}
	
	

