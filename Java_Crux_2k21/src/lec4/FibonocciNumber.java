package lec4;
import java.util.Scanner;
public class FibonocciNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int nst =1;
      int row = 1;
      int b = 1;
      int val = 0;
      while(row <= n)
      {
    	  int cst = 1;
    	  while(cst <= nst)
    	  {
    		  System.out.print(val+" ");
    		  int c = val + b;
    		  val = b;
    		  b = c;
    		  cst++;
    	  }
    	  nst++;
    	  row++;
    	  System.out.println();
      }
	}

}
