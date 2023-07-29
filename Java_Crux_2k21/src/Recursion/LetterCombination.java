package Recursion;
//import java.util.Scanner;
public class LetterCombination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   //Scanner sc = new Scanner(System.in);
  // String n = sc.nextLine();
   keypadcomb("23","");
	}
	public static String[] map = {""," ","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
     public static void keypadcomb(String ques,String ans)
     {
    	 if(ques.length() == 0)
    	 {
    		 System.out.println(ans);
    	 }
    	 else
    	 {    
    		// int count = 0;
    		 char ch = ques.charAt(0);
    		 String st = map[ch-'0'];
    		 for(int i = 0;i < st.length(); i++)
    		 {
    		 	 keypadcomb(ques.substring(1),ans+st.charAt(i)); 
    		 }
    	 }
     }
}
