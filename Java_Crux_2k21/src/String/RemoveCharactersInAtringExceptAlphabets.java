package String;
import java.util.Scanner;
public class RemoveCharactersInAtringExceptAlphabets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String s = sc.next();
		
		s = s.replaceAll("[^a-zA-z]", "");
		System.out.println(s);
	}

}
