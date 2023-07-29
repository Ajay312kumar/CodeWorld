package String;
import java.util.Scanner;
public class RemoveAllWhiteSpacesFromAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String s = sc.next();
		 char[] c = s.toCharArray();
		  StringBuffer sb = new StringBuffer();
		  
		  
		  for (int i = 0; i < c.length; i++) {
		     if( (c[i] != ' ') && (c[i]!= '\t' )) {
		    	 sb.append(c[i]);
		     }    	
	          }
		  System.out.println("String after removing spaces : "+sb);
	}

}
