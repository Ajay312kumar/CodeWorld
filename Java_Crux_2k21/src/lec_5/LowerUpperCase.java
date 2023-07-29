package lec_5;
  import java.util.Scanner;
public class LowerUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc = new Scanner(System.in);
   char ch = sc.next().charAt(0);
   int i = ch;
   if(i >= 'a' && i <= 'z')
   {
	   System.out.println("LowerCase");
   }
   else
   {
	   System.out.println("Uppercase");
   }
   
	}

}
