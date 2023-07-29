package String;
import java.util.Scanner;
public class palindronecheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("enter string:");
		String s =  sc.next();
		String ans = "";
		for(int i = s.length()-1; i >= 0; i--)
		{
			ans = ans + s.charAt(i); 
		}
		if(ans == s)
		{
			System.out.println("palindrone  number is");
		}
		else
		{
		System.out.println("Plaindrone number is not");
		
		}
		}

}
