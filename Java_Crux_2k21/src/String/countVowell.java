package String;
  import java.util.Scanner;
public class countVowell {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string:");
		String s = sc.next();
	//	char[] ch = s.toCharArray();
		int vowell  = 0;
		for(int i = 0; i < s.length(); i++)
		{
			if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i)== 'u')
			{
				vowell++;
			}
		}
			System.out.println(vowell);
		}
	}


