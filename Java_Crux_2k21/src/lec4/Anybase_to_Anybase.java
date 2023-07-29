package lec4;
import java.util.Scanner;
public class Anybase_to_Anybase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
   // int n = sc.nextInt();
    int b1 = sc.nextInt();
    int b2 = sc.nextInt();
    int n = sc.nextInt();
    int d = getvalue(n,b1,b2);
    System.out.println(d);
	}
      public static int getvalue(int n,int b1,int b2)
      {
    	  int dec = getindecimal(n,b1);
    	  int dn = getbase(dec, b2);
    	  return dn;
      }
      public static int getindecimal(int n,int b)
      {
    	  int rv = 0, p = 1;
    	  while(n > 0)
    	  {
    		  int dig = n % 10;
    		  n = n / 10;
    		  rv += dig * p;
    		  p = p * b;
    	  }
    	  return rv;
      }
              
      public static int getbase(int n, int b)
      {
    	  int rv = 0, p = 1;
    	  while(n > 0)
    	  {
    		  int dig = n % b;
    		  n = n / b;
    		  rv += dig * p;
    		  p = p * 10;
    	  }
    	  return rv;
    	  
    }
         
}
