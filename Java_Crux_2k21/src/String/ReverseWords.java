package String;

public class ReverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(Reversword("the sky is blue"));
		System.out.println(Reverse("the sky is blue"));
	}

	public static String Reversword(String str)
	{
		String ans="";
		int j = str.lastIndexOf(' ');
		while(j > 0)
		{
			ans = ans + str.substring(j+1)+" ";
			str = str.substring(0,j);
			j = str.lastIndexOf(' ');
		}
		ans = ans + str.substring(0);
		return ans;
		
	}
	
	  public static String Reverse(String s)
	  {
		  String rs[] = s.split(" ");
		  String ans = "";
		  for(int i = rs.length-1; i >= 0; i--)
		  {
			  ans += rs[i]+" ";
		  }
		  return ans;
	  }
}
