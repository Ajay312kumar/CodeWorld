package Recursion;
import java.util.Scanner;
public class TossCoins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   System.out.println(cointoss(n,""));
	}
       public static int cointoss(int n,String ans)
       {
    	   if(n == 0)
    	   {
    		   System.out.println(ans);
    		   return 1;
    	   }
    	   else
    	   {
    		 int count = 0;
    		 count += cointoss(n-1,ans+"H");
    		 count += cointoss(n-1,ans+"T");
    		 return count;
    	   }
       }
      
}













