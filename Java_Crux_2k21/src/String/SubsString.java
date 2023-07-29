package String;
//import java.util.Scanner;
public class SubsString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   //    Scanner sc = new Scanner(System.in);
		String s = "code";
   for(int i = 0; i < s.length(); i++)
   {
	   for(int j = i+1; j <= s.length(); j++)
	   {
		   System.out.println(s.substring(i,j));
	   }
   }
	}

}
